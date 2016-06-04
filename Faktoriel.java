/*Detyra 5) nen c) kërkon metodën për gjetjen e faktorielit n!*/
public class Faktoriel
 /*faktorieli e llogarit n! në rangun 0 deri 12(pasi që per n>12 vlerat janë shumë të mëdha
 *@param n-duhet të jetë 0 deri në 12
 *@return kthen n! nëse n është prej 0-12,përndryshe kthen -1*/
{ public long faktorieli(int n)//e bëjmë tipin long pasi që kemi të bëjmë me vlera shumë të mëdha
{ int f = -1;
  if ( n >= 0  &&  n <= 12 )
     { int numëruesi = 0;  f = 1;
       while ( numëruesi != n )
             { numëruesi = numëruesi + 1;
               f = f * numëruesi;
             }
       // f == factorieli(n)
     }
  return f;
}
public static void main(String [] args)
{
Faktoriel f = new Faktoriel();
System.out.println(f.faktorieli(5));//P.sh n=5 
}
}