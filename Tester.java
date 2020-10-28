public class Tester {
  public static void main(String[] args) {
    BankAccount banc = new BankAccount(69420,"password");
    BankAccount banc2 = new BankAccount(2,"password");
    banc2.deposit(5000);
    banc.deposit(1000000);
    banc.withdraw(10000);
    System.out.println(banc.toString());
    System.out.println(banc.authenticate("password"));
    System.out.println(banc.transferTo(banc2,90000,"password"));
    System.out.println(banc);
    System.out.println(banc2);
  }
}
