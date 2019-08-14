import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class Gravar {
	public static void salvar (String nome) throws FileNotFoundException {
		String arquivo="";
		for (int i=0;i<GerenciadorPalavra.resultado.size();i++) {
			arquivo = arquivo+GerenciadorPalavra.resultado.get(i).getNome()+";"+GerenciadorPalavra.resultado.get(i).getOcorrencias();
			if (i!=GerenciadorPalavra.resultado.size()-1) {
				arquivo = arquivo+"\n";
			}
					
		}
		try (PrintStream out = new PrintStream(
				new FileOutputStream(nome+"-res.txt"))) {
			out.print(arquivo);	
	}
	}

}
