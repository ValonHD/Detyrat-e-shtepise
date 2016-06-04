import javax.swing.*; 
class VitiIBrishtë2 
//Ky aplikacion është përafërsisht i njejtë me VitiIBrishtë(të parinë) vetem se këtu e përdora edhe "switch"
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
                   {JOptionPane.showMessageDialog(null,"Viti "+viti+" është i brishtë");}
                else
                   {JOptionPane.showMessageDialog(null,"Viti "+viti+" nuk është i brishtë");}
                break;}
                       }
        
    }
}