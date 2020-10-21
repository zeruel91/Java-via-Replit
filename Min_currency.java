import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sd = new Scanner(System.in); 

    int n = sd.nextInt();        // n 입력받기
    int m = sd.nextInt();        // m 입력받기
    
    int[] d = new int[m+1];      // d라는 배열 만들어놓기

    int[] x = new int[n];         // x배열 받기
    for (int i = 0; i < n; i++) {
      x[i] = sd.nextInt();
    }
    
    for(int i=0; i<d.length; i++) {
      d[i]=10001;                 // d배열 10001로 채워넣기(초기화)
    }

    d[0] = 0;                     
    for(int i = 0; i < n; i++) {
      for(int j = x[i]; j <= m; j++) {
        if(d[j-x[i]] != 10001) {
          d[j] = Math.min(d[j],d[j-x[i]] +1);
        }
      }
    }

    if(d[m] == 10001) {
      System.out.println(-1);
    }
    else {
      System.out.println(d[m]);
    }

  }
}
