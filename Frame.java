import java.awt.*;
import javax.swing.*;
public class Frame extends JPanel
{ 
/** Variablat dhe Literalet e fushës */

  private int width ;
  private int height ;
  private int numri;
  private int e;
  private String b = "";
  private String c = "";
  private String title="";
  private String heading="";
  private int x_position = 50;
  private int y_position = 100;
  private int next_line = 0;
  private int next_num = 50;
  
  /* Konstruktori Frame bën formimin dhe paraqitjen e kornizës
  * @param w - tregon gjerësinë e panelës
  * @param h - tregon gjatësinë e panelës
  * @param n - tregon deri te cili numër do të shfaqen numrat e thjeshtë */
 public Frame(int w,int h, int n)
 {
  width=w;
  height=h;
  numri=n;

  JFrame frame = new JFrame();
  
  frame.setTitle(title);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// mbyll dritaren me shtypjen e exit('X')
  frame.getContentPane().add(this);
  frame.setSize(width,height);
  frame.setVisible(true);
 }
 
  /** paintComponent mbush dritaren 
 * @param a - mundëson vizatimin (shfaqjen) e numrave*/
  public void paintComponent(Graphics a)
 {
  a.setColor(Color.white);
  a.fillRect(0,0,width,height); // vizaton prapavinë
  a.setFont(new Font("BerlinSansFB", Font.BOLD + Font.ITALIC, 24));// krijimi i fontit të ri me karakteristikat e tij(bold,italic,madhësia)
  a.setColor(Color.black);
  a.drawString("Numrat e thjeshtë nga 1 deri "+numri,100,20);
  a.setColor(Color.blue);
  a.drawString("1",x_position,y_position);


 e=1; 
 for(int i = 2; i<=numri; i++)
 { Prime p = new Prime();
   p.gjejNumratEThjeshtë(numri);
  if(i== (e*25)+1){next_line = 20*e+5; next_num=0;e=e+1; }
  c = ""+i;
  if(p.iThjeshtë(i))
  {
  a.setColor(Color.red);}
  else
  { a.setColor(Color.blue);}
  a.drawString(c,x_position+next_num,y_position+next_line);
  next_num = next_num + 50;
  }
  }
   
   }