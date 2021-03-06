package ATM;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class OptionMenu extends Account {
    Scanner sc = new Scanner(System.in);
    DecimalFormat mf = new DecimalFormat("'$'###,##0.00");

    int acc, pin, selection;

    public void getLogin() throws IOException {
        int x = 1;
        int Act_acc = 558890, Act_pin = 2244;
        do {
            try {
                System.out.println("******WELCOME TO ATM SYSTEM******");
                System.out.println("Enter your Account Number");
                acc = sc.nextInt();
                System.out.println("Enter the PIN");
                pin = sc.nextInt();
            } catch (Exception e) {
                System.out.println("\n" + "Invalid Character.Only Numbers." + "\n");
                x = 2;
            }
            // Object acc;
            if (acc == Act_acc && pin == Act_pin) {
                GetAccountType();
            } else {
                System.out.println("\n" + "Wront customer number and pin number" + "\n");
            }
        } while (x == 1);
    }

    public void GetAccountType() {
        System.out.println("******Select the Account You Want to Access -----******");
        System.out.println("1-- Checking Account");
        System.out.println("2-- Saving Account");
        System.out.println("3-- Exit");
        System.out.print("Choice:");
        selection = sc.nextInt();

        switch (selection) {
            case 1:
                getChicking();
                break;

            case 2:
                getSeving();
                break;

            case 3:
                System.out.println("******Thank you using this ATM, Bye. *******");

            default:
                break;
        }
    }

    public void getChicking() {
        System.out.println("Checking Account:");
        System.out.println("Type 1-View Balance");
        System.out.println("Type 2-Withdraw Funds");
        System.out.println("Type 3-Deposit Funds");
        System.out.println("Type 4-Exit");
        System.out.println("Choice:");
        selection = sc.nextInt();

        switch (selection) {
            case 1:
                System.out.println("checking Account Balance" + getCheckingBalance());
                GetAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                GetAccountType();

                break;

            case 3:
                getCheckingDepositInput();
                GetAccountType();
                break;

            case 4:
                System.out.println("Thank you for using ATM,Bye.");
                break;

            default:
                System.out.println("Invalid");
                getChicking();
                break;
        }
    }

    public void getSeving() {
        System.out.println("Checking Account:");
        System.out.println("Type 1-View Balance");
        System.out.println("Type 2-Withdraw Funds");
        System.out.println("Type 3-Deposit Funds");
        System.out.println("Type 4-Exit");
        System.out.println("Choice:");
        selection = sc.nextInt();

        switch (selection) {
            case 1:
                System.out.println("checking Account Balance" + getCheckingBalance());
                GetAccountType();
                break;

            case 2:
                getSavingWithdrawInput();
                GetAccountType();

                break;

            case 3:
                getSavingDepositInput();
                GetAccountType();
                break;

            case 4:
                System.out.println("Thank you for using ATM,Bye.");
                break;

            default:
                System.out.println("Invalid");
                getChicking();
                break;
        }
    }
}
