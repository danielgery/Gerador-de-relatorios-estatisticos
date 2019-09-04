
public class Palavra {
	private String nome;
	private int ocorrencias;

	public Palavra(String nome, int ocorrencias) {
		super();
		this.nome = nome;
		this.ocorrencias = ocorrencias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(int ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	@Override
	public String toString() {
		return "Palavra [nome=" + nome + ", ocorrencias=" + ocorrencias + "]\n";
	}

}