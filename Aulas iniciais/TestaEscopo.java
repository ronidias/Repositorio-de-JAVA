public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testendo condicionais");
		
		int idade = 18;
		int quantidadePessoas = 1;
		//boolean acompanhado = true;
		//boolean acompanhado = acompanhado >=2;
		
	boolean acompanhado;
	
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		// Condicional 'ou'
	//	if (idade >= 18 || quantidadePessoas >=2) {
	//		System.out.println("seja bem vindo");
		
		// Condicional 'e'
	//	if (idade >= 18 && quantidadePessoas >=2) {
	//		System.out.println("seja bem vindo");
				
		//Condicional 'boolean'		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");		
		} else {
			System.out.println("infelizmente voc� n�o pode entrar!");
		}
		}
	}