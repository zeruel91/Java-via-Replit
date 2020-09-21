import java.util.Scanner;

class Main {
                      //       [1] [2] [3]
                        //  1   3   4   7   9   11
                           // a ,    1 ,      3
    static void aryRmvN(int[] a, int idx, int n) {
      if (n > 0 && idx >= 0 && idx + n < a.length) {
        int idx2 = idx + n - 1;
                //  1  + 3 -1 = 3 <- idx2

        if (idx2 > a.length - n - 1)
          // 3   >  6 - 3 -1 = 2
          idx2 = a.length - n - 1;
          // idx2 => 2
        for (int i = idx ; i <= idx2; i ++)
          //          1     1      2
         
        a[i] = a[i + n];  
     //   1     1 + 3 -> 4
      }
    }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("요소 수 : ");
    int num = stdIn.nextInt();
    int[] a = new int[num];

    for (int i = 0 ; i < num ; i++) {
      System.out.print("a[" + i + "] : ");
      a[i] = stdIn.nextInt();
    }

    System.out.print("삭제를 시작할 인덱스 : ");
    int idx = stdIn.nextInt();

    System.out.print("삭제할 요소의 수 : ");
    int n = stdIn.nextInt();

    aryRmvN(a, idx, n);
    for (int i = 0 ; i < num ; i++)
      System.out.println("a[" + i + "] = " + a[i]);
  }
}
