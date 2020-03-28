package entidades;

import enums.SituacaoAluno;

public class Aluno extends Pessoa {

	private double media;
	private SituacaoAluno situacao;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String cpf, String endereço, String email, String telefone,
				double media, SituacaoAluno situacao) {
		super(nome, cpf, endereço, email, telefone);
		this.media = media;
		this.situacao = situacao;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public SituacaoAluno getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoAluno situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Aluno [Nome = " + getNome()
				+ ", Cpf = " + getCpf() 
				+ ", Endereço = " + getEndereço() 
				+ ", Email = " + getEmail()
				+ ", Telefone = " + getTelefone() 
				+ ", Situacao = " + situacao.getNomeSituacao()
				+ ", Media = " + getMedia()
				+ "]";
	}
}
