package dio.POOModel;

public class EntregaCartao {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.cep = "000000";
		//dados do endere�o
		
		Cliente cliente = new Cliente();
		
		//dados do cliente
		
		
		//try � pra tratar o erro e deixar mais bonita a 
		//mensagem de erro na tela
		try {
			cliente.adicionaEndereco(endereco);
			System.out.println("Endere�o adicionado com sucesso");
		} catch (Exception e) {
			System.err.println("Houve um erro ao adiconar o Cep: "
					+ "Ele n�o pode ser nulo");
		}
		

	}

}
