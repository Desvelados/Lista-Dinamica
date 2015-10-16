/**
 * Created by bb185046 on 16/10/2015.
 */
public interface Lista {


        void irPrimero();
        void irUltimo();
        void insertarDespues(Object x);
        void insertarAntes(Object x);
        void eliminar();
        void irSiguiente();
        void irAnterior();
        void irA (int n);
        Object verActual();
        int verPosActual();
        int longitud();
        boolean esVacio();
        boolean finLista();
        void imprimirlista();
        void listaarchivo();
        void archivolista();

    }



