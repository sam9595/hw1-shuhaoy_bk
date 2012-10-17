import java.io.IOException;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.chunk.NBestChunker;
import com.aliasi.util.AbstractExternalizable;
import com.aliasi.util.ScoredObject;
public class GeneAnnotator extends JCasAnnotator_ImplBase{
	private Pattern mSentenceID;
	private int CalculateNonSpace(int loc, String str){
		int IDlength = 14;
		int count = 0;
		for(int i = IDlength ; i < loc-1; i++){
			if(str.charAt(i)!=' ')
				count++;
		}
		return count;
	}
	public void initialize(UimaContext aContext) throws ResourceInitializationException {
		    super.initialize(aContext);
		    // Get config. parameter values
		    String[] SentenceIDStrings = (String[]) aContext.getConfigParameterValue("SentenceID");		    

		    // compile regular expressions
		    mSentenceID = Pattern.compile(SentenceIDStrings[0]);
		    //for (int i = 0; i < SentenceIDStrings.length; i++) {
		    //	mSentenceID[i] = Pattern.compile(SentenceIDStrings[i]);
		    //}
	}
	public void process(JCas aJCas){
		String docText = aJCas.getDocumentText();
		PosTagNamedEntityRecognizer GeneTagRec;
		int offset_cumu = 0;
		String[] lines = docText.split(System.getProperty("line.separator"));
		File modelFile = new File("src/ne-en-bio-genetag.HmmChunker");
		Chunker chunker = null;
		Chunking chunking;
		Chunk[] Chunkarray;
		try {
			chunker = (Chunker) AbstractExternalizable.readObject(modelFile);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0 ; i < lines.length ;i++){		
			String senID = null;
			Matcher matcher = mSentenceID.matcher(lines[i]);			
			if(matcher.find()){
				senID = lines[i].substring(matcher.start(),matcher.end());
			}			
							
			chunking  = chunker.chunk(lines[i]);
			Chunkarray = chunking.chunkSet().toArray(new Chunk[0]);
			for(int j = 0 ; j < Chunkarray.length; j++){
				if(Chunkarray[j].start() == 0)
					continue;
				Gene geneA = new Gene(aJCas);
				geneA.setSenID(senID);
				geneA.setBegin(Chunkarray[j].start() + offset_cumu);
				geneA.setEnd(Chunkarray[j].end() + offset_cumu);
				geneA.setGenStart(CalculateNonSpace(Chunkarray[j].start(),lines[i]));
				geneA.setGenEnd(CalculateNonSpace(Chunkarray[j].end(),lines[i]));
				geneA.addToIndexes();												
			}
			offset_cumu += lines[i].length()+1;
		}
		
		
		


	}
/*	public void process(JCas aJCas) {
		String docText = aJCas.getDocumentText();
		//BufferedReader reader = new BufferedReader(new StringReader(docText));
		PosTagNamedEntityRecognizer GeneTagRec;
		String[] lines = docText.split(System.getProperty("line.separator"));
		int offset_cumu = 0;
		try {
			GeneTagRec = new PosTagNamedEntityRecognizer();
			Integer key = 1;
			Map<Integer, Integer> begin2end;
			for(int i = 0 ; i < 3; i++){
				//System.out.println(lines[i]);
				Matcher matcher = mSentenceID.matcher(lines[i]);
				String senID = null;
				if(matcher.find()){
					senID = lines[i].substring(matcher.start(),matcher.end());
				}
				begin2end = GeneTagRec.getGeneSpans(lines[i]);
				Iterator iter = begin2end.keySet().iterator();
				while(iter.hasNext()){
					key = (Integer)iter.next();
					System.out.print(key.toString() + " " + begin2end.get(key).toString());
					System.out.println(lines[i].substring(key,begin2end.get(key)));
					Gene geneA = new Gene(aJCas);
					geneA.setSenID(senID);
					geneA.setBegin(key.intValue() + offset_cumu);
					geneA.setEnd(begin2end.get(key).intValue() + offset_cumu);
					geneA.setGenStart(CalculateNonSpace(key.intValue(),lines[i]));
					geneA.setGenEnd(CalculateNonSpace(begin2end.get(key).intValue(),lines[i]));
					geneA.addToIndexes();
				}
				offset_cumu += lines[i].length()+1;
//				System.out.println(lines[i]);				
			}
		} catch (ResourceInitializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	*/
}
