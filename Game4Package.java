//https://repl.it/@BlaisePascal/Game4Package#Main.java

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}


// 패키지는 다른 언어에서의 라이브러리를 말한다. 자바에서 기본적으로 제공되는 패키지도 있고 스스로 만들어쓰는 패키지가 있다. 
// import java.util.* -> 패키지 내의 모든 클래스들을 사용하겠다
// 패키지 이름은 디렉토리 경로와 비슷(같다)하다    \ -> .    (리눅스 유닉스 /)
package MyPackage;  //패키지 선언

public class MyClass {
  public void myMethod() {
    System.out.println("자바 프로그래밍");
  }
}
import MyPackage.*;// 패키지 사용 선언

public class PackageTest {

  public static void main(String[] args) {
    MyClass mc = new MyClass();
    // MyPackage 내에 있는 MyClass 사용

    mc.myMethod();
  }

}
