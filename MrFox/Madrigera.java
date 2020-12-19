import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Madrigera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Madrigera extends Entorno
{
    private boolean conejosEnMadrigera=true;
    
    public void act() 
    {
        MadrigeraAtacada();
    }
    
    public void MadrigeraAtacada(){
        Actor Zorro;
        Zorro = getOneObjectAtOffset(0,0,Zorro.class);
        if(Zorro != null && Greenfoot.isKeyDown("L") && conejosEnMadrigera){
            Conejo conejo = new Conejo();
            conejosEnMadrigera=false;
            getWorld().addObject(conejo,getX(),getY());
        }
    }
}
