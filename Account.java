package ATM;

//import java.io.*;
import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    private int CustomerNumber;
    private int PinNumber;
    private double CheckingBalance = 0;
    private double SavingBalance = 0;

    public int setCustomerNumber(int CustomerNumber)

    {
        this.CustomerNumber = CustomerNumber;
        return CustomerNumber;
    }

    public int getCustomerNumber()

    {
        return CustomerNumber;
    }

    public int setPinNumber(int PinNumber)

    {
        this.PinNumber = PinNumber;
        return PinNumber;
    }

    public int getPinNumber()

    {
        return PinNumber;
    }

    public double getCheckingBalance() {
        return CheckingBalance;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }
    // calculate Checking Account Withdrawal

    public double CalcCheckingWithdraw(double amount) {
        CheckingBalance = (CheckingBalance - amount);
        return CheckingBalance;
    }
    // Calculate Saving Account Withdrawl

    public double CalcSavingWithdraw(double amount) {
        SavingBalance = (SavingBalance - amount);
        return SavingBalance;
    }
    // Calculate Checking Account deposit

    public double calcCheckingDeposit(double amount)

    {
        CheckingBalance = (CheckingBalance + amount);
        return CheckingBalance;
    }
    // Calculate Saving Account deposit

    public double calcSavingDeposit(double amount)

    {
        SavingBalance = (SavingBalance + amount);
        return SavingBalance;
    }

    // customer checking account withdraw input

    public void getCheckingWithdrawInput() {
        System.out.println("Chicking Account Balance:" + CheckingBalance);
        System.out.print("Amount you want to withdraw from Checking Account:");
        double amount = sc.nextDouble();

        if ((CheckingBalance - amount) >= 0) {
            CalcCheckingWithdraw(amount);
            System.out.println("New checking Account Balance" + CheckingBalance);
        } else {
            System.out.println("Balance acan not be negative." + "\n");
        }
    }
    // customer Saving account withdraw input

    public void getSavingWithdrawInput() {
        System.out.println("Chicking Account Balance:" + SavingBalance);
        System.out.print("Amount you want to withdraw from Checking Account:");
        double amount = sc.nextDouble();

        if ((SavingBalance - amount) >= 0) {
            CalcSavingWithdraw(amount);
            System.out.println("New checking Account Balance" + SavingBalance);
        } else {
            System.out.println("Balance can not be negative." + "\n");
        }

    }
    // customer checking account deposit input

    public void getCheckingDepositInput() {
        System.out.println("Chicking Account Balance:" + CheckingBalance);
        System.out.print("Amount you want to deposit from Checking Account:");
        double amount = sc.nextDouble();

        if ((CheckingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New checking Account Balance" + CheckingBalance);
        } else {
            System.out.println("Balance an not be negative." + "\n");
        }

    }
    // customer saving account deposit input

    public void getSavingDepositInput() {
        System.out.println("Chicking Account Balance:" + SavingBalance);
        System.out.print("Amount you want to deposit from Checking Account:");
        double amount = sc.nextDouble();

        if ((SavingBalance + amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("New checking Account Balance" + SavingBalance);
        } else {
            System.out.println("Balance can not be negative." + "\n");
        }

    }
}
