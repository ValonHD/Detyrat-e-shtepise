import javax.swing.*;
public class Nota
{public static void main(String [] args)
 {String pik�t = JOptionPane.showInputDialog("Shkruani pik�t:");
        int nota = new Integer(pik�t).intValue();
  switch (nota)
  
  {case 100: case99: case98: case97: case96: case95: case94: case93: case92: case91: case90:
     {JOptionPane.showMessageDialog(null,"Ju keni not�n A");
            break; 
          }
   case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
    {JOptionPane.showMessageDialog(null,"Ju keni not�n B");
           break;
          }     
   case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
    {JOptionPane.showMessageDialog(null,"Ju keni not�n C");
           break; 
          }
   case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
     {JOptionPane.showMessageDialog(null,"Ju keni not�n D");
           break;
          }
   case 59: case 58: case 57: case 56: case 55: case 54: case 53: case 52: case 51: case 50:
   {JOptionPane.showMessageDialog(null,"Ju keni not�n E");
           break;
          }
   case 49: case 48: case 47: case 46: case 45: case 44: case 43: case 42: case 41: case 40:
   case 39: case 38: case 37: case 36: case 35: case 34: case 33: case 32: case 31: case 30:
   case 29: case 28: case 27: case 26: case 25: case 24: case 23: case 22: case 21: case 20:
   case 19: case 18: case 17: case 16: case 15: case 14: case 13: case 12: case 11: case 10:
   case 9: case 8: case 7: case 6: case 5: case 4: case 3: case 2: case 1: case 0:
   {JOptionPane.showMessageDialog(null,"Ju keni not�n F");
           break;
           }                          
  default:{JOptionPane.showMessageDialog(null,"Gabim n� shtypje t� pik�ve");           
  
          }
  }
 }
}                   