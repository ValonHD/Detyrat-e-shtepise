import javax.swing.*;
public class Dekodo
{ public static void main(String[] args)
{ int[] kodi = new int[27]; // kjo është tabela e përkthimit
// kodi[0] e mban kodin për ' ',
// kodi[1] e mban kodin për 'a',
// kodi[2] e mban kodin për 'b', etj.
int k = new Integer(JOptionPane.showInputDialog
("Shkruaje amën (numër i plotë): ")).intValue();
kodi[0] = k;
for ( int i = 1; i != kodi.length; i = i+1 )
{ kodi[i] = (int)((kodi[i-1] * 1.3) + 1); } //tjeter sistem i kodimit
String pergjigjja = "";
boolean duke_perpunuar = true;
while ( duke_perpunuar )
{ String hyrja = JOptionPane.showInputDialog
("Shkruaje një numër të plotë për ta dekoduar" +
"(ose asgjë, për të përfunduar): ");
if ( hyrja.equals("") )
{ duke_perpunuar = false; }
else { char c = dekodo(kodi, new Integer(hyrja).intValue());
pergjigjja = pergjigjja + c;
}
}
System.out.println(pergjigjja);
}
/** dekodo e përkthen një kod (numër i plotë) në karakter
* @param kodi - vargu që i mban kodet për ' ', 'a', 'b', ..., 'z'
* @param i - numri i plotë që do të dekodohet
* @return (kthen) karakterin përkatës, ose '*' nëse numri nuk dekodohet */
private static char dekodo(int[] kodi, int i)
{ char c = '*';
boolean u_gjet = false;
int indeksi = 0;
while ( !u_gjet && indeksi != kodi.length )
{ if ( kodi[indeksi] == i )
{ u_gjet = true;
if ( indeksi == 0 )
{ c = ' '; }
else { c = (char)(indeksi + 'a' - 1); }
}
else { indeksi = indeksi + 1; }
}
return c;
}
}