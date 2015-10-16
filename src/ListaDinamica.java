/**
 * Created by bb185046 on 16/10/2015.
 */
public class ListaDinamica  {

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
    public boolean esVacia()
    {
        return cantidad==0;

    }
  /*  public void irPrimero()
    {
        actual=com.getProx();
    }
    */
}
