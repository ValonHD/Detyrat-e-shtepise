import javax.swing.*;
/** BankReader lexon transaksionet bankore nga shfrytëzuesi */
public class BankReader
{ private String input_line; // mban inputin më të fundit komandës 
   public BankReader()
   { input_line = ""; }
   public char readCommand(String message)
   { // lexon inputin, i heq hapësirat në skaje dhe e konverton atë me shkronja të mëdha:
      input_line = JOptionPane.showInputDialog(message).trim().toUpperCase();
      return input_line.charAt(0); // return the leading character
   }
   public int readAmount()
   { int answer = 0;
      String s = input_line.substring(1, input_line.length());
      s = s.trim();       if ( s.length() > 0 ) 
      { double paratë = new Double(s).doubleValue();
         answer = (int)(paratë * 100); // convert to all cents
      }
 else { JOptionPane.showMessageDialog(null,"Gabim te BankReader: nuk keni shkruajtur numër---është përdorur 0");
      }
      return answer;
   }
}