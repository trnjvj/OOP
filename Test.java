import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import com.deitel.jhtp3.ch09.Cylinder;

public class Test {
   public static void main( String args[] )
   {
      Cylinder c = new Cylinder( 5.7, 2.5, 12, 23 );
      DecimalFormat precision2 = new DecimalFormat( "0.00" );
      String output;
      output = "X coordinate is " + c.getX() +
               "\nY coordinate is " + c.getY() +
               "\nRadius is " + c.getRadius() +
               "\nHeight is " + c.getHeight();
      c.setHeight( 10 );
      c.setRadius( 4.25 );
      c.setPoint( 2, 2 );
      output +=
         "\n\nThe new location, radius " +
         "and height of c are\n" + c +
         "\nArea is " + precision2.format( c.area() ) +
         "\nVolume is " + precision2.format( c.volume() );
      JOptionPane.showMessageDialog( null, output,
         "Demonstrating Class Cylinder",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
