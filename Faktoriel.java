/*Detyra 5) nen c) k�rkon metod�n p�r gjetjen e faktorielit n!*/
public class Faktoriel
 /*faktorieli e llogarit n! n� rangun 0 deri 12(pasi q� per n>12 vlerat jan� shum� t� m�dha
 *@param n-duhet t� jet� 0 deri n� 12
 *@return kthen n! n�se n �sht� prej 0-12,p�rndryshe kthen -1*/
{ public long faktorieli(int n)//e b�jm� tipin long pasi q� kemi t� b�jm� me vlera shum� t� m�dha
{ int f = -1;
  if ( n >= 0  &&  n <= 12 )
     { int num�ruesi = 0;  f = 1;
       while ( num�ruesi != n )
             { num�ruesi = num�ruesi + 1;
               f = f * num�ruesi;
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