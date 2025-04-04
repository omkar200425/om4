
import java.util.Scanner;
public class calculator{
   public static void main(String[] numbers) {
      double no1;
      double no2;
      double ans;
      char op;
      Scanner mynum= new Scanner(System.in);
      System.out.println("enter the first number");
      no1=mynum.nextDouble();
      System.out.println("enter the second number");
      no2=mynum.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = mynum.next().charAt (0);
      switch(op) {
         case '+': ans = no1 + no2;
            break;
         case '-': ans = no1 - no2;
            break;
         case '*': ans = no1 * no2;
            break;
         case '/': ans = no1 / no2;
            break;
         case '%': ans = no1/ no2;
            break;
            
      default: System.out.println("ENTER THE APPROPRIATE OPERATOR");
         return;
      }
      System.out.println("\nThe result is given as follows:\n");
      System.out.println(no1 + " "  + " " + no2 + " = " + ans);
   
}
}