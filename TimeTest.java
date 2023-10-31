import javax.swing.*;
import com.johnson.jhtp3.ch08.Time4;

public class TimeTest {
   public static void main( String args[] )
   {
      Time4 t = new Time4();
      String output;
      t.setHour( 18 ).setMinute( 30 ).setSecond( 22 );

      output = "Universal time: " + t.toUniversalString() +
               "\nStandard time: " + t.toString() +
               "\n\nNew standard time: " +
               t.setTime( 20, 20, 20 ).toString();
      JOptionPane.showMessageDialog( null, output,
         "Chaining Method Calls",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
