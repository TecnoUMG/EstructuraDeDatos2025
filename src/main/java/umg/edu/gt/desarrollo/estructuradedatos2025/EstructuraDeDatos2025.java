/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package umg.edu.gt.desarrollo.estructuradedatos2025;

import java.util.Arrays;
import lombok.*;
import java.util.HashSet;
import java.util.LinkedList;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import umg.edu.gt.desarrollo.estructuradedatos2025.clases.ClaseVectores;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioLinkedList;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioVectores;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.ListaSimple;

import static umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioLinkedList.DupliEliminados;
import static umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioLinkedList.invertLista;
/**
 *
 * @author wcordova
 */
@Log4j2
class EstructuraDeDatos2025 {
    private static final Logger logger = LogManager.getLogger(EstructuraDeDatos2025.class);
    public static void main(String[] args) {

        //PARA AGREGAR ELEMENTOS (EJ. DE LOMBOK)
        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.anadir(5);
        lista.anadir(6);
        lista.anadir(7);

        System.out.println("Lista con elementos anadidos: " + lista.getElementos());



        //PARA ELIMINAR DUPLICADOS
        System.out.println("Eliminando duplicados..");
        LinkedList<Integer> ListaOrigin = new LinkedList<>();
        ListaOrigin.add(1);
        ListaOrigin.add(2);
        ListaOrigin.add(2);
        ListaOrigin.add(3);
        ListaOrigin.add(4);
        ListaOrigin.add(4);

        System.out.println("Lista original: " + ListaOrigin);
        LinkedList<Integer> ListaSinDuplicados = DupliEliminados(ListaOrigin);
        System.out.println("Lista sin duplicado: " + ListaSinDuplicados);
        //PARA INVERTIR LISTAS
        System.out.println("Inviertiendo listas...");
        LinkedList<String> ListaString = new LinkedList<>();
        ListaString.add("Hola!");
        ListaString.add("a todos");
        ListaString.add("que tal");
        ListaString.add("a programar");

        System.out.println("Lista original: " + ListaString);
        invertLista(ListaString);
        System.out.println("Lista invertida: " + ListaString);
        // PARA INTERCALAR LISTAS
        System.out.println("Intercalando listas...");
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);

        LinkedList<Integer> lista2 = new LinkedList<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        LinkedList<Integer> listaIntercalada = interListas(lista1, lista2);
        System.out.println("Lista intercalada: " + listaIntercalada);


    }


    // METODOS DE LOS PROBLEMAS 1, 2 Y 3

    public static LinkedList<Integer> DupliEliminados(LinkedList<Integer> lista) {
        return EjercicioLinkedList.DupliEliminados(lista);
    }

    public static void invertLista(LinkedList<String> lista) {
        EjercicioLinkedList.invertLista(lista);
    }

    public static LinkedList<Integer> interListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
        return EjercicioLinkedList.interListas(lista1, lista2);

    }






}