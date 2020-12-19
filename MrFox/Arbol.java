import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbol extends Entorno
{
    private boolean isFoxTouching;
    
    /**
     * Act - do whatever the Arbol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isFoxTouching){
            isFoxTouching = false;
        }
        // Add your action code here.
    }  
    
    public void setIsFoxTouching(boolean isFoxTouching){
        this.isFoxTouching = isFoxTouching;
    }
}
