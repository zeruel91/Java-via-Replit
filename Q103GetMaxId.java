class Main {
  public static void main(String[] args) {

    Id a = new Id();
    Id b = new Id();

    System.out.println("a의 식별 번호:"+ a.getId());
    System.out.println("b의 식별 번호:"+ b.getId());

    System.out.println("마지막으로 부여한 식별 번호 = " + Id.getMaxId());
    System.out.println("마지막으로 부여한 식별 번호 = " + a.getMaxId());
    System.out.println("마지막으로 부여한 식별 번호 = " + b.getMaxId());
  }
}

//class Id.java

class Id {

  private static int counter = 0;
  private int id;

  public Id() {
    id = ++counter;
  }

  public int getId() {
    return id;
  }

  public static int getMaxId() {  //특정 인스턴스에 소속되지 않는다.
    return counter;
  }

}

// 인스턴스 메서드는 개별 인스턴스에 소속된다.
// 자원 소속된 인스턴스의 변수, 메서드 와 
// 모두가 공유하는 변수, 메서드 양쪽에 접근 할수 있다. 

// 클래스 메서드는 인스턴스에 속하지 않기때문에 자신이 소속된 인스턴의 변수, 메서드를 가지지 않는다.
따라서 모두가 공유하는 변수, 메서드만 접근할 수 있다. 

// 예를 들어, 클래스 매서드 getMaxId 안에서는 인스턴스 변수 id접근할수 없다. 어떤 인스턴스의 id에 접
근해야 할지를 결정할 수 없기 때문이다. 예외 : 자신이 속한 클래스형의 인스턴스 참조를 매개 변수 r로 받
아서 r.id형식으로 인스턴스 변수에 접근할 수는 있다. 
