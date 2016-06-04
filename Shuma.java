/*Detyra 5) nen a) na kërkon një metodë që llogarit shumën e n numrave të parë (0+1+2+..+n)*/
public class Shuma
/* Metoda shuma e cila llogarit shumën e n numrave natyrorë
*/
{public int shuma(int n)
{ int totali = 0;  // totali në fillim
  int numër = 0;  // numëron deri në n
  while ( numër!= n )
        { numër = numër + 1;
          totali = totali +numër;// totalit i shtohet nga një numër deri tek numri n
          
        }
  return totali;
}
public static void main(String [] args)
{Shuma a = new Shuma();
 System.out.println(a.shuma(4));//provojmë për n=4
}
}