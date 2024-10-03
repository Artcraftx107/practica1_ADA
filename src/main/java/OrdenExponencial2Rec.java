public class OrdenExponencial2Rec extends Metodo {
  public OrdenExponencial2Rec(){
    super(Orden.EXP2);
  }

  @Override
  public int codigo(int n) {
    if(n<1){
      return n;
    }
    return codigo(n-1)+codigo(n-2);
  }
}
