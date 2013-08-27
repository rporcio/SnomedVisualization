/**
 */
package snomed.visualization.dsl.visualizationDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslFactory
 * @model kind="package"
 * @generated
 */
public interface VisualizationDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "visualizationDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.visualization.snomed/dsl/VisualizationDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "visualizationDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VisualizationDslPackage eINSTANCE = snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl.init();

  /**
   * The meta object id for the '{@link snomed.visualization.dsl.visualizationDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see snomed.visualization.dsl.visualizationDsl.impl.ExpressionImpl
   * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Isa Relationships</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ISA_RELATIONSHIPS = 0;

  /**
   * The feature id for the '<em><b>Ungrouped Relationships</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__UNGROUPED_RELATIONSHIPS = 1;

  /**
   * The feature id for the '<em><b>Grouped Relationships</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__GROUPED_RELATIONSHIPS = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link snomed.visualization.dsl.visualizationDsl.impl.IsaRelationshipsImpl <em>Isa Relationships</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see snomed.visualization.dsl.visualizationDsl.impl.IsaRelationshipsImpl
   * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getIsaRelationships()
   * @generated
   */
  int ISA_RELATIONSHIPS = 1;

  /**
   * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISA_RELATIONSHIPS__RELATIONSHIPS = 0;

  /**
   * The number of structural features of the '<em>Isa Relationships</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISA_RELATIONSHIPS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link snomed.visualization.dsl.visualizationDsl.impl.RelationshipGroupImpl <em>Relationship Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see snomed.visualization.dsl.visualizationDsl.impl.RelationshipGroupImpl
   * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getRelationshipGroup()
   * @generated
   */
  int RELATIONSHIP_GROUP = 2;

  /**
   * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_GROUP__RELATIONSHIPS = 0;

  /**
   * The number of structural features of the '<em>Relationship Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link snomed.visualization.dsl.visualizationDsl.impl.RelationshipsImpl <em>Relationships</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see snomed.visualization.dsl.visualizationDsl.impl.RelationshipsImpl
   * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getRelationships()
   * @generated
   */
  int RELATIONSHIPS = 3;

  /**
   * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIPS__RELATIONSHIPS = 0;

  /**
   * The number of structural features of the '<em>Relationships</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIPS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link snomed.visualization.dsl.visualizationDsl.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see snomed.visualization.dsl.visualizationDsl.impl.RelationshipImpl
   * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TYPE = 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__DESTINATION = 1;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link snomed.visualization.dsl.visualizationDsl.impl.ConceptImpl <em>Concept</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see snomed.visualization.dsl.visualizationDsl.impl.ConceptImpl
   * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getConcept()
   * @generated
   */
  int CONCEPT = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT__ID = 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT__TERM = 1;

  /**
   * The number of structural features of the '<em>Concept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link snomed.visualization.dsl.visualizationDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link snomed.visualization.dsl.visualizationDsl.Expression#getIsaRelationships <em>Isa Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Isa Relationships</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Expression#getIsaRelationships()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_IsaRelationships();

  /**
   * Returns the meta object for the containment reference '{@link snomed.visualization.dsl.visualizationDsl.Expression#getUngroupedRelationships <em>Ungrouped Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ungrouped Relationships</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Expression#getUngroupedRelationships()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_UngroupedRelationships();

  /**
   * Returns the meta object for the containment reference list '{@link snomed.visualization.dsl.visualizationDsl.Expression#getGroupedRelationships <em>Grouped Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Grouped Relationships</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Expression#getGroupedRelationships()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_GroupedRelationships();

  /**
   * Returns the meta object for class '{@link snomed.visualization.dsl.visualizationDsl.IsaRelationships <em>Isa Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Isa Relationships</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.IsaRelationships
   * @generated
   */
  EClass getIsaRelationships();

  /**
   * Returns the meta object for the containment reference list '{@link snomed.visualization.dsl.visualizationDsl.IsaRelationships#getRelationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relationships</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.IsaRelationships#getRelationships()
   * @see #getIsaRelationships()
   * @generated
   */
  EReference getIsaRelationships_Relationships();

  /**
   * Returns the meta object for class '{@link snomed.visualization.dsl.visualizationDsl.RelationshipGroup <em>Relationship Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship Group</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.RelationshipGroup
   * @generated
   */
  EClass getRelationshipGroup();

  /**
   * Returns the meta object for the containment reference list '{@link snomed.visualization.dsl.visualizationDsl.RelationshipGroup#getRelationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relationships</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.RelationshipGroup#getRelationships()
   * @see #getRelationshipGroup()
   * @generated
   */
  EReference getRelationshipGroup_Relationships();

  /**
   * Returns the meta object for class '{@link snomed.visualization.dsl.visualizationDsl.Relationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationships</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Relationships
   * @generated
   */
  EClass getRelationships();

  /**
   * Returns the meta object for the containment reference list '{@link snomed.visualization.dsl.visualizationDsl.Relationships#getRelationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relationships</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Relationships#getRelationships()
   * @see #getRelationships()
   * @generated
   */
  EReference getRelationships_Relationships();

  /**
   * Returns the meta object for class '{@link snomed.visualization.dsl.visualizationDsl.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the containment reference '{@link snomed.visualization.dsl.visualizationDsl.Relationship#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Relationship#getType()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Type();

  /**
   * Returns the meta object for the containment reference '{@link snomed.visualization.dsl.visualizationDsl.Relationship#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destination</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Relationship#getDestination()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Destination();

  /**
   * Returns the meta object for class '{@link snomed.visualization.dsl.visualizationDsl.Concept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Concept
   * @generated
   */
  EClass getConcept();

  /**
   * Returns the meta object for the attribute '{@link snomed.visualization.dsl.visualizationDsl.Concept#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Concept#getId()
   * @see #getConcept()
   * @generated
   */
  EAttribute getConcept_Id();

  /**
   * Returns the meta object for the attribute '{@link snomed.visualization.dsl.visualizationDsl.Concept#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Term</em>'.
   * @see snomed.visualization.dsl.visualizationDsl.Concept#getTerm()
   * @see #getConcept()
   * @generated
   */
  EAttribute getConcept_Term();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VisualizationDslFactory getVisualizationDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link snomed.visualization.dsl.visualizationDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see snomed.visualization.dsl.visualizationDsl.impl.ExpressionImpl
     * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Isa Relationships</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__ISA_RELATIONSHIPS = eINSTANCE.getExpression_IsaRelationships();

    /**
     * The meta object literal for the '<em><b>Ungrouped Relationships</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__UNGROUPED_RELATIONSHIPS = eINSTANCE.getExpression_UngroupedRelationships();

    /**
     * The meta object literal for the '<em><b>Grouped Relationships</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__GROUPED_RELATIONSHIPS = eINSTANCE.getExpression_GroupedRelationships();

    /**
     * The meta object literal for the '{@link snomed.visualization.dsl.visualizationDsl.impl.IsaRelationshipsImpl <em>Isa Relationships</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see snomed.visualization.dsl.visualizationDsl.impl.IsaRelationshipsImpl
     * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getIsaRelationships()
     * @generated
     */
    EClass ISA_RELATIONSHIPS = eINSTANCE.getIsaRelationships();

    /**
     * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ISA_RELATIONSHIPS__RELATIONSHIPS = eINSTANCE.getIsaRelationships_Relationships();

    /**
     * The meta object literal for the '{@link snomed.visualization.dsl.visualizationDsl.impl.RelationshipGroupImpl <em>Relationship Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see snomed.visualization.dsl.visualizationDsl.impl.RelationshipGroupImpl
     * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getRelationshipGroup()
     * @generated
     */
    EClass RELATIONSHIP_GROUP = eINSTANCE.getRelationshipGroup();

    /**
     * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP_GROUP__RELATIONSHIPS = eINSTANCE.getRelationshipGroup_Relationships();

    /**
     * The meta object literal for the '{@link snomed.visualization.dsl.visualizationDsl.impl.RelationshipsImpl <em>Relationships</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see snomed.visualization.dsl.visualizationDsl.impl.RelationshipsImpl
     * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getRelationships()
     * @generated
     */
    EClass RELATIONSHIPS = eINSTANCE.getRelationships();

    /**
     * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIPS__RELATIONSHIPS = eINSTANCE.getRelationships_Relationships();

    /**
     * The meta object literal for the '{@link snomed.visualization.dsl.visualizationDsl.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see snomed.visualization.dsl.visualizationDsl.impl.RelationshipImpl
     * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__DESTINATION = eINSTANCE.getRelationship_Destination();

    /**
     * The meta object literal for the '{@link snomed.visualization.dsl.visualizationDsl.impl.ConceptImpl <em>Concept</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see snomed.visualization.dsl.visualizationDsl.impl.ConceptImpl
     * @see snomed.visualization.dsl.visualizationDsl.impl.VisualizationDslPackageImpl#getConcept()
     * @generated
     */
    EClass CONCEPT = eINSTANCE.getConcept();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCEPT__ID = eINSTANCE.getConcept_Id();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCEPT__TERM = eINSTANCE.getConcept_Term();

  }

} //VisualizationDslPackage
