import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class app {

	public static void main(String[] args) throws FileNotFoundException {
System.out.print("Por favor, digite o nome do arquivo de entrada: ");
String nomearquivo ="";
Scanner sc1 = new Scanner(System.in);
nomearquivo=sc1.next();

Leitura.lerTexto(nomearquivo+".txt");	

Tarefas tarefa = new Tarefas();

System.out.print("Opções de relatório:\r\n" + 
		"(1) Ordem alfabética crescente das palavras\r\n" + 
		"(2) Ordem alfabética decrescente das palavras\r\n" + 
		"(3) Quantidade crescente de ocorrências\r\n" + 
		"(4) Quantidade decrescente de ocorrências\r\n" + 
		"Indique a opção desejada:");

String numero ="";
Scanner sc2 = new Scanner(System.in);
numero=sc2.next();
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


Gravar.salvar(nomearquivo);
System.out.println("Relatório gerado. Arquivo "+nomearquivo+"-res.txt gerado.");
		
	}

}
