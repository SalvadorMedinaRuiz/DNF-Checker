package edu.emich.cosc314;

import org.junit.*;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.CombinableMatcher;

import java.io.File;
import java.util.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@SuppressWarnings({ "null", "static-method", "unused" })
public class DnfConsistencyChecker_test {

	@Test
	public void simpleDnf_test() { // passes
		var lit = new Literal("x");
		var conjunct = Arrays.asList(lit);
		var disjunct = Arrays.asList(conjunct);

		DnfConsistencyChecker dnf = new MyDnfConsistencyChecker();
		dnf.defineDnf(disjunct);
		assertEquals(true,dnf.isSatisfiable());
	}

	@Test
	public void simpleComplementDnf_test() { // fails
		var complementedLit = new Literal("x", false); // x-
		var PositiveLit = new Literal("x", true); // x

		var conjunct = Arrays.asList(complementedLit, PositiveLit);
		var disjunct = Arrays.asList(conjunct);

		DnfConsistencyChecker dnf = new MyDnfConsistencyChecker();
		dnf.defineDnf(disjunct);
		assertEquals(false,dnf.isSatisfiable());
	}

//MY TESTS
	@Test
	public void test() { // not satisfiable
		var lit1 = new Literal("x", true);
		var lit2 = new Literal("y", true);
		var lit3 = new Literal("x", false);
		var lit4 = new Literal("w", true); // xyx-w

		var lit5 = new Literal("y", false);
		var lit6 = new Literal("x", true);
		var lit7 = new Literal("w", false);
		var lit8 = new Literal("w", true); // y-xw-w

		var conjunct1 = Arrays.asList(lit1, lit2, lit3, lit4);
		var conjunct2 = Arrays.asList(lit5, lit6, lit7, lit8);
		var disjunct = Arrays.asList(conjunct1, conjunct2);

		DnfConsistencyChecker dnf = new MyDnfConsistencyChecker();
		dnf.defineDnf(disjunct);
		assertEquals(false,dnf.isSatisfiable());
	}

	@Test
	public void test2() { // not satisfiable
		var lit1 = new Literal("x");
		var lit2 = new Literal("y", false);
		var lit3 = new Literal("x", false);
		var lit4 = new Literal("w", false); // xy-x-w-

		var lit5 = new Literal("y", false);
		var lit6 = new Literal("x", true);
		var lit7 = new Literal("w", false);
		var lit8 = new Literal("w", true); // y-xw-w

		var conjunct1 = Arrays.asList(lit1, lit2, lit3, lit4);
		var conjunct2 = Arrays.asList(lit5, lit6, lit7, lit8);
		var disjunct = Arrays.asList(conjunct1, conjunct2);

		DnfConsistencyChecker dnf = new MyDnfConsistencyChecker();
		dnf.defineDnf(disjunct);
		assertEquals(false,dnf.isSatisfiable());
	}

	@Test
	public void test3() { // satisfiable
		var lit1 = new Literal("x", false);
		var lit2 = new Literal("y");
		var lit3 = new Literal("z", false);
		var lit4 = new Literal("x"); // x-yz-x

		var lit5 = new Literal("w", true);
		var lit6 = new Literal("x", false);
		var lit7 = new Literal("y", false);
		var lit8 = new Literal("z", true); // wx-y-z

		var lit9 = new Literal("w", false);
		var lit10 = new Literal("x", false);
		var lit11 = new Literal("w", false);
		var lit12 = new Literal("x"); // w-x-w-x

		var lit13 = new Literal("x", false);
		var lit14 = new Literal("y", false);
		var lit15 = new Literal("z", false);
		var lit16 = new Literal("z", true); // x-y-z-z

		var conjunct1 = Arrays.asList(lit1, lit2, lit3, lit4);
		var conjunct2 = Arrays.asList(lit5, lit6, lit7, lit8);
		var conjunct3 = Arrays.asList(lit9, lit10, lit11, lit12);
		var conjunct4 = Arrays.asList(lit13, lit14, lit15, lit16);
		var disjunct = Arrays.asList(conjunct1, conjunct2, conjunct3, conjunct4);

		DnfConsistencyChecker dnf = new MyDnfConsistencyChecker();
		dnf.defineDnf(disjunct);
		assertEquals(true, dnf.isSatisfiable());//true
	}
	
	@Test
	public void test4() { // NOT satisfiable
		var lit1 = new Literal("s", false);
		var lit2 = new Literal("t", false);
		var lit3 = new Literal("s", true);
		var lit4 = new Literal("k", false); // s-t-sk-

		var lit5 = new Literal("e", false);
		var lit6 = new Literal("d", true);
		var lit7 = new Literal("a", false);
		var lit8 = new Literal("a", true); // e-da-a

		var conjunct1 = Arrays.asList(lit1, lit2, lit3, lit4);
		var conjunct2 = Arrays.asList(lit5, lit6, lit7, lit8);
		var disjunct = Arrays.asList(conjunct1, conjunct2);

		DnfConsistencyChecker dnf = new MyDnfConsistencyChecker();
		dnf.defineDnf(disjunct);
		assertEquals(false, dnf.isSatisfiable());
		//dnf.isSatisfiable(); //false
	}
}
