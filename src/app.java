import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class app {

	public static void main(String[] args){
		
		boolean validacao = false;
		String nomearquivo;
		if (args.length == 0) {

			System.out.print("Por favor, digite o nome do arquivo de entrada: ");

			Scanner sc1 = new Scanner(System.in);
			nomearquivo = sc1.nextLine();
		} else {
			nomearquivo = args[0];
		}
		if(!nomearquivo.endsWith(".txt")) {
			System.out.print("ERRO: arquivo com formato inv�lido.");
			System.exit(0);
		}
		if(nomearquivo == null || nomearquivo.equals("")) {
			System.out.print("1ERRO: op��o de relat�rio inv�lida.");
			System.exit(0);
		}{
		try {
			Leitura.lerTexto(nomearquivo);
		} catch (FileNotFoundException e) {
			System.out.print("ERRO: arquivo inexistente.");;
			System.exit(0);
		}
		}

		

		Tarefas tarefa = new Tarefas();

		System.out.print("Op��es de relat�rio:\r\n" + "(1) Ordem alfab�tica crescente das palavras\r\n"
				+ "(2) Ordem alfab�tica decrescente das palavras\r\n" + "(3) Quantidade crescente de ocorr�ncias\r\n"
				+ "(4) Quantidade decrescente de ocorr�ncias\r\n" + "Indique a op��o desejada:");

		String numero = "";
		Scanner sc2 = new Scanner(System.in);
		numero = sc2.next();

		if (numero.equals("1")) {
			tarefa.oac();
		}
		if (numero.equals("2")) {
			tarefa.oad();
		}
		if (numero.equals("3")) {
			tarefa.qco();
		}
		if (numero.equals("4")) {
			tarefa.qdo();
		}
		
		if (!(numero.equals("1")||numero.equals("2")||numero.equals("3")||numero.equals("4"))) {
			System.out.println("ERRO: Op��o inv�lida.");
			System.exit(0);
		}

		
		try {
			Gravar.salvar(nomearquivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO: gera��o do arquivo de sa�da.");
			System.exit(0);
		}
		nomearquivo=nomearquivo.substring(0, nomearquivo.length()-4);
		System.out.println("Relat�rio gerado. Arquivo " + nomearquivo + "-res.txt gerado.");

	}

}
