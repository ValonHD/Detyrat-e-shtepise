/*Detyra 5) nen d) kërkon implementimin e disa metodave klasike për llogaritje të sinusit*/
public class Sinusi
/*sinus e llogarit sinusin,duke përdorur formulën
 *sin(x) = x - (x^3/3!) + (x^5/5!) - (x^7/7!) + ... - (x^n/19!)
 * @param x - vlera në radianë(p.sh., sin(0)=0, sin(pi/2)=1, sin(pi)=0, sin(3pi/2)=-1, etj.)
 * @return kthen sinusin e llogaritur nga formula */
{public double sinus(double x)
{ double sin = x;
  int numëruesi = 3;
  while ( numëruesi <= 19 )
        { double d = Math.pow(x, numëruesi)/ faktoriel(numëruesi); 
          if ( (numëruesi % 4) == 3 )
               { sin = sin - d; }
          else { sin = sin + d; }
          numëruesi = numëruesi + 2;
        }
  return sin;
}
public static void main(String [] args)
{Sinusi s = new Sinusi();
System.out.println(s.sinus(0));//psh sin i 0
}
}
/*int i = 0;
*double sin = 0;
*while (i<20)
*{int n=2*i+1;
 sin = sin+Math.pow(-1,i)*Math.pow(x,n/facctorial(n);
 i++;}
 return sin;
 }
*/