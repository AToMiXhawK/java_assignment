import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KMpH_to_MpS extends Applet implements ActionListener
{
   TextField kmph, mps;
   public KMpH_to_MpS()
   {                      
      setLayout(new GridLayout(3, 2, 10, 15));   
      kmph = new TextField(15);
      mps = new TextField(15); 
      kmph.addActionListener(this);  
      add(new Label("Enter speed in kmph: "));  
      add(kmph);

      add(new Label("Speed in mps: "));              
      add(mps);
      mps.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {  
      Boolean b1 = kmph.getText().isEmpty();
      Boolean b2 = mps.getText().isEmpty();
      if(b2)
      {
        String str1 = kmph.getText();
        double fn1 = Double.parseDouble(str1);
        double s1 = fn1/3.6;
        mps.setText("" + s1);
      }

      if(b1)
      {
        String str2 = mps.getText();
        double fn2 = Double.parseDouble(str2);
        double s2 = fn2*3.6;
        kmph.setText("" + s2);
      }
      
     
 
      
   }
}