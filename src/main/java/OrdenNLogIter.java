public class OrdenNLogIter extends Metodo {
  public OrdenNLogIter(){
    super(Orden.NLOGN);
  }

  @Override
  public int codigo(int n) {
    int suma = 0;
    for(int i = 0; i<n; i++){
      int j = n;
      while(j>1){
        suma+=i+j;
        j=j/2;
      }
    }
    return suma;
  }
}
