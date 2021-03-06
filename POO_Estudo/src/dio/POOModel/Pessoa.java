package dio.POOModel;

import javax.management.RuntimeErrorException;

public class Pessoa {
	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;
	
	public enum TipoPessoa {FISICA, JURIDICA}
	
	public Integer codigo;
	public String nome; 
	public String documento; //string pq pode come?ar com 0
	public TipoPessoa tipo;
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		if (documento == null|| documento.isEmpty()) {
			throw new RuntimeException("Docuemnto n?o pode ser nulo ou vazio");
		}
		
		if (documento.length()== TAMANHO_CPF) {
			setDocumento(documento, tipo = TipoPessoa.FISICA);
		}
		else if (documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, tipo = TipoPessoa.JURIDICA);
		} else {
			throw new RuntimeException("Docuemnto invalido");
		}
				
	}
	
	private void setDocumento(String documento, TipoPessoa tipo) {	
		this.documento = documento;
		this.tipo = tipo;	
	}
	
	public TipoPessoa getTipo() {
		return tipo;	
	}
	
}
