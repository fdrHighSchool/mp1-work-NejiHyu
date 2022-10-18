import java.util.Scanner;


public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    
    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String number = s.nextLine();
    System.out.print("Eter if you are a teacher or a student: ");
    String role = s.nextLine();

    // test output
    if (role.equals("student")) {
        System.out.println(firstName + initialize(lastName) + number + ".@nycstudents.net");
    } // End of If Statement
    else if (!role.equals("teacher")) {
        System.out.println(initialize(firstName) + lastName + number + ".@schools.nyc.gov");
    }// End of  statement
    else {
        System.out.println("Sorry I can't let you in");
    }// End of else statement
        

    s.close();
    generatePassword();
  } // end main method
}


/*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0,1);
  } // end initialize method
  
  /*
   * Name: generatePassword
   * Purpose: create a password for the user names
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static string generatePassword(int length) {
      String password= "";
      int rand = (char)(int)(Math.random()*(90-65+1)+65);
      char c = (char)rand;
      system.out.println(rand + " " +c);

      
      
      return password;
  }// end of generate password method
} // end class
