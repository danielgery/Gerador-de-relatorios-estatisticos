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

System.out.print("Op��es de relat�rio:\r\n" + 
		"(1) Ordem alfab�tica crescente das palavras\r\n" + 
		"(2) Ordem alfab�tica decrescente das palavras\r\n" + 
		"(3) Quantidade crescente de ocorr�ncias\r\n" + 
		"(4) Quantidade decrescente de ocorr�ncias\r\n" + 
		"Indique a op��o desejada:");

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
System.out.println("Relat�rio gerado. Arquivo "+nomearquivo+"-res.txt gerado.");
		
	}

}
