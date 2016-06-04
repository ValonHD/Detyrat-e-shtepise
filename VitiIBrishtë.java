import javax.swing.*;

public class VitiIBrishtë
{
    public static void main(String[] args)
    {   String viti = JOptionPane.showInputDialog("Shkruani vitin:");
        int i = new Integer(viti).intValue();
        //Vit i brishtë është një vit i plotpjestueshëm me 4,400 por jo me 100        
        if ((i % 400 == 0) || (i % 4 == 0) && (i % 100 != 0))
        {
            JOptionPane.showMessageDialog(null,"viti " +viti+ " është vit i brishtë.");
        }
        else
        {
           JOptionPane.showMessageDialog(null,"viti " +viti+ " nuk është vit i brishtë");
        }
    }
}