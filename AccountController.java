import javax.swing.*;
/** AccountController mirëmban balancin në dy llogari bankare, 
  * llogarinë A dhe a llogarinë B. */
public class AccountController
{//Fushat që e përbëjnë modelin dhe pamjen  
   private BankReader lexuesi;
   private BankAccount llogariaA;
   private BankWriter shkruesiiparë;
   private BankAccount llogariaB;
   private BankWriter shkruesiidytë;
   private BankAccount llogaria;
   private BankWriter shkruesi;
   private String nr="";

   public AccountController(BankReader l, BankAccount ll1, BankWriter sh1,
   BankAccount ll2, BankWriter sh2)
   { lexuesi = l;
   
      llogariaA = ll1;
      shkruesiiparë = sh1;
      llogaria = llogariaA;
      shkruesi = shkruesiiparë;
      llogariaB = ll2;
      shkruesiidytë = sh2;
      llogaria = llogariaB;
      shkruesi = shkruesiidytë;
   }
   private void resetAccount(BankAccount llogariaere, BankWriter shkruesiiri)
   { shkruesi.showTransaction("Joaktive"); // Deaktivizon llogarinë aktuale
      llogaria = llogariaere; // Rivendosja e llogarisë së re
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
            shkruesi.showTransaction("Depozitimi prej €", amount);
         }
         else if ( command == 'T' ) // Tërheqja e parave
         { int amount = lexuesi.readAmount();
            boolean ok = llogaria.withdraw(amount);
            if ( ok )
            { shkruesi.showTransaction("Tërheqja prej €", amount); }
            else { shkruesi.showTransaction("Tërheqje jovalide", amount); }
         }
         else if ( command == 'A' ) 
         { resetAccount(llogariaA, shkruesiiparë); }
         else if ( command == 'B' ) 
         { resetAccount(llogariaB, shkruesiidytë); }
         else { shkruesi.showTransaction("Gabim gjatë shtypjes së komandës"); }
         this.processTransactions(); // Mesazhi i dërguar vetes për tu përsëritur
      }
   }
   public void processTransactions1()
   { char command = lexuesi.readCommand("Komandat(D,T,M)");
      if(nr.equals("A")) {llogaria = llogariaA;shkruesi = shkruesiiparë;}
      else if (nr.equals("B")){llogaria = llogariaB;shkruesi = shkruesiidytë;}
      if ( command == 'M' ) 
      { } // Ndalimi i metodës duke mos bërë asgjë
      else { 
         if ( command == 'D' ) 
         { int amount = lexuesi.readAmount();
            boolean ok = llogaria.deposit(amount);
            if ( ok )
            { shkruesi.showTransaction("Depozitimi prej €", amount); }
            else { shkruesi.showTransaction("Gabim gjatë depozitimit", amount); }
         }
         else if ( command == 'T' ) 
         { int amount = lexuesi.readAmount();
            boolean ok = llogaria.withdraw(amount);
            if ( ok )
            { shkruesi.showTransaction("Tërheqja prej €", amount); }
            else { shkruesi.showTransaction("Gabim gjatë tërheqjes", amount); }
         }
         else { shkruesi.showTransaction("Gabim gjatë shtypjes së komandës"); }
         this.processTransactions1(); // Mesazhi i dërguar vetes për tu përsëritur
      }
   }
}
