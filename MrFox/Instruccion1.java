import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruccion1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruccion1 extends Instrucciones
{

    /**
     * Constructor for objects of class Instruccion1.
     * 
     */
    public Instruccion1()
    {   
        
    }
    public void act(){
        Greenfoot.delay(380);
        Greenfoot.setWorld(new Instruccion2());
    }
}
