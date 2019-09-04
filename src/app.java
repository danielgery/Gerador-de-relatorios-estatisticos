import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {

		boolean validacao = false;
		String nomearquivo;
		if (args.length == 0) {

			System.out.print("Por favor, digite o nome do arquivo de entrada: ");

			Scanner sc1 = new Scanner(System.in);
			nomearquivo = sc1.nextLine();
		} else {
			nomearquivo = args[0];
		}
		if (!nomearquivo.endsWith(".txt")) {
			System.out.print("ERRO: arquivo com formato inválido.");
			System.exit(0);
		}
		if (nomearquivo == null || nomearquivo.equals("")) {
			System.out.print("1ERRO: opção de relatório inválida.");
			System.exit(0);
		}
		{
			try {
				Leitura.lerTexto(nomearquivo);
			} catch (FileNotFoundException e) {
				System.out.print("ERRO: arquivo inexistente.");
				;
				System.exit(0);
			}
		}

		Tarefas tarefa = new Tarefas();

		System.out.print("Opções de relatório:\r\n" + "(1) Ordem alfabética crescente das palavras\r\n"
				+ "(2) Ordem alfabética decrescente das palavras\r\n" + "(3) Quantidade crescente de ocorrências\r\n"
				+ "(4) Quantidade decrescente de ocorrências\r\n" + "Indique a opção desejada:");

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

		if (!(numero.equals("1") || numero.equals("2") || numero.equals("3") || numero.equals("4"))) {
			System.out.println("ERRO: Opção inválida.");
			System.exit(0);
		}

		try {
			Gravar.salvar(nomearquivo);
		} catch (FileNotFoundException e) {
			System.out.println("ERRO: geração do arquivo de saída.");
			System.exit(0);
		}
		nomearquivo = nomearquivo.substring(0, nomearquivo.length() - 4);
		System.out.println("Relatório gerado. Arquivo " + nomearquivo + "-res.txt gerado.");

	}

}