import javax.swing.*;
/** AccountManager p�rmban dy llogari bankore dhe perpar�sit� e bankierit */
public class AccountManager
{ 
   public static void main(String[] args)
   { BankReader lexuesi = new BankReader();
      BankAccount llogariaA = new BankAccount(0);
      BankWriter shkruesiipar� = new BankWriter("Llogaria A", llogariaA,100);
      BankAccount llogariaB = new BankAccount(0);
      BankWriter shkruesiidyte = new BankWriter("Llogaria B", llogariaB, 850);
// Konstruktimi i kontrollerit:
      AccountController controller = new AccountController(lexuesi, llogariaA, shkruesiipar�, llogariaB, shkruesiidyte);
// Komanda q� k�rkohet ne fillim,aplikacion pyet se cili eshte personi qe do te shfrytezoje ate
      String komanda = JOptionPane.showInputDialog("Kommandat:\nA-personi A\nB-personi B\nBT-Bankieri");
      String s = komanda.trim().toUpperCase();
      if (s.equals("A")||s.equals("B"))
      {
         if(s.equals("A"))
         {controller.simboli("A");shkruesiipar�.korniza();controller.processTransactions1();}
         else
         {controller.simboli("B");shkruesiidyte.korniza();
            controller.processTransactions1();}
      }
      else if (s.equals("BT"))
      {controller.simboli("BT");shkruesiipar�.korniza();
         shkruesiidyte.korniza();
         controller.processTransactions(); 
      }
      else { JOptionPane.showMessageDialog(null,"Gabim gjat� shtypjes s� komandave"); 
      }
   }
}