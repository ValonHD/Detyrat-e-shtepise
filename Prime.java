public class Prime
{
 /** gjejNumratEThjesht� merr vler� t� plot� dhe gjen numrat e thjesht� sipas vargut boolean. 
 N�se �sht� num�r i thjesht� at�her� mbetet true, perndryshe n�se �sht� num�r i p�rb�r� b�het false
 * @param n - merr num�r t� plot� dhe cakton kufirin se deri ku duhet t� gjenden numrat e thjesht� */
 public  String gjejNumratEThjesht�(int n)
  {
    boolean[] P = new boolean[n+1];
    String b = "";
    for(int i = 2; i < P.length; i++)
       {P[i] = true;}

    for(int i = 2; 2*i <= n; i++)
       {
         for(int j = i; i*j <= n; j++)
            {P[i*j] = false;}
       }
       for(int i = 2; i <= n; i++)
       {if(P[i]){ b=""+i;}}  
    return b;
   }
   
   /* iThjesht� tregon se a �sht� num�r i thjesht� apo jo
   * @param n - tregon deri te cili num�r do t� tregoj� numrat e thjesht� */
  public static boolean iThjesht�(double n) 
  {
		boolean prime = true;
		int limit = (int) Math.sqrt(n);
 
		for (double i = 2; i <= limit; i++) 
      {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}