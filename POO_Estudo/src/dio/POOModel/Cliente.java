package dio.POOModel;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	
	public String numCartao;
	private List<Endereco> enderecos;
	 
	//tem que colocar algo aqui sim!!! n�o pode ser nulo o cep
	public void adicionaEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new NullPointerException("Endere�o n�o pode ser nulo");
		}
		if (endereco.cep == null) {
			throw new NullPointerException("CEP n�o pode ser nulo");
		}
		
		getEnderecos().add(endereco);
	}
	
	//ele ta private pra passar na valida��o, para verificar
	//se ele � nulo ou nao 
	private List<Endereco> getEnderecos() {
		if (enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}
	
	//� necessario colocar o get end setter por ser obrigatorio

}
