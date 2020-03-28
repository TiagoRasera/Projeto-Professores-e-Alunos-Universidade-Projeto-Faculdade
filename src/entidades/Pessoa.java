package entidades;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String endere�o;
	private String email;
	private String telefone;
	
	//CONSTRUTOR;
	public Pessoa() {
	}
	
	public Pessoa(String nome, String cpf, String endere�o, String email, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
				+ ", Endere�o = " + endere�o 
				+ ", Email = " + email 
				+ ", Telefone = " + telefone 
				+ "]";
	}
}
