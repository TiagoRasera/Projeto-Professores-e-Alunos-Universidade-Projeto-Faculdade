package enums;

public enum SituacaoAluno {

	ATIVO(1, "Ativo"),
	TRANCAMENTO(2, "Trancamento"),
	DESISTENTE(3, "Desistente"),
	CONCLUIDO(4, "Concluído");
	
	private int situacao;
	private String nomeSituacao;
	
	private SituacaoAluno(int situacao, String nomeSituacao) {
		this.situacao = situacao;
		this.nomeSituacao = nomeSituacao;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public String getNomeSituacao() {
		return nomeSituacao;
	}

	public void setNomeSituacao(String nomeSituacao) {
		this.nomeSituacao = nomeSituacao;
	}	
}
