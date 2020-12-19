import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Continue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Continue extends Boton
{
    
    /**
     * Act - do whatever the Continue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouse();
        if (Greenfoot.mouseClicked(this)){
             clickSound();
             borrarMenuPause();
        }
    }
    public void borrarMenuPause(){    
        MenuPausa menuPausa = MenuPausa.getMenuPausa();
        World detect;
        detect = getWorld();
             
        detect.removeObject(menuPausa.getPause());
        detect.removeObject(menuPausa.getContinue());
        detect.removeObject(menuPausa.getOption());
        detect.removeObject(menuPausa.getSaveGame());
        detect.removeObject(menuPausa.getExit());
        
    }
}
