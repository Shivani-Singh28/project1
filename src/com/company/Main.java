package com.company;
//EXCEPTION HANDLING
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int a;
        int b;
        int ar[]={12,13,14,15,16};
        int index;
        try(Scanner s =new Scanner(System.in)){
            a=s.nextInt();
            b=s.nextInt();
            index=s.nextInt();
            System.out.println(a/b);
            System.out.println(ar[index]);

        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException obj){
            System.out.println(obj.getClass().getName());

        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("End");
    }
    }

