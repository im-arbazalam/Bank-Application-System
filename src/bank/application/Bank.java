package bank.application;

public interface Bank {
    public int checkBalance(String password);

    public String addMoney(int money);

    public String  withdrawMoney(int money,String password);

    public String changePassword(String oldPassword,String newPassword);

    public double calTotalInterest(int years);
}
