import java.util.Objects;

/**
 * Created by bb185046 on 16/10/2015.
 */
public class Nodo
{
    private Object dato;
    private Nodo prox;


    public Nodo (Object x, Nodo p)
    {
        dato=x;
        prox=p;
    }

    public Nodo getProx() {
        return prox;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
}
