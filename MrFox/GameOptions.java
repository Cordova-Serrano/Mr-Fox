import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOptions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOptions extends Menu
{

    /**
     * Constructor for objects of class GameOptions.
     * 
     */
    public GameOptions()
    {   
        
        addObject(new BotonNew(),520,350);
        addObject(new BotonLoad(),520,490);
        
    }
}
