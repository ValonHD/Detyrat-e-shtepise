import javax.swing.*;
public class DuplicatesRemover
{public static String removeDuplicateLetters(String s)
{ String ans = "";
for ( int i = 0; i != s.length(); i = i + 1 )
{ if ( notFound(ans, s.charAt(i)) )
{ ans = ans + s.charAt(i); }
}
return ans;
}
public static boolean notFound(String a, char c)
{ boolean found = true;
for ( int j = 0; j != a.length(); j = j + 1 )
{ found = found && (c != a.charAt(j)); }
return found;
}
public static void main (String [] args)
{String s=JOptionPane.showInputDialog("Shkruaj nje fjali me 2 ose me shume shkronja te njejta:");
 System.out.println(removeDuplicateLetters(s));
}
}