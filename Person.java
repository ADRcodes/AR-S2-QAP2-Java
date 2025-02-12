public class Person {
  private String lastName;
  private String firstName;
  private Address address;

  public Person(String lastName, String firstName, Address address) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.address = address;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getAddress() {
    return address.toString();
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return firstName + " " + lastName + " lives at " + address;
  }
}
