/**
 */
package snomed.visualization.dsl.visualizationDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.Expression#getIsaRelationships <em>Isa Relationships</em>}</li>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.Expression#getStandaloneRelationships <em>Standalone Relationships</em>}</li>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.Expression#getRelationshipGroups <em>Relationship Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Isa Relationships</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isa Relationships</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isa Relationships</em>' containment reference.
   * @see #setIsaRelationships(IsaRelationships)
   * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getExpression_IsaRelationships()
   * @model containment="true"
   * @generated
   */
  IsaRelationships getIsaRelationships();

  /**
   * Sets the value of the '{@link snomed.visualization.dsl.visualizationDsl.Expression#getIsaRelationships <em>Isa Relationships</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isa Relationships</em>' containment reference.
   * @see #getIsaRelationships()
   * @generated
   */
  void setIsaRelationships(IsaRelationships value);

  /**
   * Returns the value of the '<em><b>Standalone Relationships</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Standalone Relationships</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Standalone Relationships</em>' containment reference.
   * @see #setStandaloneRelationships(Relationships)
   * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getExpression_StandaloneRelationships()
   * @model containment="true"
   * @generated
   */
  Relationships getStandaloneRelationships();

  /**
   * Sets the value of the '{@link snomed.visualization.dsl.visualizationDsl.Expression#getStandaloneRelationships <em>Standalone Relationships</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Standalone Relationships</em>' containment reference.
   * @see #getStandaloneRelationships()
   * @generated
   */
  void setStandaloneRelationships(Relationships value);

  /**
   * Returns the value of the '<em><b>Relationship Groups</b></em>' containment reference list.
   * The list contents are of type {@link snomed.visualization.dsl.visualizationDsl.RelationshipGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationship Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship Groups</em>' containment reference list.
   * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getExpression_RelationshipGroups()
   * @model containment="true"
   * @generated
   */
  EList<RelationshipGroup> getRelationshipGroups();
  
  /**
   * @return
   * @generated NOT
   */
  Concept getConcept();
  
  /**
   * @param value
   * @generated NOT
   */
  void setConcept(Concept value);

} // Expression
