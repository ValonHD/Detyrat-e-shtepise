 /*Detyra 5) nen b) na kërkon një metodë që llogarit prodhimin e dy numrave të plotë jonegativë
  **a dhe b*/
public class Prodhimi 
 /* @param  a - numri i plotë fillues i prodhimit
  * @param  b - numri i plotë mbarues i prodhimit
  * @return kthen a*(a+1)*(a+2)*...*b, if  a <= b;
  *  kthen 1,  nëse  a > b   */
{public int prodhimi(int a, int b)
{ int totali = 1;
  if ( a <= b )
     { totali = a; 
       int numëruesi = a;
       while ( numëruesi != b )
             { numëruesi = numëruesi + 1;
               totali = totali * numëruesi;
             }
     }
  return totali;
}
public static void main(String [] args)
{Prodhimi a = new Prodhimi();
 System.out.println(a.prodhimi(1,4));//për shembull a=1 dhe b=4 
}
}