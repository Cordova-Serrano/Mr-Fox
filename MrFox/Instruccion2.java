import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruccion2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruccion2 extends Instrucciones
{

    /**
     * Constructor for objects of class Instruccion2.
     * 
     */
    public Instruccion2()
    {
    }
    public void act(){
        Greenfoot.delay(380);
        Greenfoot.setWorld(new Instruccion3());
    }
}
