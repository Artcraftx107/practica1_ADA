public class OrdenLogRec extends Metodo {
  public OrdenLogRec(){
    super(Orden.LOGN);
  }

  @Override
  public int codigo(int n) {
    if(n<1){
      return n;
    }
    return n+codigo(n/2);
  }
}
