package metodos;

public class SubAc1ED {
	// Arranjo para teste dos métodos
	// int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	
	
	public Integer recursiveFactorial(int n) {
		// Função calcula fatorial 
		//  com recursividade 
		if (n == 0) return 1;
		else return n * recursiveFactorial(n - 1);
	}//-----------------OK!


	public Integer LinearSum(int[] a, int n) {
		// Função função de Soma Linear
		if (n == 1) {
			return a[0];
		} else {
			return LinearSum(a, n-1) + a[n-1];
		}//-----------------OK!
	}
	
	
	public Integer BinarySum(int[] a, int i, int n) {
		// Função de Soma Binaria
		if (n == 1) {
			return a[i];
		} else {
			return BinarySum(a, i, (n/2)) + BinarySum(a, i+(n/2), (n/2));
		}//-----------------RESOLVER FALHA!
	}
	
	public int[] ReverseArray(int[] a, int i, int j) {
		// Função de Array Reversa
		if (i < j) {
			troca(a, i, j);
			ReverseArray(a, i + 1, j -1);	
		}
		return a; 
	}//-----------------OK!
		
	private void troca(int[] a, int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux; 
		}//-----------------OK! (Parte do ReverseArray)
	
	public int[] IterativeReverseArray(int[] a, int i, int j) {
		// Função de Array Reversa Iterativa
		while (i<j) {
			troca(a, i, j);
			i += 1;
			j -= 1;
		}
		return a;
	}//-----------------OK!


	public Integer BinaryFib(int k) {
		// Função de Sequencia Fibonacci
		if (k <= 1) {
			return k;
		} else {
			return BinaryFib(k-1) + BinaryFib(k-2);
		}//-----------------OK!
			
	}


	public int[] LinearFibonacci(int k) {		
		// Função de Sequencia Fibonacci Linear
		if (k <= 1) {
			int f[] = {k,0};
			return f;
		} else {
			int r[] = LinearFibonacci(k-1);
			int i = r[0];
			int j = r[1];
			if(i+j == k) {
				int f[] = {i,j};
				return f;
			}else {
				int f[] = {i+j,i};
				return f;
			}
		}
	}
}
