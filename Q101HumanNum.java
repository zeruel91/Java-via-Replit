class Main {
  public static void main(String[] args) {
    Human gildong = new Human("홍길동",170,60);
    Human chulsu = new Human("김철수",166,72);

    gildong.putData();
    System.out.println("number : " +gildong.getId());
    System.out.println();

    chulsu.putData();
    System.out.println("number : "+chulsu.getId());
  }
}

-------------Human.java-----------------

class Human{
  private static int counter = 0;
  //마지막 번호, (static : 정적, 변하지 않는다 고정)
  private String name;
  private int height;
  private int weight;
  private int id;

  Human(String name,int height, int weight){
    this.name = name;
    this.height = height;
    this.weight = weight;
    id = ++counter;
  }
  public int getId(){return id;}
  public void putData(){
    System.out.println(name+height+weight);
  }
}
