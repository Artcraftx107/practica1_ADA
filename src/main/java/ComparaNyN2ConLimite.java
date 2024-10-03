public class ComparaNyN2ConLimite {
  public static void main(String[] args) {
    int[] tam = {1, 5, 10, 50, 100, 500, 1000};

    long[] tiempoN = Complejidad.medirTiempos(new OrdenLinealRec(), tam);
    long[] tiemposN2 = Complejidad.medirTiempos(new OrdenCuadradoIter(), tam);

    for (int i = 0; i < tam.length; i++) {
      if (tam[i] == 10) {
        tiempoN[i] += 1000;
      }
    }

    System.out.printf("%-10s %-20s %-20s %-20s\n", "Tamaño", "Tiempo 1", "Tiempo 2", "Cociente T1/T2");
    System.out.println("--------------------------------------------------------------");
    for (int i = 0; i < tam.length; i++) {
      double cociente = (double) tiempoN[i] / (double) tiemposN2[i];
      System.out.printf("%-10d %-20d %-20d %-20.6f\n", tam[i], tiempoN[i], tiemposN2[i], cociente);
    }
  }
}
