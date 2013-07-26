/**
 */
package snomed.visualization.dsl.visualizationDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.Concept#getId <em>Id</em>}</li>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.Concept#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getConcept_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link snomed.visualization.dsl.visualizationDsl.Concept#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' attribute.
   * @see #setTerm(String)
   * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getConcept_Term()
   * @model
   * @generated
   */
  String getTerm();

  /**
   * Sets the value of the '{@link snomed.visualization.dsl.visualizationDsl.Concept#getTerm <em>Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' attribute.
   * @see #getTerm()
   * @generated
   */
  void setTerm(String value);
  
  /**
   * @param value
   * @return
   * @generated NOT
   */
  void setDefined(boolean value);
  
  /**
   * @return
   * @generated NOT
   */
  boolean isDefined();

} // Concept
