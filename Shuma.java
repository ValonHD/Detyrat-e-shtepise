/*Detyra 5) nen a) na k�rkon nj� metod� q� llogarit shum�n e n numrave t� par� (0+1+2+..+n)*/
public class Shuma
/* Metoda shuma e cila llogarit shum�n e n numrave natyror�
*/
{public int shuma(int n)
{ int totali = 0;  // totali n� fillim
  int num�r = 0;  // num�ron deri n� n
  while ( num�r!= n )
        { num�r = num�r + 1;
          totali = totali +num�r;// totalit i shtohet nga nj� num�r deri tek numri n
          
        }
  return totali;
}
public static void main(String [] args)
{Shuma a = new Shuma();
 System.out.println(a.shuma(4));//provojm� p�r n=4
}
}