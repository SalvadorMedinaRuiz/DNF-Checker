package edu.emich.cosc314;

import java.util.List;

public class MyDnfConsistencyChecker implements DnfConsistencyChecker{
	/**
	 * CODED BY SALVADOR MEDINA-RUIZ
	 * COSC 314
	 * A checker for Disjunctive Normal Form (DNF) expressions, also known as sum-of-products form.
	 * Creates variable to check each conjunct and literal of the DNF. Also makes counters to keep
	 * track of which letters are repeated and which are complemented.
	 */
	private List<Literal> conjunct;
	private Literal lit;
	private boolean isSatisfiable;
	
	private int counterA, counterB, counterC, counterD, counterE, counterF, counterG, counterH, counterI, counterJ, counterK, counterL, counterM, counterN, counterO, counterP, counterQ, counterR, counterS, counterT, counterU, counterV, counterW, counterX, counterY, counterZ;
	private int counterAComplemented, counterBComplemented, counterCComplemented, counterDComplemented, counterEComplemented, counterFComplemented, counterGComplemented, counterHComplemented, counterIComplemented, counterJComplemented, counterKComplemented, counterLComplemented, counterMComplemented, counterNComplemented, counterOComplemented, counterPComplemented, counterQComplemented, counterRComplemented, counterSComplemented, counterTComplemented, counterUComplemented, counterVComplemented, counterWComplemented, counterXComplemented, counterYComplemented, counterZComplemented;
	
