import javax.swing.*;
/** BankAccount menaxhon dy llogari A dhe B si dhe nj� bankier */
public class BankAccount
{ private int balance; // bilanci i llogaris�

   public BankAccount(int initial_amount)
   { 
      if ( initial_amount >= 0 )
      { balance = initial_amount; }
      else { balance = 0; }
   }

   public boolean deposit(int amount)
   { boolean result = false;
      if ( amount >= 0 )
      { balance = balance + amount;
         result = true;
      }
      else { JOptionPane.showMessageDialog(null,"Gabim te BankAcccount: nuk mund t� depozitoni shum� negative");
      }
      return result;
   }

   public boolean withdraw(int amount)
   { boolean result = false;
      if ( amount < 0 )
 { JOptionPane.showMessageDialog(null,"Gabim te BankAcccount: nuk mund t� t�rheqni shum� negative"); }
 else if ( amount > balance )
 { JOptionPane.showMessageDialog(null,"Gabim te BankAccunt: nuk mund t� t�rheqni m� shum� se sa q� keni");}
      else { balance = balance - amount;
         result = true;
      }return result;
   }
   public int getBalance()
   { return balance; 
   }
}