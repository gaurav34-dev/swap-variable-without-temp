import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //System.out.println("please enter a number");
    //Scanner s= new Scanner(System.in);
    //while(true)
    //{
    System.out.println("please enter two number");
    Scanner s= new Scanner(System.in);
    int x=s.nextInt();
    int y=s.nextInt();
    System.out.println("value of x is "+ x);
    System.out.println("value of y is "+ y);
    x = x * y; // x now becomes 50
    y = x / y; // y becomes 10
    x = x / y;
    System.out.println("value of x is "+ x);
    System.out.println("value of y is "+ y);
    //}
}
}


//swap two number without third variable