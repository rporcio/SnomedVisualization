/**
 */
package snomed.visualization.dsl.visualizationDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.Relationship#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Concept)
   * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getRelationship_Type()
   * @model containment="true"
   * @generated
   */
  Concept getType();

  /**
   * Sets the value of the '{@link snomed.visualization.dsl.visualizationDsl.Relationship#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Concept value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' containment reference.
   * @see #setDestination(Concept)
   * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getRelationship_Destination()
   * @model containment="true"
   * @generated
   */
  Concept getDestination();

  /**
   * Sets the value of the '{@link snomed.visualization.dsl.visualizationDsl.Relationship#getDestination <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' containment reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(Concept value);
  
  /**
   * @param value
   * @generated NOT
   */
  void setDefined(boolean value);
  
  /**
   * @return
   * @generated NOT
   */
  boolean isDefined();
  
  /**
   * @param group
   * @generated NOT
   */
  void setGroup(int group);
  
  /**
   * @return
   * @generated NOT
   */
  int getGroup();
  
  /**
   * @param id
   * @generated NOT
   */
  void setId(String id);
  
  /**
   * @return
   * @generated NOT
   */
  String getId();

} // Relationship
