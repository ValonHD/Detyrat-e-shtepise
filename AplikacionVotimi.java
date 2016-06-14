import javax.swing.*;
/*Nj� aplikacion votimi p�r dy kandidat�
 *i cili p�rdor menyr�n interaktive t� dh�nies s� informatave 
 *dhe urdh�rat kusht�zues*/
 public class AplikacionVotimi 
 {
  static int kandidati1;//Deklarimi i dy fushave,kandidat�t 1 e 2
  static int kandidati2;
  
  public static void main(String[] args)//Metoda main 
  {
  mosha();
  }
  /** mosha pyet shfryt�zuesin se p�r mosh�n e tij(n�se �shte mbi 18 vje� ai mund t� vazhdoj� me votim)
   *  p�rndryshe pyetet p�rs�ri 
   */
  public static void mosha()
  {
   JDialog.setDefaultLookAndFeelDecorated(true);//Ky kod ndryshon m�nyr�n grafike t� paraqitjes s� dritareve
    
   String[] opcionet = new String[2];//Nj� array p�r t� ndryshuar tekstin e disa butonave
   opcionet[0] = new String("Po");
   opcionet[1] = new String("Jo");
   int p�rgjegjia =JOptionPane.showOptionDialog(null,"A jeni 18 vje�ar ose m� i madh?","Verifikimi per mosh�",
   0,JOptionPane.INFORMATION_MESSAGE,null,opcionet,null);//showOptionDialog nga paketa javax.swing

    if (p�rgjegjia == JOptionPane.YES_OPTION) //Kushtet kur shtypim butonat specifik
      {
       JOptionPane.showMessageDialog(null,"Ju mund t� vazhdoni me votim");
       votimi();
      } 
       else if (p�rgjegjia == JOptionPane.NO_OPTION)
      {
       JOptionPane.showMessageDialog(null,"Ju duhet t� jeni se paku 18 vje�");
       mosha();
      }
       else if (p�rgjegjia == JOptionPane.CLOSED_OPTION) 
      {
       JOptionPane.showMessageDialog(null,"Mirupafshim");
       System.exit(0);
      }
  } /** votimi k�rkon nga shfryt�zuesi se cilin kandidat d�shiron ai t� votoj
     */
  public static void votimi() 
  {
   String[] opcionet1 = new String[2];
   opcionet1[0] = new String("Kandidatin e par�");
   opcionet1[1] = new String("Kandidatin e dyt�");
   int p�rgjegjia =JOptionPane.showOptionDialog(null,"A doni t� votoni\nn�se po,cilin kandidat?","Votimi", 
   0,JOptionPane.INFORMATION_MESSAGE,null,opcionet1,null);

    if (p�rgjegjia == JOptionPane.YES_OPTION) 
      {
       kandidati1++;
       JOptionPane.showMessageDialog(null,"Votuat kandidatin e par�,i cili deri tash ka "+kandidati1+" vota"+
       " nd�rsa kandidati i dyt� ka "+kandidati2+" vota");
       mosha();
       
      } 
      else if (p�rgjegjia == JOptionPane.NO_OPTION) 
       {
        kandidati2++;
        JOptionPane.showMessageDialog(null,"Votuat kandidatin e dyt�,i cili deri tash ka "+kandidati2+" vota"+
        " nd�rsa kandidati i par� ka:"+kandidati1+" vota");
        mosha();
       } else if (p�rgjegjia == JOptionPane.CLOSED_OPTION) 
      {
       JOptionPane.showMessageDialog(null,"Faleminderit per mir�kuptim");
       System.exit(0);
      }
  }
 }   