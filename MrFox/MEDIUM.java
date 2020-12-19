import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MEDIUM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MEDIUM extends Boton
{
    /**
     * Act - do whatever the MEDIUM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkMouse();
        
        if (Greenfoot.mouseClicked(this)){
             clickSound();   
             Greenfoot.setWorld(new Mision1(2,2,4,3));
        }
    }    
}
