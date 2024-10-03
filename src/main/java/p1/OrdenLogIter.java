package p1;

public class OrdenLogIter extends Metodo{
    public OrdenLogIter(){
        super(Orden.LOGN);
    }

    @Override
    public int codigo(int n) {
        int suma = 0;
        while(n>1){
            suma+=n;
            n=n/2;
        }
        return suma;
    }
}
