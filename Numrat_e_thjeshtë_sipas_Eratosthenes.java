/** Detyra 8.13.2 Kjo detyr� ka t� b�j� me formimin e algoritmit klasik sipas Eratosthenes p�r t� 
llogaritur numrat e thjesht� prej 2 deri n� n me an� t� nj� vargu boolean dhe prej atij vargu t'i
largojm� numrat e p�rb�r� */
import javax.swing.*;
public class Numrat_e_thjesht�_sipas_Eratosthenes
{
  public static void main(String[] args)
  {
   boolean a = true;
   while(a)
   {
   int n = new Integer(JOptionPane.showInputDialog("Shtypeni numrin p�r t� shfaqur numrat e thjesht� deri te ai num�r:")).intValue();
   if(n<=0){JOptionPane.showMessageDialog(null,"Numri q� keni shtypur �sht� gabim. \n Provoni p�rs�ri!");}
   else{Frame f = new Frame(2000,1500,n); a=false;}
   }
  }
}