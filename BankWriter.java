import java.awt.*;
import javax.swing.*;
import java.text.*;
/** BankWriter shkruan transaksionet bankore */
public class BankWriter extends JPanel
{  private int Gj�r�sia = 300; 
   private int Lart�sia = 200;
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
      my_frame.setSize(Gj�r�sia, Lart�sia);
      my_frame.setVisible(true);
      my_frame.setLocation(pozita, pozita*0);// Rivendosja e korniz�s n� pozit� t� caktuar
   }
   public void paintComponent(Graphics g)
   { g.setColor(Color.white);
     g.fillRect(0, 0, Gj�r�sia, Lart�sia); // Vizatimi i prapavij�s me t� bardh�
     g.setColor(Color.black);
     int margjina = 50;
     int baza = 50;
     g.setColor(Color.red);
     g.drawString(transaksioni, margjina, baza);
     g.setColor(Color.black);
     g.drawString("Bilanci aktual = �" + unconvert(bank.getBalance()),margjina, baza + 20);
   }
/** unconvert riformatizon cent�t n� euro*/
   private String unconvert(int i)
   { double cent�t = i / 100.00;
      return new DecimalFormat("0.00").format(cent�t);
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