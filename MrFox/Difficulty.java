import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Difficulty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Difficulty extends Menu
{

    /**
     * Constructor for objects of class Difficulty.
     * 
     */
    public Difficulty()
    {
        addObject(new EASY(),520,350);
        addObject(new MEDIUM(),520,490);
        addObject(new HARD(),520,630);
    }
}
