import java.io.IOException;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.tutorial.RoomNumber;
import org.apache.uima.util.Level;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.chunk.NBestChunker;
import com.aliasi.util.AbstractExternalizable;
import com.aliasi.util.ScoredObject;
public class NonGenePatternAnnotator extends JCasAnnotator_ImplBase{
	private Pattern[] mPatterns;
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
		    String[] gPatternStrings = (String[]) aContext.getConfigParameterValue("ngPattern");		    
		    mPatterns = new Pattern[gPatternStrings.length];
		    // compile regular expressions
		    for (int i = 0; i < gPatternStrings.length; i++) {
		        try {
		          System.out.println(gPatternStrings[i]);
		          mPatterns[i] = Pattern.compile(gPatternStrings[i]);
		        } catch (PatternSyntaxException e) {
		        }
		      }		    

	}
	public void process(JCas aJCas){
		String docText = aJCas.getDocumentText();

		//For every non-gene pattern found in the text  
	    for (int i = 0; i < mPatterns.length; i++) {
	        Matcher matcher = mPatterns[i].matcher(docText);
	        while (matcher.find()) {
	          NonGenePattern annotation = new NonGenePattern(aJCas);
	          annotation.setBegin(matcher.start());
	          annotation.setEnd(matcher.end());
	          annotation.addToIndexes();
	        }
	      }
	}
}
