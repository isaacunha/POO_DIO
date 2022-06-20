package dio.POOModel;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	
	public String numCartao;
	private List<Endereco> enderecos;
	 
	//tem que colocar algo aqui sim!!! não pode ser nulo o cep
	public void adicionaEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new NullPointerException("Endereço não pode ser nulo");
		}
		if (endereco.cep == null) {
			throw new NullPointerException("CEP não pode ser nulo");
		}
		
		getEnderecos().add(endereco);
	}
	
	//ele ta private pra passar na validação, para verificar
	//se ele é nulo ou nao 
	private List<Endereco> getEnderecos() {
		if (enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}
	
	//é necessario colocar o get end setter por ser obrigatorio

}
