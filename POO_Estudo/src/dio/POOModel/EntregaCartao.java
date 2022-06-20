package dio.POOModel;

public class EntregaCartao {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.cep = "000000";
		//dados do endereço
		
		Cliente cliente = new Cliente();
		
		//dados do cliente
		
		
		//try é pra tratar o erro e deixar mais bonita a 
		//mensagem de erro na tela
		try {
			cliente.adicionaEndereco(endereco);
			System.out.println("Endereço adicionado com sucesso");
		} catch (Exception e) {
			System.err.println("Houve um erro ao adiconar o Cep: "
					+ "Ele não pode ser nulo");
		}
		

	}

}
