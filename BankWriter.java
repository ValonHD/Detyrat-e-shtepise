import java.awt.*;
import javax.swing.*;
import java.text.*;
/** BankWriter shkruan transaksionet bankore */
public class BankWriter extends JPanel
{  private int Gjërësia = 300; 
   private int Lartësia = 200;
   private BankAccount bank; 
   private String transaksioni = ""; 
   JFrame my_frame = new JFrame();  
   int pozita=0;String titulli="";
   public BankWriter(String title, BankAccount b,int pozicioni)
   {bank = b;
   titulli=title;
   pozita=pozicioni; }
      
      public void korniza(){
      my_frame.getContentPane().add(this);
      my_frame.setTitle(titulli);
      my_frame.setSize(Gjërësia, Lartësia);
      my_frame.setVisible(true);
      my_frame.setLocation(pozita, pozita*0);// Rivendosja e kornizës në pozitë të caktuar
   }
   public void paintComponent(Graphics g)
   { g.setColor(Color.white);
     g.fillRect(0, 0, Gjërësia, Lartësia); // Vizatimi i prapavijës me të bardhë
     g.setColor(Color.black);
     int margjina = 50;
     int baza = 50;
     g.setColor(Color.red);
     g.drawString(transaksioni, margjina, baza);
     g.setColor(Color.black);
     g.drawString("Bilanci aktual = €" + unconvert(bank.getBalance()),margjina, baza + 20);
   }
/** unconvert riformatizon centët në euro*/
   private String unconvert(int i)
   { double centët = i / 100.00;
      return new DecimalFormat("0.00").format(centët);
   }
   public void showTransaction(String message, int amount)
   { transaksioni = message + " " + unconvert(amount);
      this.repaint();
   }
   public void showTransaction(String message)
   { transaksioni = message;
      this.repaint();
   }
}