

/* First created by JCasGen Wed Oct 17 14:06:56 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Oct 17 19:03:21 EDT 2012
 * XML source: /home/shuhaoyu/workspace/hw1-shuhaoy/src/main/resources/descriptor/GenecasConsumer.xml
 * @generated */
public class NonGenePattern extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NonGenePattern.class);
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
  protected NonGenePattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NonGenePattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NonGenePattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NonGenePattern(JCas jcas, int begin, int end) {
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
    if (NonGenePattern_Type.featOkTst && ((NonGenePattern_Type)jcasType).casFeat_GenStart == null)
      jcasType.jcas.throwFeatMissing("GenStart", "NonGenePattern");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NonGenePattern_Type)jcasType).casFeatCode_GenStart);}
    
  /** setter for GenStart - sets  
   * @generated */
  public void setGenStart(int v) {
    if (NonGenePattern_Type.featOkTst && ((NonGenePattern_Type)jcasType).casFeat_GenStart == null)
      jcasType.jcas.throwFeatMissing("GenStart", "NonGenePattern");
    jcasType.ll_cas.ll_setIntValue(addr, ((NonGenePattern_Type)jcasType).casFeatCode_GenStart, v);}    
   
    
  //*--------------*
  //* Feature: GenEnd

  /** getter for GenEnd - gets 
   * @generated */
  public int getGenEnd() {
    if (NonGenePattern_Type.featOkTst && ((NonGenePattern_Type)jcasType).casFeat_GenEnd == null)
      jcasType.jcas.throwFeatMissing("GenEnd", "NonGenePattern");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NonGenePattern_Type)jcasType).casFeatCode_GenEnd);}
    
  /** setter for GenEnd - sets  
   * @generated */
  public void setGenEnd(int v) {
    if (NonGenePattern_Type.featOkTst && ((NonGenePattern_Type)jcasType).casFeat_GenEnd == null)
      jcasType.jcas.throwFeatMissing("GenEnd", "NonGenePattern");
    jcasType.ll_cas.ll_setIntValue(addr, ((NonGenePattern_Type)jcasType).casFeatCode_GenEnd, v);}    
   
    
  //*--------------*
  //* Feature: SenID

  /** getter for SenID - gets 
   * @generated */
  public String getSenID() {
    if (NonGenePattern_Type.featOkTst && ((NonGenePattern_Type)jcasType).casFeat_SenID == null)
      jcasType.jcas.throwFeatMissing("SenID", "NonGenePattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NonGenePattern_Type)jcasType).casFeatCode_SenID);}
    
  /** setter for SenID - sets  
   * @generated */
  public void setSenID(String v) {
    if (NonGenePattern_Type.featOkTst && ((NonGenePattern_Type)jcasType).casFeat_SenID == null)
      jcasType.jcas.throwFeatMissing("SenID", "NonGenePattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((NonGenePattern_Type)jcasType).casFeatCode_SenID, v);}    
  }

    