public class ComparaNyN2 {
  public static void main(String[] args){
    int[] tam = {1, 5, 10, 50, 100, 500, 1000};
    long[] tiempoN= Complejidad.medirTiempos(new OrdenLinealRec(), tam);
    long[] tiemposN2=Complejidad.medirTiempos(new OrdenCuadradoIter(), tam);

    for(int i = 0; i<tam.length; i++){
      System.out.printf("Tamaño: "+tam[i]+"\n\nTiempo 1: "+tiempoN[i]+"\n\nTiempo 2: "+tiemposN2[i]+"\n\n");
    }
  }
}
