import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class app {

	public static void main(String[] args) throws FileNotFoundException {
Leitura.lerTexto("arquivo.txt");	

Tarefas tarefa = new Tarefas();

//tarefa.oac();
//tarefa.oad();
//tarefa.qco();
tarefa.qdo();
Gravar.salvar("arquivo");
		
	}

}
