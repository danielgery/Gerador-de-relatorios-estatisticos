import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tarefas {
	ArrayList<Palavra> saida = new ArrayList<Palavra>();
	/*
	 * (1) Ordem alfab�tica crescente das palavras (2) Ordem alfab�tica decrescente
	 * das palavras (3) Quantidade crescente de ocorr�ncias (4) Quantidade
	 * decrescente de ocorr�ncias
	 * 
	 */

	public void oac() {
		ArrayList<String> aux = new ArrayList<String>();
		for (int i = 0; i < GerenciadorPalavra.palavras.size(); i++) {
			aux.add(GerenciadorPalavra.palavras.get(i).getNome());
		}
		Collections.sort(aux);

		for (int i = 0; i < aux.size(); i++) {
			for (int j = 0; j < GerenciadorPalavra.palavras.size(); j++) {
				if (GerenciadorPalavra.palavras.get(j).getNome().equals(aux.get(i))) {
					Palavra palavra = new Palavra(aux.get(i), GerenciadorPalavra.palavras.get(j).getOcorrencias());
					GerenciadorPalavra.resultado.add(palavra);
					break;
				}
			}

		}

	}

	public void oad() {
		oac();
		Collections.reverse(GerenciadorPalavra.resultado);

	}

	public void qco() {
		int maior = 0;
		for (int i = 0; i < GerenciadorPalavra.palavras.size(); i++) {
			if (GerenciadorPalavra.palavras.get(i).getOcorrencias() > maior) {
				maior = GerenciadorPalavra.palavras.get(i).getOcorrencias();
			}

		}
		for (int i = 0; i < maior + 1; i++) {
			for (int j = 0; j < GerenciadorPalavra.palavras.size(); j++) {
				if (GerenciadorPalavra.palavras.get(j).getOcorrencias() == i) {
					Palavra palavra = new Palavra(GerenciadorPalavra.palavras.get(j).getNome(), i);
					GerenciadorPalavra.resultado.add(palavra);
				}
			}
		}

	}

	public void qdo() {
		qco();
		Collections.reverse(GerenciadorPalavra.resultado);
	}

}