import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gallina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gallina extends Personaje
{   
    private String key;
    private FrameContainer frameContainer;
    
    public Gallina(){
        super(3);
        frameContainer = new FrameContainer();
    }
    /**
     * Act - do whatever the Gallina wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        IAgallina();
    } 
    
    public void IAgallina(){
        key = Greenfoot.getKey();
        x = getX();
        y = getY();

        /*---IA---*/
        moverseEnDireccionesAleatorias(10);

        /*--- Controles de frameStill ---*/
        if(key==null){
            frameContainer.setFrameStill(0);
        } else {
            frameContainer.setFrameStill(1);
        }
        
        setLocation(x,y);
        
    }
}
