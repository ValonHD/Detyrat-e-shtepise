import javax.swing.*;

public class VitiIBrisht�
{
    public static void main(String[] args)
    {   String viti = JOptionPane.showInputDialog("Shkruani vitin:");
        int i = new Integer(viti).intValue();
        //Vit i brisht� �sht� nj� vit i plotpjestuesh�m me 4,400 por jo me 100        
        if ((i % 400 == 0) || (i % 4 == 0) && (i % 100 != 0))
        {
            JOptionPane.showMessageDialog(null,"viti " +viti+ " �sht� vit i brisht�.");
        }
        else
        {
           JOptionPane.showMessageDialog(null,"viti " +viti+ " nuk �sht� vit i brisht�");
        }
    }
}