import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    double[] tab = {1,7,4,3,8,10,12,9,11,15};
    Arrays.sort(tab);
    for (double x : tab) {
      System.out.println(x);
}
    System.out.println("Mediana wynosi: " + (tab[4]+tab[5])/2);
  }
}