package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ColecaoSet {

	public static void main(String[] args) {
		
		                      //HASHSET: estrutura de dados que armazena valor (único), não ordenados e sem repetição
		Set<String> setFrutas = new HashSet<String>();
		
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("KIWI");
		
		//percorre os objetos da lista (iterator)
		Iterator<String> isetFrutas = setFrutas.iterator();

		while (isetFrutas.hasNext()) {
			System.out.println(isetFrutas.next());
			
		}

		/*for(var fruta : setFrutas)
			System.out.println(fruta.hashCode());*/
		
		System.out.println("Existe a fruta manga?" + setFrutas.contains("manga"));
		
		
		setFrutas.remove("Kiwi");
		
		//atualizar a lista depois da alteração
		for(var fruta : setFrutas)
			System.out.println(fruta);
	}

}

