/**
 * 
 */
package colecao;

import java.util.LinkedList;
import java.util.Queue;

/** Usando o framework Colection Queue
 * @author Bruno
 *
 */
public class ColecaoQueue {
	public static void main(String[] args){
		
		// REGRA FIFO
		Queue<String>	fila	=	new	LinkedList<>();
		fila.add("Bruno");
		fila.add("Naves");
		fila.add("Oliveira");
		fila.add("Paulo");
		fila.add("Cris");
		
		System.out.println(fila);
		System.out.println(fila.peek()); //MOSTRA QUEM É O PROX ELEMENTO DA FILA
		System.out.println(fila.poll()); //REMOVE O ELEMENTO DO INICIO DA FILA E IMPRIME
		System.out.println(fila);
		
		
		/*Outros metodos disponiveis em LinkedList*/
		LinkedList<String> f	=	(LinkedList<String>) fila;
		
		f.addLast("Juliana");
		f.addFirst("Bianca");
		System.out.println(f);
		
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
		
		System.out.println(f.pollFirst());
		System.out.println(f);
		
	
	}
}
