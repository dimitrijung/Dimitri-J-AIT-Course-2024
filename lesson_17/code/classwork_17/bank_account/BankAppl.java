package classwork_17.bank_account;

import classwork_17.bank_account.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {

        BankAccount account001 = new BankAccount(101L,"John Smith", "Bank#1", 1, 100);
        account001.display();

        // toString
        //System.out.println(account001);

        BankAccount account002 = new BankAccount(102L, "Pit Brosnan", "Bank#1",1);
        account002.display();

        BankAccount account003 = new BankAccount(103L, "Bank#1", 1, 3000000);
        account003.display();

        System.out.println("--------------------------");
        account001.deposit(500);
        account001.display();
        account002.deposit(300);
        account002.display();

        System.out.println("--------------------------");
        account001.withdraw(500);
        account001.display();
        account001.withdraw(200);
        account001.display();
        account001.withdraw(100);
        account001.display();

    }// end of main
}// end of class
