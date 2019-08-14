import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Leitura {

	public static void lerTexto(String caminho) throws FileNotFoundException {
		
		//Path 
		FileInputStream path2 = new FileInputStream(caminho);
	 
		DataInputStream in = new DataInputStream (path2);

	 String palavra ="";

	 String ocorrencia="";
	 
int ocorrencias=1;		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
			String linha = null;

			while ((linha = br.readLine()) != null) {
				Scanner scanner = new Scanner(linha);

				Scanner sc = scanner.useDelimiter(";");
 
				
				palavra = sc.next().trim();
				
			ocorrencia = sc.next();
			
			for (int i=0; i<ocorrencia.length();i++) {
				
				if (ocorrencia.substring(i, i+1).equals(",")) {
					
					ocorrencias=ocorrencias+1;
					
				}
				
				
			}
			
			
			Palavra palavraa = new Palavra(palavra,ocorrencias);
			GerenciadorPalavra.palavras.add(palavraa);
			
			ocorrencias =1;
				
			
			}
			
		} catch (IOException x) {

		}


	}




}
