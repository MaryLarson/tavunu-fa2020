/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaryAnn Larson
 */
public class CrodeExalted extends Crode {
    
     public CrodeExalted ()
    {
       name = "";
       yearOfBirth = Integer.MIN_VALUE;
       pava = 0;
    }
    
    public CrodeExalted (String newName, int newDate, int newPava)
    {
      super (newName, 1, newPava);  
       
       if (pava < 81)
       {
           throw new IllegalArgumentException ("invalid pava amount");
       }
       
       if ((newDate % 2) == 0)
       {
           yearOfBirth = newDate;
       }
           else
       {
            throw new IllegalArgumentException ("invalid year");
       }
}
    
    public String toString ()
    {
       return (name + " born in " + yearOfBirth + " is an Exalted Crode with " + pava + " pava."); 
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
         if ((bDate % 2) == 0)
             yearOfBirth = bDate;
          else
              throw new IllegalArgumentException ("invalid year");

     }


    
      
}