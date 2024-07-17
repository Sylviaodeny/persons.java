public class Person{
  String name;
  int age;
  String address;

 // Constructor with 3 parameters
  public Person(String name, int age, String address) {
   this.name = name;
   this.age = age;
   this.address = address;
}

  // Method to display person's details
  public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Address: " + address);
}
  // Method that accepts a person object and calls displayDetails
  public void myDetails(Person person) {
     person displayDetails();
}
  // Method to print the current instance
  public void printCurrentInstance() {
     myDetails(this);
}
  // Main method to create an object and call the method
  public static void main(String[] args) {
    // Create a new person object with your details
  Person Sylvia = new Person("Sylvia Odeny", age:19,"Komarock")
      // Calling the printCurrentInstance method using the Sylvia object
  Sylvia.printCurrentInstance();
  }
}
  