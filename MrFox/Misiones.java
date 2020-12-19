import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;
/**
 * Write a description of class Misiones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Misiones extends World
{
    protected GreenfootSound clickSound = new GreenfootSound("ClickSound.mp3");
    /**
     * Constructor for objects of class Misiones.
     * 
     */
    public Misiones()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
    }
     public void deleteDogs(){
        List remove = getObjects( Perro.class );
        for (Object objects : remove)
        removeObject( ( Perro ) objects );
    }
    public void menuPause(){    
        MenuPausa menuPausa = MenuPausa.getMenuPausa();
          
        addObject(menuPausa.getPause(),530,400);
        addObject(menuPausa.getContinue(),530,290);
        addObject(menuPausa.getOption(),530,360);
        addObject(menuPausa.getSaveGame(),530,430);
        addObject(menuPausa.getExit(),530,500);        
    }
}
