public class Money {
  public long dollars;
  public long cents;

  public Money(double amount) {
    this.dollars = (long) amount;
    this.cents = Math.round((amount - this.dollars) * 100);
  }

  public Money(long dollars, long cents) {
    this.dollars = dollars;
    this.cents = cents;
  }

  public Money(Money otherObject) {
    this.dollars = otherObject.dollars;
    this.cents = otherObject.cents;
  }

  public Money add(Money otherObject) {
    long newDollars = this.dollars + otherObject.dollars;
    long newCents = this.cents + otherObject.cents;
    if (newCents >= 100) {
      newDollars++;
      newCents -= 100;
    }
    return new Money(newDollars, newCents);
  }

  public Money subtract(Money otherObject) {
    long newDollars = this.dollars - otherObject.dollars;
    long newCents = this.cents - otherObject.cents;
    if (newCents < 0) {
      newDollars--;
      newCents += 100;
    }
    return new Money(newDollars, newCents);
  }


  public int compareTo(Money otherObject) {
    if (this.dollars < otherObject.dollars) {
      return -1;
    } else if (this.dollars > otherObject.dollars) {
      return 1;
    } else {
      if (this.cents < otherObject.cents) {
        return -1;
      } else if (this.cents > otherObject.cents) {
        return 1;
      } else {
        return 0;
      }
    }
  }

  public boolean equals(Money otherObject) {
    // If the two objects are the same object, they are equal
    if (this == otherObject) {
      return true;
    }
    // If the other object is null, they are not equal
    if (otherObject == null) {
      return false;
    }
    return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
  }

  @Override
  public String toString() {
    return "$" + this.dollars + "." + this.cents;
  }

}
