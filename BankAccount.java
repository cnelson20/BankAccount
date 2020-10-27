public class BankAccount {

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int acc, String pass) {
    balance = 0;
    accountID = acc;
    password = pass;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPass) {
    password = newPass;
  }

  public boolean deposit(double money) {
    if (money > 0) {
      balance += money;
      return true;
    }
    return false;
  }

  public boolean withdraw(double m) {
    if (m < 0 || m > balance) {
      return false;
    }
    balance -= m;
    return true;
  }

  public String toString() {
    return accountID + "\t" + balance;
  }
}
