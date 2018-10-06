
package f2c;
import java.util.Scanner;


public class F2C {
    double input;
    double result=0;
    
    public static void main(String[] args) {
        
        
        System.out.println("Enter Fahrenheit");
        Scanner sc=new Scanner(System.in);
        double input=sc.nextDouble();
        
        
        
        double minus=input-32;
        double divide=0.56;
        double result=minus*divide;
        
        
        System.out.print("The Conversion Result is "+result);
        System.out.print("C");
        
    }
    
}
