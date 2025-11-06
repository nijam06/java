package Homework;




import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0){
            System.out.println("Number is positive");
        }
        else if (a==0){
            System.out.println("Number is 0");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}
