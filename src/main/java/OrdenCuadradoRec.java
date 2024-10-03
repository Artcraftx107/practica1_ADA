public class OrdenCuadradoRec extends Metodo {
  public OrdenCuadradoRec(){
    super(Orden.N2);
  }

  @Override
  public int codigo(int n) {
    if(n==0){
      return 0;
    }
    return n+codigo(n-1)+recursividadAuxiliar(n);
  }

  private int recursividadAuxiliar(int n){
    if(n==0){
      return 0;
    }
    return n+recursividadAuxiliar(n-1);
  }
}