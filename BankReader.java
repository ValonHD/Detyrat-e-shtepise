import javax.swing.*;
/** BankReader lexon transaksionet bankore nga shfryt�zuesi */
public class BankReader
{ private String input_line; // mban inputin m� t� fundit komand�s 
   public BankReader()
   { input_line = ""; }
   public char readCommand(String message)
   { // lexon inputin, i heq hap�sirat n� skaje dhe e konverton at� me shkronja t� m�dha:
      input_line = JOptionPane.showInputDialog(message).trim().toUpperCase();
      return input_line.charAt(0); // return the leading character
   }
   public int readAmount()
   { int answer = 0;
      String s = input_line.substring(1, input_line.length());
      s = s.trim();       if ( s.length() > 0 ) 
      { double parat� = new Double(s).doubleValue();
         answer = (int)(parat� * 100); // convert to all cents
      }
 else { JOptionPane.showMessageDialog(null,"Gabim te BankReader: nuk keni shkruajtur num�r---�sht� p�rdorur 0");
      }
      return answer;
   }
}