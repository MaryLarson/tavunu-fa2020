/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mary Ann Larson
 */
public class Crode extends Tavunu{
   
     public Crode ()
    {
       name = "";
       yearOfBirth = Integer.MIN_VALUE;
       pava = 0;
    }
    
    public Crode (String newName, int newBDate, int newPava)
    {
       name = newName;
       pava = newPava;
       yearOfBirth = newBDate; 
             
       if (pava < 81)
       {
           throw new IllegalArgumentException ("invalid pava amount");
       }
       
       if ((yearOfBirth % 2) == 0)
       {
           throw new IllegalArgumentException ("invalid year");
       }
    }
    
    public String toString ()
    {
       return (name + " born in " + yearOfBirth + " is a Crode with " + pava + " pava."); 
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
           throw new IllegalArgumentException ("invalid year");
     
         else
             yearOfBirth = bDate;
     }


    
    
}