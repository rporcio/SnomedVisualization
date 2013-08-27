/**
 */
package snomed.visualization.dsl.visualizationDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage
 * @generated
 */
public interface VisualizationDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VisualizationDslFactory eINSTANCE = snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Isa Relationships</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Isa Relationships</em>'.
   * @generated
   */
  IsaRelationships createIsaRelationships();

  /**
   * Returns a new object of class '<em>Relationship Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Group</em>'.
   * @generated
   */
  RelationshipGroup createRelationshipGroup();

  /**
   * Returns a new object of class '<em>Relationships</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationships</em>'.
   * @generated
   */
  Relationships createRelationships();

  /**
   * Returns a new object of class '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship</em>'.
   * @generated
   */
  Relationship createRelationship();

  /**
   * Returns a new object of class '<em>Concept</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concept</em>'.
   * @generated
   */
  Concept createConcept();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VisualizationDslPackage getVisualizationDslPackage();

} //VisualizationDslFactory
