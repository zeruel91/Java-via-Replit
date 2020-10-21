
class Main {
  public static boolean isPrime(int n){

    boolean isS = true;
    for (int i = 2;i < (int)Math.sqrt(n);i++){
      if (n%i==0){
        isS=false;
        break;
      }

    }
    return isS;
  }
  public static void main(String[] args) {

    int number = 101;
    boolean ifPrime = Main.isPrime(number);

    if(ifPrime){
      System.out.printf("%d는 자기 자신과 1만으로 나누어 떨어지는 소수이다.",number);
    }else{
    System.out.println(number+" 는 소수가 아니다.");

    }
  }
}
