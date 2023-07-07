package bank.application;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Sbi.rateOfInterest=7;
        Hdfc.rateOfInterest=6;
        Sbi account1=new Sbi(100000,"Arbaz alam","123");

        Sbi account2=new Sbi(150000,"Ayaz irfan","456");

        Hdfc account3=new Hdfc(150000,"Ayan irfan","789");


        int message1=account1.checkBalance("124");
        System.out.println(message1);


        int  message2=account1.checkBalance("123");
        System.out.println(message2);


        String message3=account2.addMoney(50000);
        System.out.println(message3);


        String message4=account3.withdrawMoney(50000,"1234");
        System.out.println(message4);


        String message5=account3.withdrawMoney(50000,"789");
        System.out.println(message5);


        double message6=account1.calTotalInterest(20);
        System.out.println("the total interest you will get"+" " +message6);


        double message7=account3.calTotalInterest(20);
        System.out.println("the total interest you will get"+" "+message7);

        System.out.println("make it more dynamic");

        System.out.println("Welcome to SBI,please enter details here:");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.next();

        System.out.println("Enter balance:");
        int initialBalance=sc.nextInt();

        System.out.println("Enter password:");
        String password=sc.next();

        Sbi sbiAccount=new Sbi(initialBalance,name,password);







    }
}