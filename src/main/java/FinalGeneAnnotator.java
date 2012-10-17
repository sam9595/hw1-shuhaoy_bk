import java.util.Iterator;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.tutorial.DateAnnot;
import org.apache.uima.tutorial.RoomNumber;
import org.apache.uima.tutorial.TimeAnnot;
public class FinalGeneAnnotator extends JCasAnnotator_ImplBase{
	  public void initialize(UimaContext aContext) throws ResourceInitializationException {
		    super.initialize(aContext);
		    // Get config. parameter value
	  }
	  public void process(JCas aJCas) {
		    // get annotation indexes
		    FSIndex GeneIndex = aJCas.getAnnotationIndex(Gene.type);
		    FSIndex NonGenePatternIndex = aJCas.getAnnotationIndex(NonGenePattern.type);
		    /*This is the final annotator, which use GeneAnnotator and NonGenePatternAnnotator as intermediate annotator.
		     * Then in this annotater, based on GeneAnnotator's result, deleting some patterns which is not the pattern
		     */
		    
		    Iterator<Gene> Geneiter = GeneIndex.iterator();
		    while (Geneiter.hasNext()) { //For every annotation we get in GeneAnnotater
		      Gene Ganno = (Gene) Geneiter.next();
		      String strG = Ganno.getCoveredText();
		      Iterator NonGenePIter = NonGenePatternIndex.iterator();
		      Boolean Cflag = false;
		     
		      while (NonGenePIter.hasNext()) { //For every annotation which is not gene pattern
		        NonGenePattern NGanno = (NonGenePattern) NonGenePIter.next();
		        String strNG = NGanno.getCoveredText();
		        if(strG.toLowerCase().contains(strNG.toLowerCase())){	//if gene we extracted has some NOT gene pattern
		        	Cflag = true;
		        	break;
		        }
		      }
		      if(Cflag == true){
		    	  break;
		      }
		      else{
		    	  FinalGene a = new FinalGene(aJCas);
		    	  a.setBegin(Ganno.getBegin());
		    	  a.setEnd(Ganno.getEnd());
		    	  a.setSenID(Ganno.getSenID());
		    	  a.setGenStart(Ganno.getGenStart());
		    	  a.setGenEnd(Ganno.getGenEnd());
		    	  a.addToIndexes();
		      }
		    }
		    
	  }
}
