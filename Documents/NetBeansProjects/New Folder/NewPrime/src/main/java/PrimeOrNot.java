
import java.util.Scanner;


public class PrimeOrNot {

      public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
       int  i = 2;
int num ;
System.out.println("ENTER THE NUMBER:-");
        num=sc.nextInt();
        
        boolean flag = false;
        while(i <= num/2)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

        
    


