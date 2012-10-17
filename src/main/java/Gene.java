

/* First created by JCasGen Tue Oct 16 00:03:47 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Oct 17 19:03:21 EDT 2012
 * XML source: /home/shuhaoyu/workspace/hw1-shuhaoy/src/main/resources/descriptor/GenecasConsumer.xml
 * @generated */
public class Gene extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gene.class);
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
  protected Gene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Gene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Gene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Gene(JCas jcas, int begin, int end) {
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
  //* Feature: GenStart

  /** getter for GenStart - gets 
   * @generated */
  public int getGenStart() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_GenStart == null)
      jcasType.jcas.throwFeatMissing("GenStart", "Gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Gene_Type)jcasType).casFeatCode_GenStart);}
    
  /** setter for GenStart - sets  
   * @generated */
  public void setGenStart(int v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_GenStart == null)
      jcasType.jcas.throwFeatMissing("GenStart", "Gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Gene_Type)jcasType).casFeatCode_GenStart, v);}    
   
    
  //*--------------*
  //* Feature: GenEnd

  /** getter for GenEnd - gets 
   * @generated */
  public int getGenEnd() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_GenEnd == null)
      jcasType.jcas.throwFeatMissing("GenEnd", "Gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Gene_Type)jcasType).casFeatCode_GenEnd);}
    
  /** setter for GenEnd - sets  
   * @generated */
  public void setGenEnd(int v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_GenEnd == null)
      jcasType.jcas.throwFeatMissing("GenEnd", "Gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Gene_Type)jcasType).casFeatCode_GenEnd, v);}    
   
    
  //*--------------*
  //* Feature: SenID

  /** getter for SenID - gets 
   * @generated */
  public String getSenID() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_SenID == null)
      jcasType.jcas.throwFeatMissing("SenID", "Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_SenID);}
    
  /** setter for SenID - sets  
   * @generated */
  public void setSenID(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_SenID == null)
      jcasType.jcas.throwFeatMissing("SenID", "Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_SenID, v);}    
   
    
  //*--------------*
  //* Feature: GeneName

  /** getter for GeneName - gets 
   * @generated */
  public String getGeneName() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_GeneName);}
    
  /** setter for GeneName - sets  
   * @generated */
  public void setGeneName(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_GeneName, v);}    
  }

    