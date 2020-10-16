
import static java.lang.System.exit;


/**
 * A tavunu is an imaginary Earth-dwelling being.
 *
 * A tavunu looks a bit like a Patagonian Mara and lives in a non-gendered but
 * hierarchical society. Most interactions among tavuni are negotiated with
 * pava -- items of status used for bargaining.
 *
 * @author Mithat Konar
 * @author Your Name Yup its me Mary Ann Larson
 */
public class Tavunu {
    /* See readme.md for what to do. */
    
    
    private String name;
    private int pava;
    private int yearOfBirth;
    
    
    public Tavunu ()
    {
        name = "";
        yearOfBirth = Integer.MIN_VALUE;
        pava = 0;
    }
    

    Tavunu (String newName, int newBDate, int newPava)
    {
        name = newName;
        pava = newPava;
        yearOfBirth = newBDate;
    }
    
    public void Tavunu ()
    {
       // tis a empty method - yup 
    }
    
    public String toString ()
    {
       return (name + " born in " + yearOfBirth + " has " + pava + " pava."); 
    }
   
    public boolean setName (String newName)
    {
        boolean correctName = true;
        char firstLetter;
        if (!newName.isEmpty())
        {   
            firstLetter = (newName.charAt(0));
        
            if ((firstLetter == ('T')) || (firstLetter == ('D')))
            {  
                name = newName;
                 return correctName;
            }
            else
            {
                correctName = false;
                return correctName;
            }
        }
        else{
            correctName = false;
            return correctName;
        }
        
    }
    
    public String getName()
    {        
           return name;

    }
    
    
     public boolean spendPava (int amount)
    {
       boolean balance = true;
       
       if (amount  < 0)
       {
           balance = false;
           return balance;
       }
       else
       {
           pava -= amount;
           return balance;
       }
                   
    }
     
    public boolean receivePava (int amount)
    {
        boolean balance = true;
        if(amount < 0)
        {
            balance = false;
            return balance;
        }
        else
        {
            pava += amount;
            return balance;
        }
        
    }
     
     public int getPava ()
     {
       return pava;
     
     }
     
     public int getBirthYear ()
     {
         return yearOfBirth;
     }
     
     public void setBirthYear (int bDate)
     {
         yearOfBirth = bDate;
     }
}
