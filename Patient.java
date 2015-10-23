class Patient
  {
  private String lastName;
  private String firstName;
  private String address;
  private int age;
  
  public Patient(String last, String first, String add, int a)
   {                // constructor
   lastName = last;
   firstName = first;
   address = add;
   age = a;
   }
  
  public void displayPatient()
   {
   System.out.print("  Last name: " + lastName);
   System.out.print(", First name: " + firstName);
   System.out.print(", Address: " + address);
   System.out.println(", Age: " + age);
   }
  
  public int getAge()
   { return age; }
  } // end class Person