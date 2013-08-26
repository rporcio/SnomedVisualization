/**
 */
package snomed.visualization.dsl.visualizationDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Isa Relationships</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.IsaRelationships#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getIsaRelationships()
 * @model
 * @generated
 */
public interface IsaRelationships extends EObject
{
  /**
   * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
   * The list contents are of type {@link snomed.visualization.dsl.visualizationDsl.Concept}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationships</em>' containment reference list.
   * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage#getIsaRelationships_Relationships()
   * @model containment="true"
   * @generated
   */
  EList<Concept> getRelationships();

} // IsaRelationships
