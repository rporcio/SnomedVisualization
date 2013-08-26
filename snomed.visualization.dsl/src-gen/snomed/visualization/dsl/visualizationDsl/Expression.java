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
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.Expression#getUngroupedRelationships <em>Ungrouped Relationships</em>}</li>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.Expression#getGroupedRelationships <em>Grouped Relationships</em>}</li>
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
   * Returns the value of the '<em><b>Ungrouped Relationships</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ungrouped Relationships</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ungrouped Relationships</em>' containment reference.
   * @see #setUngroupedRelationships(Relationships)
   * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getExpression_UngroupedRelationships()
   * @model containment="true"
   * @generated
   */
  Relationships getUngroupedRelationships();

  /**
   * Sets the value of the '{@link snomed.visualization.dsl.visualizationDsl.Expression#getUngroupedRelationships <em>Ungrouped Relationships</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ungrouped Relationships</em>' containment reference.
   * @see #getUngroupedRelationships()
   * @generated
   */
  void setUngroupedRelationships(Relationships value);

  /**
   * Returns the value of the '<em><b>Grouped Relationships</b></em>' containment reference list.
   * The list contents are of type {@link snomed.visualization.dsl.visualizationDsl.RelationshipGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grouped Relationships</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grouped Relationships</em>' containment reference list.
   * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getExpression_GroupedRelationships()
   * @model containment="true"
   * @generated
   */
  EList<RelationshipGroup> getGroupedRelationships();
  
  Concept getConcept();
  void setConcept(Concept concept);

} // Expression
