package entidades;

public class Professor extends Pessoa{

	private double salario;

	public Professor() {
		super();
	}

	public Professor(String nome, String cpf, String endere�o, String email, String telefone, double salario) {
		super(nome, cpf, endere�o, email, telefone);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Professor [Nome = " + getNome() 
				+ ", Cpf = " + getCpf()
				+ ", Endere�o = " + getEndere�o() 
				+ ", Email = " + getEmail() 
				+ ", Telefone = " + getTelefone()
				+ ", Salario = " + getSalario()
				+ "]";
	}
}
