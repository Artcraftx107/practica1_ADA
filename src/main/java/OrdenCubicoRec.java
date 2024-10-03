public class OrdenCubicoRec extends Metodo {
  public OrdenCubicoRec(){
    super(Orden.N3);
  }

  @Override
  public int codigo(int n) {
    if(n==0){
      return 0;
    }
    return n+auxRecursivo(n)+codigo(n-1);
  }

  private int auxRecursivo(int n) {
    if(n==0){
      return 0;
    }
    return n+auxRecursivo(n-1)+newRecursivoLoop(n);
  }

  private int newRecursivoLoop(int n) {
    if(n==0){
      return 0;
    }
    return n+newRecursivoLoop(n-1);
  }
}