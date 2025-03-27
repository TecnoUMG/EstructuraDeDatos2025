package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;


import java.util.HashSet;
import java.util.LinkedList;

public class EjercicioLinkedList {
	/** INSTRUCCIONES
 	Escriba el algoritmo que resuelve el problema en esta clase.
	Debe crear un package llamado
	 umg.edu.gt.test.EjercicioLinkedList que corresponda al Test de esta clase.
	Genere un Test por cada ejemplo y
	 fuerce que uno de esos Test falle, puede implementar retornar un resultado
	y compararlo con el esperado.
	 */


//PROBLEMA 1
public static LinkedList<Integer>DupliEliminados(LinkedList<Integer>lista) {
	HashSet<Integer> elemenVistos = new HashSet<>();
LinkedList<Integer> resultado = new LinkedList<>();
for (Integer elem : lista) {
if (!elemenVistos.contains(elem)){
	elemenVistos.add(elem);
	resultado.add(elem);

}
}
return resultado;
}
	
	//PROBLEMA 2
public static void invertLista(LinkedList<String>lista){
int tamano = lista.size();
for (int indice = 0; indice < tamano / 2; indice++) {
String tempo = lista.get(indice);
lista.set(indice, lista.get(tamano - 1 - indice));
lista.set(tamano - 1 - indice, tempo);
}
}

//PROBLEMA 3
public static LinkedList<Integer>interListas(LinkedList<Integer>lista1, LinkedList<Integer>lista2) {
	LinkedList<Integer> resultado = new LinkedList<>();
	int indice = 0;
	int indice2 = 0;

	while (indice < lista1.size() && indice2 < lista2.size()) {
		if (lista1.get(indice)<(lista2.get(indice2))) {
			resultado.add(lista1.get(indice++));
		} else {
			resultado.add(lista2.get(indice2++));
		}
	}
		while (indice < lista1.size()) {
			resultado.add(lista1.get(indice++));
		}
		while (indice2 < lista2.size()) {
			resultado.add(lista2.get(indice2++));
		}
		return resultado;
}



	// Problema 1: Dada una LinkedList<Integer>, escribir un método que elimine los valores duplicados, dejando solo la primera aparición de cada número.
	// Problema 2: Implementar un método que invierta los elementos de una LinkedList<String> sin usar otra lista o ArrayList.
	// Problema 3: Dadas dos listas enlazadas ordenadas de enteros, escribir un método que devuelva una nueva LinkedList<Integer> con los elementos de ambas listas intercalados en orden.
}
