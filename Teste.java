package bytebank;

public class Teste {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Carlos", "121212", 5000.0, 2222);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		SistemaInterno sistema = new SistemaInterno();
		
		sistema.autenticar(gerente);
		
		controle.registrar(gerente);
		
		System.out.println(controle.getSoma());
		
		//testando commit

	}

}
