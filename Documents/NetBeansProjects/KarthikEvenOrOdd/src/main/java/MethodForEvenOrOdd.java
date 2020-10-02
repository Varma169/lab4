/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */import java.util.Scanner;
	public class MethodForEvenOrOdd
	{
	public static void isEven(int Num){ 
	if((Num%2)==0)
	{
	System.out.println("Num Is Even");
	}
	else
	{
	System.out.println("Num Is Odd");
	}
	}
	public static void main(String args[])
	{
	int n,Evencount=0,Oddcount=0,num=0;
	System.out.println("Enter any number: ");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	isEven(num); 
	for(n=1;n<=100;n++) 
	{
	if(n%2==0)//
	{
	Evencount++;
        
	  
	}
	else
	{
	Oddcount++;

	}
	}

	System.out.println("The  number of Even Numbers are: "+Evencount);
	System.out.println("The  number of Odd Numbers are: "+Oddcount);
        
	}
}