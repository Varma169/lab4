/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
public class primenumber {
 public static void main(String[] args) {
     int NUMBER;
  Scanner value = new Scanner(System.in);
System.out.println("Enter a num:");
NUMBER = value.nextInt();
if(isPrime(NUMBER))
{
   System.out.println(NUMBER+ " is a prime number");
  }
else
{
System.out.println(NUMBER+ " is not a prime number");
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
