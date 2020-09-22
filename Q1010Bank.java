import java.util.GregorianCalendar;
//about date
import java.util.Random;

class Main {
  public static void main(String[] args) {
    GregorianCalendar today = new GregorianCalendar();
    int y =today.get(GregorianCalendar.YEAR);
    int m = today.get(GregorianCalendar.MONTH)+1;
    int d = today.get(GregorianCalendar.DATE);

    System.out.printf("today is %d year %d %d\n",y,m,d);
    Random rd = new Random();
    int k = rd.nextInt(9);
    String fortune = "";
    System.out.print("your fortune today is ");
    switch (k) {
      case 1: fortune = "대길";
    System.out.print(fortune);
       break;
      case 2: fortune = "중길"; 
    System.out.print(fortune);
      break;
      case 3: fortune = "소길";
    System.out.print(fortune);
       break;
      case 4: fortune = "길"; 
    System.out.print(fortune);
      break;
      case 5: fortune = "흉"; 
    System.out.print(fortune);
      break;
      case 6: fortune = "길"; 
    System.out.print(fortune);
      break;
      case 7: case 8: case 9: fortune = "중길"; 
    System.out.print(fortune);
      break;

    }
