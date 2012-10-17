
/* First created by JCasGen Tue Oct 16 00:03:47 EDT 2012 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Oct 17 19:03:21 EDT 2012
 * @generated */
public class Gene_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Gene_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Gene_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Gene(addr, Gene_Type.this);
  			   Gene_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Gene(addr, Gene_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Gene.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Gene");
 
  /** @generated */
  final Feature casFeat_GenStart;
  /** @generated */
  final int     casFeatCode_GenStart;
  /** @generated */ 
  public int getGenStart(int addr) {
        if (featOkTst && casFeat_GenStart == null)
      jcas.throwFeatMissing("GenStart", "Gene");
    return ll_cas.ll_getIntValue(addr, casFeatCode_GenStart);
  }
  /** @generated */    
  public void setGenStart(int addr, int v) {
        if (featOkTst && casFeat_GenStart == null)
      jcas.throwFeatMissing("GenStart", "Gene");
    ll_cas.ll_setIntValue(addr, casFeatCode_GenStart, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GenEnd;
  /** @generated */
  final int     casFeatCode_GenEnd;
  /** @generated */ 
  public int getGenEnd(int addr) {
        if (featOkTst && casFeat_GenEnd == null)
      jcas.throwFeatMissing("GenEnd", "Gene");
    return ll_cas.ll_getIntValue(addr, casFeatCode_GenEnd);
  }
  /** @generated */    
  public void setGenEnd(int addr, int v) {
        if (featOkTst && casFeat_GenEnd == null)
      jcas.throwFeatMissing("GenEnd", "Gene");
    ll_cas.ll_setIntValue(addr, casFeatCode_GenEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SenID;
  /** @generated */
  final int     casFeatCode_SenID;
  /** @generated */ 
  public String getSenID(int addr) {
        if (featOkTst && casFeat_SenID == null)
      jcas.throwFeatMissing("SenID", "Gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SenID);
  }
  /** @generated */    
  public void setSenID(int addr, String v) {
        if (featOkTst && casFeat_SenID == null)
      jcas.throwFeatMissing("SenID", "Gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_SenID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GeneName;
  /** @generated */
  final int     casFeatCode_GeneName;
  /** @generated */ 
  public String getGeneName(int addr) {
        if (featOkTst && casFeat_GeneName == null)
      jcas.throwFeatMissing("GeneName", "Gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneName);
  }
  /** @generated */    
  public void setGeneName(int addr, String v) {
        if (featOkTst && casFeat_GeneName == null)
      jcas.throwFeatMissing("GeneName", "Gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Gene_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_GenStart = jcas.getRequiredFeatureDE(casType, "GenStart", "uima.cas.Integer", featOkTst);
    casFeatCode_GenStart  = (null == casFeat_GenStart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GenStart).getCode();

 
    casFeat_GenEnd = jcas.getRequiredFeatureDE(casType, "GenEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_GenEnd  = (null == casFeat_GenEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GenEnd).getCode();

 
    casFeat_SenID = jcas.getRequiredFeatureDE(casType, "SenID", "uima.cas.String", featOkTst);
    casFeatCode_SenID  = (null == casFeat_SenID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SenID).getCode();

 
    casFeat_GeneName = jcas.getRequiredFeatureDE(casType, "GeneName", "uima.cas.String", featOkTst);
    casFeatCode_GeneName  = (null == casFeat_GeneName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneName).getCode();

  }
}



    