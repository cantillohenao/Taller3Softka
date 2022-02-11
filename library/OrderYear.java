package library;

import library.Info;
import java.util.Comparator;

/**
 * [la clase OrderYear nos apoya como clase de utilidad. para asi sobreescribir
 * el metodo compare facilitando el ordenamiento del arrayList por fecha
 *
 *
 * @version [1.0.000 2022-02-10]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-10]
 *
 */
public class OrderYear implements Comparator<Info> {

    /**
     * [Con este metodo, se recorre el arrayList comparando los parametros
     * asignados. en este caso fecha de la cancion
     *
     *
     * @return valor 0 objetos iguales
     * @return valor 1. el objeto inicial tiene mayor prioridad que el anterior
     * por parametro
     *
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-10]
     *
     */
    @Override
    public int compare(Info o1, Info o2) {
        if (o1.getYear() > o2.getYear()) {
            return -1; // es menor 
        } else if (o1.getYear() > o2.getYear()) {
            return 0; // son iguales
        } else {
            return 1; // es mayor
        }
    }
}
