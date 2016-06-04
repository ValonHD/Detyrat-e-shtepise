import javax.swing.*;
public class SieveOfEratosthenes
{
    /** Funksioni per te llogaritur gjithe numrat e thjeshte me te vogel se n **/
    private int[] calcPrimes(int N)
    {
        int[] arr = new int[N + 1];
        for (int i = 2; i <= Math.sqrt(N); i++)
        {
            if (arr[i] == 0)
            {
                for (int j = i * i; j <= N; j += i)
                {
                    arr[j] = 1;
                }
            }
        }
        return arr;
    }
    /** Funksioni per ti marr numrat e thjeshte **/
    public void getPrimes(int N)
    {
        int[] primes = calcPrimes(N);
        display(primes);
    }
    /** Metoda per paraqitjen e numrave te thjeshte**/
    public void display(int[] primes)
    {
        System.out.print("\nNumrat e thjeshte = ");
        for (int i = 2; i < primes.length; i++)
            if (primes[i] == 0)
                System.out.print(i +" ");
        System.out.println();
    }
    /** Metoda main **/
    public static void main (String[] args) 
    {
        int i = new Integer(JOptionPane.showInputDialog
        ("Shkruaj nje numer per te gjetur te gjithe numrat e thjesht me te vogel se ai numer:")).intValue();
        SieveOfEratosthenes s = new SieveOfEratosthenes();
        s.getPrimes(i);        
    }
}