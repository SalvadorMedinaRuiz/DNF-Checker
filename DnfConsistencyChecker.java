package edu.emich.cosc314;

import java.util.List;

/**
 * A checker for Disjunctive Normal Form (DNF) expressions, also known as sum-of-products form.
 * To use this checker you must do the following steps:
 * <ol><li> create a checker using one of the implementations of this interface
 *     <li> then defineDNF(DNFexpression)
 *     <li> then query isSatisfiable().
 */
public interface DnfConsistencyChecker {

  /**
   * Define a new Disjunctive Normal Form expression. The expression is given as the disjunction of
   * a list of conjuncts, each of which conjoins a list of literals (complemented or uncomplemented
   * variables). It may also be thought of as a boolean sum of products.
   */
  void  defineDnf(List<List<Literal>> dnfExpression);

  /** Is the DNF expression satisfiable */
  boolean isSatisfiable();
}
