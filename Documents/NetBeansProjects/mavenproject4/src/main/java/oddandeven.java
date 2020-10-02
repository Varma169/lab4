/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
public class oddandeven {
   public static void main(String args[ ])
{
   int num;
  Scanner sc = new Scanner(System.in);
System.out.println("Enter a num:");
num = sc.nextInt();
if(isPrime(num))
{
   System.out.println(num+ " is a prime number");
  }
else
{
System.out.println(num+ " is not a prime number");
   }
}

public static boolean isPrime(int num)
{
    if( num <= 1)
     {
         return false;
     }
   for( int i= 2;i<=num/2; i++)
{ 
   if (num%i == 0)
  { 
     return false;
  }
}
return true;
}
}
import java.util.*
public class evenOdd
{
   public static void main(String args[ ])
{
   int randomNumbers = 100;
   int evenCount =0;
   int oddCount = 0;
    
Random randomNum = new Random();

for( int i = 1; i<= randomNumbers; i++)
{ 
   if( isEven( randomNum.nextInt(i)))
{ 
   evenCount = evenCount+1;
}
else
{
 oddCount = oddCount+ 1;
}
}

System.out.println("even numbers count is : "+evenCount);

System.out.println("odd numbers count is : "+oddCount);
}

public static boolean isEven( int n)
{
  if( n%2 == 0)
  {
     return true;
  }
   return false;
}