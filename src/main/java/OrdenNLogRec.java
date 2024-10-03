public class OrdenNLogRec extends Metodo {

  public OrdenNLogRec() {
    super(Orden.NLOGN);
  }

  @Override
  public int codigo(int n) {
    if (n <= 1) {
      return n;
    }

    return linearWork(n) + codigo(n / 2);
  }


  private int linearWork(int n) {
    if (n <= 0) {
      return 0;
    }

    return n + linearWork(n - 1);
  }
}