	@Override
	public void defineDnf(List<List<Literal>> dnfExpression) {
		/**
		 * Checks if a letter is complemented and repeated by going through each conjunct and then in
		 * that conjunct going through each literal. 
		 */
		for (int i = 0; i < dnfExpression.size(); i++) {
			this.conjunct = dnfExpression.get(i);
			counterA = counterB = counterC = counterD = counterE = counterF = counterG = counterH = counterI = counterJ = counterK = counterL = counterM = counterN = counterO = counterP = counterQ = counterR = counterS = counterT = counterU = counterV = counterW = counterX = counterY = counterZ = 0;
			counterAComplemented = counterBComplemented = counterCComplemented = counterDComplemented = counterEComplemented = counterFComplemented = counterGComplemented = counterHComplemented = counterIComplemented = counterJComplemented = counterKComplemented = counterLComplemented = counterMComplemented = counterNComplemented = counterOComplemented  = counterPComplemented = counterQComplemented = counterRComplemented = counterSComplemented = counterTComplemented = counterUComplemented = counterVComplemented = counterWComplemented = counterXComplemented = counterYComplemented = counterZComplemented = 0;
			for (int i2 = 0; i2 < this.conjunct.size(); i2++) {
				lit = this.conjunct.get(i2);
				switch (lit.variableName) {
				case "a":
					counterA++;
					if (lit.isPositive == false) {
						counterAComplemented++;
					}
					break;
				case "b":
					counterB++;
					if (lit.isPositive == false) {
						counterBComplemented++;
					}
					break;
				case "c":
					counterC++;
					if (lit.isPositive == false) {
						counterCComplemented++;
					}
					break;
				case "d":
					counterD++;
					if (lit.isPositive == false) {
						counterDComplemented++;
					}
					break;
				case "e":
					counterE++;
					if (lit.isPositive == false) {
						counterEComplemented++;
					}
					break;
				case "f":
					counterF++;
					if (lit.isPositive == false) {
						counterFComplemented++;
					}
					break;
				case "g":
					counterG++;
					if (lit.isPositive == false) {
						counterGComplemented++;
					}
					break;
				case "h":
					counterH++;
					if (lit.isPositive == false) {
						counterHComplemented++;
					}
					break;
				case "i":
					counterI++;
					if (lit.isPositive == false) {
						counterIComplemented++;
					}
					break;
				case "j":
					counterJ++;
					if (lit.isPositive == false) {
						counterJComplemented++;
					}
					break;
				case "k":
					counterK++;
					if (lit.isPositive == false) {
						counterKComplemented++;
					}
					break;
				case "l":
					counterL++;
					if (counterL > 1) {
						if (lit.isPositive == false) {
							counterLComplemented++;
						}
					}
					break;
				case "m":
					counterM++;
					if (lit.isPositive == false) {
						counterMComplemented++;
					}
					break;
				case "n":
					counterN++;
					if (lit.isPositive == false) {
						counterNComplemented++;
					}
					break;
				case "o":
					counterO++;
					if (lit.isPositive == false) {
						counterOComplemented++;
					}
					break;
				case "p":
					counterP++;
					if (lit.isPositive == false) {
						counterPComplemented++;
					}
					break;
				case "q":
					counterQ++;
					if (lit.isPositive == false) {
						counterQComplemented++;
					}
					break;
				case "r":
					counterR++;
					if (lit.isPositive == false) {
						counterRComplemented++;
					}
					break;
				case "s":
					counterS++;
					if (lit.isPositive == false) {
						counterSComplemented++;
					}
					break;
				case "t":
					counterT++;
					if (lit.isPositive == false) {
						counterTComplemented++;
					}
					break;
				case "u":
					counterU++;
					if (lit.isPositive == false) {
						counterUComplemented++;
					}
					break;
				case "v":
					counterV++;
					if (lit.isPositive == false) {
						counterVComplemented++;
					}
					break;
				case "w":
					counterW++;
					if (lit.isPositive == false) {
						counterWComplemented++;
					}
					break;
				case "x":
					counterX++;
					if (lit.isPositive == false) {
						counterXComplemented++;
					}
					break;
				case "y":
					counterY++;
					if (lit.isPositive == false) {
						counterYComplemented++;
					}
					break;
				case "z":
					counterZ++;
					if (lit.isPositive == false) {
						counterZComplemented++;
					}
					break;
				}
			}
			if ((counterA > 1 && counterAComplemented >= 1) ||(counterB > 1 && counterBComplemented >= 1) ||(counterC > 1 && counterCComplemented >= 1) ||(counterD > 1 && counterDComplemented >= 1) ||(counterE > 1 && counterEComplemented >= 1) ||(counterF > 1 && counterFComplemented >= 1) ||(counterG > 1 && counterGComplemented >= 1) ||(counterH > 1 && counterHComplemented >= 1) ||(counterI > 1 && counterIComplemented >= 1) ||(counterJ > 1 && counterJComplemented >= 1) ||(counterK > 1 && counterKComplemented >= 1) ||(counterL > 1 && counterLComplemented >= 1) ||(counterM > 1 && counterMComplemented >= 1) ||(counterN > 1 && counterNComplemented >= 1) ||(counterO > 1 && counterOComplemented >= 1) ||(counterP > 1 && counterPComplemented >= 1) ||(counterQ > 1 && counterQComplemented >= 1) ||(counterR > 1 && counterRComplemented >= 1) ||(counterS > 1 && counterSComplemented >= 1) ||(counterT > 1 && counterTComplemented >= 1) ||(counterU > 1 && counterUComplemented >= 1) ||(counterV > 1 && counterVComplemented >= 1) || (counterW > 1 && counterWComplemented >= 1) ||(counterX > 1 && counterXComplemented >= 1) || (counterY > 1 && counterYComplemented >= 1) || (counterZ > 1 && counterZComplemented >= 1)) {
				isSatisfiable = false;
			}
			//if (counterXComplemented % 2 == 0) {
				//System.out.println(counterXComplemented/2);
				//isSatisfiable = true;
				//break;
			//}
			else {
				isSatisfiable = true;
				break;
			}
		}
	}

	@Override
	public boolean isSatisfiable() {
		/**
		 *	Simply returns the isSatisfiable value. An accessor method, if you will.
		 */
		return isSatisfiable;
	}

}
