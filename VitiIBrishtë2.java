import javax.swing.*; 
class VitiIBrisht�2 
//Ky aplikacion �sht� p�raf�rsisht i njejt� me VitiIBrisht�(t� parin�) vetem se k�tu e p�rdora edhe "switch"
{
    public static void main(String[] args)
     {

        String muaji = "Shkurt";
        String viti = JOptionPane.showInputDialog("Shkruani vitin:");
        int i = new Integer(viti).intValue();

        switch (muaji) {
        
            case "Shkurt":
                      {
                if (((i % 4 == 0) && !(i % 100 == 0)) || (i % 400 == 0))
                   {JOptionPane.showMessageDialog(null,"Viti "+viti+" �sht� i brisht�");}
                else
                   {JOptionPane.showMessageDialog(null,"Viti "+viti+" nuk �sht� i brisht�");}
                break;}
                       }
        
    }
}