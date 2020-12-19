import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HUD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HUD extends Actor
{
    private int vida;
    private int comida;
    /**
     * Act - do whatever the HUD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HUD(){

    }
    public void act() 
    {
        
    }
    
    public void hudStatus(int comida, int vida){
        setImage("HUD/HUD"+comida+"-"+vida+".png");
    }
}
