package metodos;

public class SubAc1ED {
	// Arranjo para teste dos métodos
	int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	
	
	public Integer recursiveFactorial(int n) {
		// Função calcula fatorial 
		//  com recursividade 
		if (n == 0) return 1;
		else return n * recursiveFactorial(n - 1);
	}


	public Integer LinearSum(int[] a2, int n) {
		// Função função de Soma Linear
		if (n == 1) {
			return a2[0];
		} else {
			return LinearSum(a2, n-1) + a2[n-1];
		}
	}

}
