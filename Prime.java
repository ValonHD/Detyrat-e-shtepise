public class Prime
{
 /** gjejNumratEThjeshtë merr vlerë të plotë dhe gjen numrat e thjeshtë sipas vargut boolean. 
 Nëse është numër i thjeshtë atëherë mbetet true, perndryshe nëse është numër i përbërë bëhet false
 * @param n - merr numër të plotë dhe cakton kufirin se deri ku duhet të gjenden numrat e thjeshtë */
 public  String gjejNumratEThjeshtë(int n)
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
   
   /* iThjeshtë tregon se a është numër i thjeshtë apo jo
   * @param n - tregon deri te cili numër do të tregojë numrat e thjeshtë */
  public static boolean iThjeshtë(double n) 
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