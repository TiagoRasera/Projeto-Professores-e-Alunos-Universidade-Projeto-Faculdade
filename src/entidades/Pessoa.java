package entidades;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String endereço;
	private String email;
	private String telefone;
	
	//CONSTRUTOR;
	public Pessoa() {
	}
	
	public Pessoa(String nome, String cpf, String endereço, String email, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereço;
		this.email = email;
		this.telefone = telefone;
	}

	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Pessoa [Nome = " + getNome() 
				+ ", Cpf = " + cpf 
				+ ", Endereço = " + endereço 
				+ ", Email = " + email 
				+ ", Telefone = " + telefone 
				+ "]";
	}
}
