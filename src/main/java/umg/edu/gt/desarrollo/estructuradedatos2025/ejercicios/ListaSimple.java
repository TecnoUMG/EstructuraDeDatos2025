package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import lombok.Data;
import java.util.LinkedList;

@Data
public class ListaSimple<T> {
    private LinkedList<T> elementos = new LinkedList<>();

    public void anadir(T elemento) {
        elementos.add(elemento);
    }
}