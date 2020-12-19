import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Boton
{
    private static Exit exit;
    private SoundManager sound = SoundManager.getSoundManager();
    
    public Exit(){
        
    }
    public static Exit getExit(){
        if(exit == null){
            exit = new Exit();
        }
        return exit;
    }
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkMouse();
        if (Greenfoot.mouseClicked(this)){
             clickSound();
             sound.stopMusicM1();
             Greenfoot.setWorld(new StartMenu());
            }
    }    
}
