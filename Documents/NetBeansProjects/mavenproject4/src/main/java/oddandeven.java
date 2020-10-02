
import java.util.Random;

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
   int RANDOM = 100;
   int COUNTOFEVEN =0;
   int COUNTOFODD = 0;
    
Random randomNum = new Random();

for( int i = 1; i<= RANDOM; i++)
{ 
   if( isEven( randomNum.nextInt(i)))
{ 
   COUNTOFEVEN = COUNTOFEVEN+1;
}
else
{
 COUNTOFODD = COUNTOFODD+ 1;
}
}

System.out.println("THE GIVEN NUMBE IS EVEN : "+COUNTOFEVEN);

System.out.println("THE GIVEN NUMBER IS ODD : "+COUNTOFODD);
}

public static boolean isEven( int n)
{
  if( n%2 == 0)
  {
     return true;
  }
   return false;
}}
