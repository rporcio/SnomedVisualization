/**
 */
package snomed.visualization.dsl.visualizationDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.RelationshipGroup#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getRelationshipGroup()
 * @model
 * @generated
 */
public interface RelationshipGroup extends EObject
{
  /**
   * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
   * The list contents are of type {@link snomed.visualization.dsl.visualizationDsl.Relationship}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationships</em>' containment reference list.
   * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getRelationshipGroup_Relationships()
   * @model containment="true"
   * @generated
   */
  EList<Relationship> getRelationships();

} // RelationshipGroup
