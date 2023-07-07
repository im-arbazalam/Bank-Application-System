package bank.application;

import java.util.UUID;

public class Sbi implements Bank{
    private int balance;
    public  String name;
    private String  accountNo;
    public static double rateOfInterest;
    private String password;

    public Sbi(int balance, String name, String password) {
        this.accountNo= UUID.randomUUID().toString();
        this.balance = balance;
        this.name = name;
        this.password = password;
    }

    @Override
    public int checkBalance(String password) {
        if(password==this.password){
            return balance;
        }
        return -1;
    }

    @Override
    public String addMoney(int money) {
        balance=balance+money;

        String message= money+" "+"has been added to bankAccount"+" "+accountNo+" "+"total balance now:"+balance;
        return message;
    }

    @Override
    public String withdrawMoney(int drawMoney, String password) {
        if(password==this.password){
            if(drawMoney>balance){
                return "insufficient balance";
            } else{
                balance=balance-drawMoney;
                return "money withdraw successfully"+"remaining balance is:"+balance;
            }
        } else{
            return "wrong password";
        }

    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        //this means current password
        if(this.password==oldPassword){
            this.password=newPassword;
            return "password has been changed successfully";
        }else{
            return "wrong password";
        }

    }

    @Override
    public double calTotalInterest(int years) {
        double interest=(balance*rateOfInterest*years)/100;
        return interest;
    }
}
