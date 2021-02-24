package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import metodos.SubAc1ED;

class SubAC1Test {
	SubAc1ED rc = new SubAc1ED();
	int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};

	/*
	* = Casos de teste para passar:
	* 1.recursiveFactorial OK
	* 2.LinearSum OK
	* 3.ReverseArray
	* 4.IterativeReverseArray
	* 5.BinarySum
	* 6.BinaryFib
	* 7.LinearFibonacci
	*/
	
	@Test
	void testFatorial() {
		// Testa função Fatorial com recursividade 
		assertEquals(3628800, rc.recursiveFactorial(10));
	}
	
	@Test
	void testSomaLinear() {
		int n = a.length;
		// Testa função de Soma Linear
		assertEquals(7540, rc.LinearSum(a, n));
	}



}
