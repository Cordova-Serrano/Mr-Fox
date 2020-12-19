import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HARD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HARD extends Boton
{
    /**
     * Act - do whatever the HARD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkMouse();
        
        if (Greenfoot.mouseClicked(this)){
             clickSound();   
             Greenfoot.setWorld(new Mision1(3,4,2,5));
        }
    }    
}
