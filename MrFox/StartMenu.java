import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends Menu
{   
    
    private Boton next = new BotonNext();
    
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public StartMenu()
    {   
        SoundManager sound = SoundManager.getSoundManager();
        sound.playIntro();
        Greenfoot.delay(190);
        prepare();
        
        addObject(new BotonStart(),520,420);
    }
    
    private void prepare()
    {
    }
}
