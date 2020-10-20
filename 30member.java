public class Main {
  public static final int PHYSICAL = 23;
  public double getBioRhythm(long days, int index, int max){
    return max*Math.sin((days%index)*2*Math.PI/index);
  }
  public static void main(String[] args){
    int days = 1200;
    Main bio = new Main();
    double phyval = bio.getBioRhythm(days, PHYSICAL,100);
    System.out.printf("나의 신체지수 %1$.2f 입니다.\n",phyval);
  }
}

