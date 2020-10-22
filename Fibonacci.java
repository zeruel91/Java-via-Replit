import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    array[0] = 1;
    array[1] = 1;
    for (int i = 2; i<n;i++){
      array[i] = array[i-1]+array[i-2];
      
    }
    System.out.println(array[n-1]);
    for (int i = 0;i<n;i++){
      System.out.print(array[i]+" ");

    }
  }
}

//25
//75025
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025
