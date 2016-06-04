import javax.swing.*;
/** AccountController mir�mban balancin n� dy llogari bankare, 
  * llogarin� A dhe a llogarin� B. */
public class AccountController
{//Fushat q� e p�rb�jn� modelin dhe pamjen  
   private BankReader lexuesi;
   private BankAccount llogariaA;
   private BankWriter shkruesiipar�;
   private BankAccount llogariaB;
   private BankWriter shkruesiidyt�;
   private BankAccount llogaria;
   private BankWriter shkruesi;
   private String nr="";

   public AccountController(BankReader l, BankAccount ll1, BankWriter sh1,
   BankAccount ll2, BankWriter sh2)
   { lexuesi = l;
   
      llogariaA = ll1;
      shkruesiipar� = sh1;
      llogaria = llogariaA;
      shkruesi = shkruesiipar�;
      llogariaB = ll2;
      shkruesiidyt� = sh2;
      llogaria = llogariaB;
      shkruesi = shkruesiidyt�;
   }
   private void resetAccount(BankAccount llogariaere, BankWriter shkruesiiri)
   { shkruesi.showTransaction("Joaktive"); // Deaktivizon llogarin� aktuale
      llogaria = llogariaere; // Rivendosja e llogaris� s� re
      shkruesi = shkruesiiri;
      shkruesi.showTransaction("Aktive");
      
   }
   public void simboli(String s)
   { nr= s;}
 
   public void processTransactions()
   { char command = lexuesi.readCommand("Komandat (A,B, D,T,M):");
      if ( command == 'M' ) // Mbyllja
      { }
      else { 
         if ( command == 'D' ) // Depozitimi i parave
         { int amount = lexuesi.readAmount();
            llogaria.deposit(amount);
            shkruesi.showTransaction("Depozitimi prej �", amount);
         }
         else if ( command == 'T' ) // T�rheqja e parave
         { int amount = lexuesi.readAmount();
            boolean ok = llogaria.withdraw(amount);
            if ( ok )
            { shkruesi.showTransaction("T�rheqja prej �", amount); }
            else { shkruesi.showTransaction("T�rheqje jovalide", amount); }
         }
         else if ( command == 'A' ) 
         { resetAccount(llogariaA, shkruesiipar�); }
         else if ( command == 'B' ) 
         { resetAccount(llogariaB, shkruesiidyt�); }
         else { shkruesi.showTransaction("Gabim gjat� shtypjes s� komand�s"); }
         this.processTransactions(); // Mesazhi i d�rguar vetes p�r tu p�rs�ritur
      }
   }
   public void processTransactions1()
   { char command = lexuesi.readCommand("Komandat(D,T,M)");
      if(nr.equals("A")) {llogaria = llogariaA;shkruesi = shkruesiipar�;}
      else if (nr.equals("B")){llogaria = llogariaB;shkruesi = shkruesiidyt�;}
      if ( command == 'M' ) 
      { } // Ndalimi i metod�s duke mos b�r� asgj�
      else { 
         if ( command == 'D' ) 
         { int amount = lexuesi.readAmount();
            boolean ok = llogaria.deposit(amount);
            if ( ok )
            { shkruesi.showTransaction("Depozitimi prej �", amount); }
            else { shkruesi.showTransaction("Gabim gjat� depozitimit", amount); }
         }
         else if ( command == 'T' ) 
         { int amount = lexuesi.readAmount();
            boolean ok = llogaria.withdraw(amount);
            if ( ok )
            { shkruesi.showTransaction("T�rheqja prej �", amount); }
            else { shkruesi.showTransaction("Gabim gjat� t�rheqjes", amount); }
         }
         else { shkruesi.showTransaction("Gabim gjat� shtypjes s� komand�s"); }
         this.processTransactions1(); // Mesazhi i d�rguar vetes p�r tu p�rs�ritur
      }
   }
}
