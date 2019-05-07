import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KMpH_to_MpS extends Applet implements ActionListener
{
   TextField kmph, mps, resultNum;
   public KMpH_to_MpS()
   {                      
      setLayout(new GridLayout(3, 2, 10, 15));   
      kmph = new TextField(15);
      resultNum = new TextField(15); 
      kmph.addActionListener(this); 
      add(new Label("Enter speed in km/hr: "));  
      add(kmph);

      add(new Label("Speed in m/s: "));              
      add(resultNum);
   }
   public void actionPerformed(ActionEvent e)
   {                        
      String str1 = kmph.getText();

      double fn = Double.parseDouble(str1);
      double s = fn/3.6;
 
      resultNum.setText("" + s);
   }
}