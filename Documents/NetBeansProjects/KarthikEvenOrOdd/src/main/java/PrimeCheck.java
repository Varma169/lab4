/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
public class PrimeCheck {
    int num =9;
    int rand = 0;
  int i;
  
    for( int i=2;  i<= num-1; i++){
    if(num % i == 0){
        rand = rand+1;
    }
    if(rand>0){
        System.out.println("Number is not a prime");
 
    }else{
         System.out.println("Number is a prime");  
    }
}
    
}
