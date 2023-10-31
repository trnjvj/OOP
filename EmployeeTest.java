import javax.swing.*;

public class EmployeeTest {
   public static void main( String args[] )
   {
      String output;
      output = "Employees before instantiation: " +
               Employee.getCount();
      Employee e1 = new Employee( "Susan", "Baker" );
      Employee e2 = new Employee( "Bob", "Jones" );
      output += "\n\nEmployees after instantiation: " +
                "\nvia e1.getCount(): " + e1.getCount() +
                "\nvia e2.getCount(): " + e2.getCount() +
                "\nvia Employee.getCount(): " +
                Employee.getCount();
      output += "\n\nEmployee 1: " + e1.getFirstName() +
                " " + e1.getLastName() +
                "\nEmployee 2: " + e2.getFirstName() +
                " " + e2.getLastName();
      e1 = null;  
      e2 = null;
      System.gc(); // suggest that garbage collector be called
      output += "\n\nEmployees after System.gc(): " +
                Employee.getCount();
      JOptionPane.showMessageDialog( null, output,
         "Static Members and Garbage Collection",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
