package entidades;

import enums.SituacaoAluno;

public class Aluno extends Pessoa {

	private double media;
	private SituacaoAluno situacao;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String cpf, String endere�o, String email, String telefone,
				double media, SituacaoAluno situacao) {
		super(nome, cpf, endere�o, email, telefone);
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
				+ ", Endere�o = " + getEndere�o() 
				+ ", Email = " + getEmail()
				+ ", Telefone = " + getTelefone() 
				+ ", Situacao = " + situacao.getNomeSituacao()
				+ ", Media = " + getMedia()
				+ "]";
	}
}
