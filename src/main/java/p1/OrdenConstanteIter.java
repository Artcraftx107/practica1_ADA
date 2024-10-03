package p1;

public class OrdenConstanteIter extends Metodo{
    public OrdenConstanteIter(){
        super(Orden.CTE);
    }

    @Override
    public int codigo(int n) {
        //Cualquiera de los casos van a ser O(1)
        return n; //Devolvemos cualquier valor constante, ya que esto es O(1)
    }
}