package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;



import metodos.SubAc1ED;

class SubAc1EDTest {
	SubAc1ED rc = new SubAc1ED();
	int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};

	/*
	* = Casos de teste para passar:
	* 1.recursiveFactorial OK!
	* 2.LinearSum OK!
	* 3.ReverseArray OK!
	* 4.IterativeReverseArray Ok!
	* 5.BinarySum FALHA!
	* 6.BinaryFib OK!
	* 7.LinearFibonacci Ok!
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
	void testSomaBinaria() {
		int i = 0;
		int n = a.length;
		// Testa função de Soma Binaria
		assertEquals(7540, rc.BinarySum(a, i, n));
	}   //-----------------OK!

		
	@Test
	void testArrayReversa() {
		// Testa função de Array Reversa
		assertEquals(
                Arrays.toString(rc.ReverseArray(a, 0, a.length-1)),
                Arrays.toString(new int[] {940, 510, 590, 650, 660, 750, 790, 830, 880, 940}));
	}	//-----------------OK!
	
	
	@Test
	void testArrayReversaIterativa() {
		// Testa função de Array Reversa Iterativa
		assertEquals(
                Arrays.toString(rc.IterativeReverseArray(a, 0, a.length-1)),
                Arrays.toString(new int[] {940, 510, 590, 650, 660, 750, 790, 830, 880, 940}));
	}	//-----------------OK!
	
	
	@Test
	void testBynSeqFib() {
		int k = 8;
		// Testa função de Sequencia Fibonacci
		assertEquals(21, rc.BinaryFib(k));
	}	//-----------------OK!
	
	
	@Test
	void testLinSeqFib() {
		// Testa função de Sequencia Fibonacci Linear
		int k = 5;
		int fb_res[] = {3,2};
		int resul[] = rc.LinearFibonacci(k);
		assertEquals(fb_res[0], resul[0]);
		assertEquals(fb_res[1], resul[1]);
	}	//-----------------OK!
	
	
}
