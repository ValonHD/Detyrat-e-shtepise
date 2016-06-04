 /*Detyra 5) nen b) na k�rkon nj� metod� q� llogarit prodhimin e dy numrave t� plot� jonegativ�
  **a dhe b*/
public class Prodhimi 
 /* @param  a - numri i plot� fillues i prodhimit
  * @param  b - numri i plot� mbarues i prodhimit
  * @return kthen a*(a+1)*(a+2)*...*b, if  a <= b;
  *  kthen 1,  n�se  a > b   */
{public int prodhimi(int a, int b)
{ int totali = 1;
  if ( a <= b )
     { totali = a; 
       int num�ruesi = a;
       while ( num�ruesi != b )
             { num�ruesi = num�ruesi + 1;
               totali = totali * num�ruesi;
             }
     }
  return totali;
}
public static void main(String [] args)
{Prodhimi a = new Prodhimi();
 System.out.println(a.prodhimi(1,4));//p�r shembull a=1 dhe b=4 
}
}