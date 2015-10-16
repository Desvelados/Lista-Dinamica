/**
 * Created by bb185046 on 16/10/2015.
 */
public class ListaDinamica implements Lista {

    private Nodo com;
    private Nodo ult;
    private Nodo actual;
    private int cantidad;

    public ListaDinamica()
    {
        com=new Nodo("cabecera",null);
        ult=actual=com;
        cantidad=0;

    }
    public boolean esVacio()
    {
        return cantidad==0;

    }
     public void irPrimero()
    {
        actual=com.getProx();
    }

    public void irUltimo()
    {
        actual=ult;
    }

    public int longitud()
    {
        return cantidad;
    }

    public Object verActual()
    {
        return actual.getDato();
    }


    public void irA(int k)
    {
        int cont =1;

        Nodo q=com.getProx();

        while(cont<k)
        {
            q= q.getProx();
            cont++;
        }
            actual=q;
    }


    public void irSiguiente()
    {
        actual=actual.getProx();
    }


    public void irAnterior()
    {
        Nodo q= com.getProx();
        Nodo ant= com;
        while (q!=actual)
        {
            ant=q;
            q=q.getProx();
        }
        actual=ant;
    }
}
