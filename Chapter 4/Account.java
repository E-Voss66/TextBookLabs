//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
public class Account
{
  private double balance;
  private String name;
  private long acctNum;
  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number){
      this.balance = initBal;
      this.name = owner;
      this.acctNum = number;
      
  }
  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount){
      if(amount <= this.balance){
          this.balance -= amount;
        }
      else{
          System.out.println("You don't have enough money to widthdraw that much");
          System.out.println("Your current balance is: " + this.balance);
          
        }
  }
  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount){
      this.balance += amount;
  }
  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance(){
      return this.balance;
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString(){
      return "You have " + this.balance + " in your account. The account name is: " + this.name 
                + ". The account number is: " + this.acctNum + ".";
  }
  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public void chargeFee(){
      this.balance -= 10;
  }
  //----------------------------------------------
  // Changes the name on the account
  //----------------------------------------------
  public void changeName(String newName){
      this.name = newName;
  }
}
