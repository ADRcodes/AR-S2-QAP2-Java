public class CreditCard {
  private Money balance;
  private Money creditLimit;
  private Person owner;

  public CreditCard(Money creditLimit, Person owner) {
    this.balance = new Money(0,0);
    this.creditLimit = new Money(creditLimit);
    this.owner = owner;
  }

  public Money getBalance() {
    return balance;
  }

  public Money getCreditLimit() {
    return creditLimit;
  }

  public String getPersonals() {
    return owner.toString();
  }

  public void charge(Money amount) {
    Money newBalance = balance.add(amount);
    if (newBalance.compareTo(creditLimit) <= 0) {
        balance = newBalance;
    } else {
        System.out.println("Charge exceeds credit limit!");
    }
  }

  public void payment(Money amount) {
    balance = balance.subtract(amount);
  }

  @Override
  public String toString() {
    return owner.toString() + " and has a balance of " + balance + " and a credit limit of " + creditLimit;
  }
}
