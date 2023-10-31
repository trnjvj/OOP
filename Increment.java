import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Increment extends JApplet
             implements ActionListener {
   private int count = 0, total = 0;
   private final int INCREMENT = 5; 
   private JButton incr;  
   public void init() 
   { 
      Container c = getContentPane();
      incr = new JButton( "Click to increment" );
      incr.addActionListener( this );
      c.add( incr );
   }
   public void actionPerformed( ActionEvent e )
   {
      total += INCREMENT;
      count++;
      showStatus( "After increment " + count +
                  ": total = " + total );
   }
}
