package homework_week4;

import java.util.Scanner;
/*
12. Write a programme to input any number and check if it is prime or not
 */

public class CheckPrimeNumber12 {

    public static void main(String[] args) {
        isPrimeNumber();
    }
public static void isPrimeNumber(){
    int i,m=0,flag=0;
    Scanner scr = new Scanner(System.in);
    System.out.println("Please input number");
    int n= scr.nextInt();
    //int n=3;//it is the number to be checked
    m=n/2;
    if(n==0||n==1){
        System.out.println(n+" is not prime number");
    }else{
        for(i=2;i<=m;i++){
            if(n%i==0){
                System.out.println(n+" is not prime number");
                flag=1;
                break;
            }
        }
        if(flag==0)  { System.out.println(n+" is prime number"); }
    }
    scr.close();
}

}
