package entidades;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String enderešo;
	private String email;
	private String telefone;
	
	//CONSTRUTOR;
	public Pessoa() {
	}
	
	public Pessoa(String nome, String cpf, String enderešo, String email, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.enderešo = enderešo;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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
				+ ", Enderešo = " + enderešo 
				+ ", Email = " + email 
				+ ", Telefone = " + telefone 
				+ "]";
	}
}
