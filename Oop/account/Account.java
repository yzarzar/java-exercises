package account;

public class Account {
    
    int accNo;
    String name;
    double amount;

    void insert(int accNo, String name, double amount) {
        this.accNo = accNo;
        this.name = name;
        this.amount = amount;
    }

    void deposit(double amt) {
        amount = amount + amt;
        System.out.println(amount + " deposited");
    }

    void withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient amount");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
    }

    void checkBalance() {
        System.out.println("Balance is : " + amount);
    }

    void display() {
        System.out.println(accNo + ". " + name + " (" + amount + ")");
    }
}
