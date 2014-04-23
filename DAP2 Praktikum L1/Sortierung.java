
/**
 * Write a description of class Sortierung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sortierung
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Sortierung
     */
    public Sortierung()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void insertionSort(int[] array)
    {
        int temp;
        for(int i = 1; i < array.length; i++)
        {
            temp = array[i];
            int j = i;
            while(j > 0 && array[j-1] > temp)
            {
                   array[j] = array[j-1];
                   j--;
            }
            array[j] = temp;
        }
    }
    
    
    public static boolean isSorted(int[] array)
    {
      //Überprüfen ob die Zahl kleiner ist als die nächste Zahl.  
      for(int i=1; i<array.length - 1; i++)
      {
          if(array[i-1] > array[i]) // Falls Zahl größer falsch zurück geben.
          {
              return false;
          }
      }
      return true;
    }
    
    public static void main(int length, String sort, String filling)
    {
        int[] array = new int[length]; //Array mit übergebener länge erstellen.
        
        java.util.Random numberGenerator = new java.util.Random(); //Zufallsgenerator
        
        //Art der Füllung überprüfen und Array füllen.
        switch(filling)
        {
            case "auf":
                    for(int i=0;i < array.length;i++)
                    {
                        array[i] = i;
                    }
                    break;
            case "ab":
                    for(int i=0;i < array.length;i++)
                    {
                        array[i] = array.length-i;
                    }
                    break;
            case "rand":
                    for(int i=0;i < array.length;i++)
                    {
                        array[i] = numberGenerator.nextInt();
                    }
                    break;                    
            default:
                    //Runtime Exception
        }
        
        //Array ausgeben.
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + ", ");
        }    
    }
        
        
        
    }

