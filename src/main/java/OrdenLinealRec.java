public class OrdenLinealRec extends Metodo {
  public OrdenLinealRec(){
    super(Orden.N);
  }

  @Override
  public int codigo(int n) {
    if(n==0){
      return 0;
    }

    return n+codigo(n-1);
  }
}
