import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner stdln = new Scanner(System.in);
    int n = stdln.nextInt();
    String array = stdln.nextLine();//입력
    String[] numbers = input.aplit(" ");//분리
    List<Integer> result = new ArrayList<Integer>();//인테저 리스트를 만든다.
    for(String number : numbers){//그곳에 추가
      result.add(Integer.parseInt(number));
    }

  }
}
