package com.sjprogramming;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
        int login=2342;
        int atmpinnumber=321;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Atm Number : ");
        int atmNumber=in.nextInt();
        System.out.print("Enter Pin: ");
        int pin=in.nextInt();

        if((login!=atmNumber)||(atmpinnumber!=pin)){
            System.out.println("Incorrect Atm Number or pin");
            System.exit(0);
        }
        while(true){
            System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Transaction History\n5.Exit");
            System.out.println("Enter Choice : ");
            int choice=in.nextInt();
            if(choice==1){
                op.viewBalance();

            }
            else if(choice==2){
                System.out.println("Enter amount to withdraw ");
                double withdrawAmount=in.nextDouble();
                op.withdrawAmount(withdrawAmount);

            }
            else if(choice==3){
                System.out.println("Enter Amount to Deposit :");
                double depositAmount=in.nextDouble();//5000
                op.depositAmount(depositAmount);


            }
            else if(choice==4){
                op.viewMiniStatement();

            }
            else if(choice==5){
                System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                System.exit(0);
            }
            else
            {
                System.out.println("Please enter correct choice");
            }
        }


    }
}
