package controller;

public class SomaController {

	public SomaController() {
		super ();
	}
	public double soma(int n, double ressoma) {
		if (n == 0) {
//retorna-se o valor de ressoma quando n é igual a zero; evitando assim uma divisão por zero
			return ressoma;
		}else {
			ressoma = ressoma + ( 1 / (double) fatorial(n));
			return soma(n-1, ressoma);
//a função de soma recebe o valor do fatorial de n através de outra função. após isso, é subtraido 1 de n para dar seguimento a função
}
}
	private int fatorial(int n) {
		if(n == 0) {
			return 1;
		}else {
		return n * fatorial(n -1);
}
	}
}