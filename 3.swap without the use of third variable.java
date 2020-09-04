import java.util.*;
class Main
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter x and y");
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println("Before Swapping");
    System.out.println("x = "+x);
    System.out.println("y = "+y);
    x=x^y;
    y=x^y;
    x=x^y;
    System.out.println("After Swapping without a third variable");
    System.out.println("x = "+x);
    System.out.println("y = "+y);
}
}