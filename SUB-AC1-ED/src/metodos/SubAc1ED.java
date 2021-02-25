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
			System.out.println("antes "+i+" "+j);
			
			
			if(i+j == k) {
				int f[] = {i,j};
				return f; 
			}
			
			else {
				System.out.println((i+j)+" "+j);
				int f[] = {i+j,i};
				return f ;
			}
			
		
		}
		
	}

	
	
}
