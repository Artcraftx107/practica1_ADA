public class OrdenCubicoIter extends Metodo {
  public OrdenCubicoIter(){
    super(Orden.N3);
  }

  @Override
  public int codigo(int n) {
    int suma = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int z = 0; z < n; z++) {
          suma += i + z + j;
        }
      }
    }
    return suma;
  }
}