/** Detyra 8.13.2 Kjo detyrë ka të bëjë me formimin e algoritmit klasik sipas Eratosthenes për të 
llogaritur numrat e thjeshtë prej 2 deri në n me anë të një vargu boolean dhe prej atij vargu t'i
largojmë numrat e përbërë */
import javax.swing.*;
public class Numrat_e_thjeshtë_sipas_Eratosthenes
{
  public static void main(String[] args)
  {
   boolean a = true;
   while(a)
   {
   int n = new Integer(JOptionPane.showInputDialog("Shtypeni numrin për të shfaqur numrat e thjeshtë deri te ai numër:")).intValue();
   if(n<=0){JOptionPane.showMessageDialog(null,"Numri që keni shtypur është gabim. \n Provoni përsëri!");}
   else{Frame f = new Frame(2000,1500,n); a=false;}
   }
  }
}