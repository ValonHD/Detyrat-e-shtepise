import javax.swing.*;
/*Një aplikacion votimi për dy kandidatë
 *i cili përdor menyrën interaktive të dhënies së informatave 
 *dhe urdhërat kushtëzues*/
 public class AplikacionVotimi 
 {
  static int kandidati1;//Deklarimi i dy fushave,kandidatët 1 e 2
  static int kandidati2;
  
  public static void main(String[] args)//Metoda main 
  {
  mosha();
  }
  /** mosha pyet shfrytëzuesin se për moshën e tij(nëse ështe mbi 18 vjeç ai mund të vazhdojë me votim)
   *  përndryshe pyetet përsëri 
   */
  public static void mosha()
  {
   JDialog.setDefaultLookAndFeelDecorated(true);//Ky kod ndryshon mënyrën grafike të paraqitjes së dritareve
    
   String[] opcionet = new String[2];//Një array për të ndryshuar tekstin e disa butonave
   opcionet[0] = new String("Po");
   opcionet[1] = new String("Jo");
   int përgjegjia =JOptionPane.showOptionDialog(null,"A jeni 18 vjeçar ose më i madh?","Verifikimi per moshë",
   0,JOptionPane.INFORMATION_MESSAGE,null,opcionet,null);//showOptionDialog nga paketa javax.swing

    if (përgjegjia == JOptionPane.YES_OPTION) //Kushtet kur shtypim butonat specifik
      {
       JOptionPane.showMessageDialog(null,"Ju mund të vazhdoni me votim");
       votimi();
      } 
       else if (përgjegjia == JOptionPane.NO_OPTION)
      {
       JOptionPane.showMessageDialog(null,"Ju duhet të jeni se paku 18 vjeç");
       mosha();
      }
       else if (përgjegjia == JOptionPane.CLOSED_OPTION) 
      {
       JOptionPane.showMessageDialog(null,"Mirupafshim");
       System.exit(0);
      }
  } /** votimi kërkon nga shfrytëzuesi se cilin kandidat dëshiron ai të votoj
     */
  public static void votimi() 
  {
   String[] opcionet1 = new String[2];
   opcionet1[0] = new String("Kandidatin e parë");
   opcionet1[1] = new String("Kandidatin e dytë");
   int përgjegjia =JOptionPane.showOptionDialog(null,"A doni të votoni\nnëse po,cilin kandidat?","Votimi", 
   0,JOptionPane.INFORMATION_MESSAGE,null,opcionet1,null);

    if (përgjegjia == JOptionPane.YES_OPTION) 
      {
       kandidati1++;
       JOptionPane.showMessageDialog(null,"Votuat kandidatin e parë,i cili deri tash ka "+kandidati1+" vota"+
       " ndërsa kandidati i dytë ka "+kandidati2+" vota");
       mosha();
       
      } 
      else if (përgjegjia == JOptionPane.NO_OPTION) 
       {
        kandidati2++;
        JOptionPane.showMessageDialog(null,"Votuat kandidatin e dytë,i cili deri tash ka "+kandidati2+" vota"+
        " ndërsa kandidati i parë ka:"+kandidati1+" vota");
        mosha();
       } else if (përgjegjia == JOptionPane.CLOSED_OPTION) 
      {
       JOptionPane.showMessageDialog(null,"Faleminderit per mirëkuptim");
       System.exit(0);
      }
  }
 }   