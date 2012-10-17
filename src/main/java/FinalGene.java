

/* First created by JCasGen Wed Oct 17 17:13:28 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Oct 17 19:03:21 EDT 2012
 * XML source: /home/shuhaoyu/workspace/hw1-shuhaoy/src/main/resources/descriptor/GenecasConsumer.xml
 * @generated */
public class FinalGene extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FinalGene.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected FinalGene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public FinalGene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public FinalGene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public FinalGene(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: SenID

  /** getter for SenID - gets 
   * @generated */
  public String getSenID() {
    if (FinalGene_Type.featOkTst && ((FinalGene_Type)jcasType).casFeat_SenID == null)
      jcasType.jcas.throwFeatMissing("SenID", "FinalGene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FinalGene_Type)jcasType).casFeatCode_SenID);}
    
  /** setter for SenID - sets  
   * @generated */
  public void setSenID(String v) {
    if (FinalGene_Type.featOkTst && ((FinalGene_Type)jcasType).casFeat_SenID == null)
      jcasType.jcas.throwFeatMissing("SenID", "FinalGene");
    jcasType.ll_cas.ll_setStringValue(addr, ((FinalGene_Type)jcasType).casFeatCode_SenID, v);}    
   
    
  //*--------------*
  //* Feature: GenStart

  /** getter for GenStart - gets 
   * @generated */
  public int getGenStart() {
    if (FinalGene_Type.featOkTst && ((FinalGene_Type)jcasType).casFeat_GenStart == null)
      jcasType.jcas.throwFeatMissing("GenStart", "FinalGene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((FinalGene_Type)jcasType).casFeatCode_GenStart);}
    
  /** setter for GenStart - sets  
   * @generated */
  public void setGenStart(int v) {
    if (FinalGene_Type.featOkTst && ((FinalGene_Type)jcasType).casFeat_GenStart == null)
      jcasType.jcas.throwFeatMissing("GenStart", "FinalGene");
    jcasType.ll_cas.ll_setIntValue(addr, ((FinalGene_Type)jcasType).casFeatCode_GenStart, v);}    
   
    
  //*--------------*
  //* Feature: GenEnd

  /** getter for GenEnd - gets 
   * @generated */
  public int getGenEnd() {
    if (FinalGene_Type.featOkTst && ((FinalGene_Type)jcasType).casFeat_GenEnd == null)
      jcasType.jcas.throwFeatMissing("GenEnd", "FinalGene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((FinalGene_Type)jcasType).casFeatCode_GenEnd);}
    
  /** setter for GenEnd - sets  
   * @generated */
  public void setGenEnd(int v) {
    if (FinalGene_Type.featOkTst && ((FinalGene_Type)jcasType).casFeat_GenEnd == null)
      jcasType.jcas.throwFeatMissing("GenEnd", "FinalGene");
    jcasType.ll_cas.ll_setIntValue(addr, ((FinalGene_Type)jcasType).casFeatCode_GenEnd, v);}    
  }

    