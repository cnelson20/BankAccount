public class Tester {
  public static void main(String[] args) {
    BankAccount banc = new BankAccount(69420,"password");
    banc.deposit(1000000);
    banc.withdraw(10000);
    System.out.println(banc.toString());
  }
}
