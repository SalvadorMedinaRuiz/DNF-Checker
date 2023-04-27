package edu.emich.cosc314;

/** A literal for use in Boolean expressions. */
public class Literal {

  String variableName = "";

  boolean isPositive = true;

  /**
   * Create a Literal.
   * @param variableName The name of the literal's variable
   * @param isPositive A value of true indicates a positive literal, and false means that the
   *                   literal is a complemented form of the variable.
   */
  public Literal(String variableName, boolean isPositive) {
    this.variableName = variableName;
    this.isPositive = isPositive;
  }

  /** Create a positive literal. */
  public Literal(String variableName) {
    this(variableName,true);
  }

  }
