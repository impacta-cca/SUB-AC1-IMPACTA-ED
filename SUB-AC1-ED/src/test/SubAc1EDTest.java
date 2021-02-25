package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import metodos.SubAc1ED;

class SubAc1EDTest {
	SubAc1ED rc = new SubAc1ED();
	int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};

	/*
	* = Casos de teste para passar:
	* 1.recursiveFactorial OK!
	* 2.LinearSum OK!
	* 3.ReverseArray
	* 4.IterativeReverseArray
	* 5.BinarySum FALHA!
	* 6.BinaryFib OK!
	* 7.LinearFibonacci
	*/
	
	@Test
	void testFatorial() {
		// Testa função Fatorial com recursividade 
		assertEquals(3628800, rc.recursiveFactorial(10));
	}	//-----------------OK!
	
	
	@Test
	void testSomaLinear() {
		int n = a.length;
		// Testa função de Soma Linear
		assertEquals(7540, rc.LinearSum(a, n));
	}	//-----------------OK!
	
	@Test
	void testArrayReversa() {
		// Testa função de Array Reversa
		Assert.assertEquals(
                Arrays.toString(rc.reverte(a, 0, a.length-1)),
                Arrays.toString(new int[] {940, 510, 590, 650, 660, 750, 790, 830, 880, 940}));
	}
	
	
	@Test
	void testArrayReversaIterativa() {
		// Testa função de Array Reversa Iterativa
		Assert.assertEquals(
                Arrays.toString(rc.IterativeReverseArray(a, 0, a.length-1)),
                Arrays.toString(new int[] {940, 510, 590, 650, 660, 750, 790, 830, 880, 940}));
	}
	
	@Test
	void testSomaBinaria() {
		int i = 0;
		int n = a.length;
		// Testa função de Soma Binaria
		assertEquals(7540, rc.BinarySum(a, i, n));
	}   //-----------------RESOLVER FALHA!

	
	@Test
	void testBynSeqFib() {
		int k = 8;
		// Testa função de Sequencia Fibonacci
		assertEquals(21, rc.BinaryFib(k));
	}	//-----------------OK!
	
	
	@Test
	void testLinSeqFib() {
		int k = 5;
		int[] fb_res = {3,2};
		// Testa função de Sequencia Fibonacci Linear
		assertEquals(fb_res, rc.LinearFibonacci(k));
	}	//-----------------RESOLVR FALHA!
}
