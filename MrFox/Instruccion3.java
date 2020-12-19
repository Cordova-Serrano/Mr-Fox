import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruccion3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruccion3 extends Instrucciones
{

    /**
     * Constructor for objects of class Instruccion3.
     * 
     */
    public Instruccion3()
    {
    }
    public void act(){
        Greenfoot.delay(380);
        Greenfoot.setWorld(new Instruccion4());
    }
}
