import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends Actor
{
    protected GreenfootSound clickSound = new GreenfootSound("ClickSound.mp3");
    private int mouseOverSound = 0;
    private boolean mouseOver = false;
    private static int MAX_TRANS = 255;
    
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void checkMouse(){
        
        if(Greenfoot.mouseMoved(null)){
            mouseOver = Greenfoot.mouseMoved(this);
            
        }
        
        if(mouseOver){
          adjustTransparency(MAX_TRANS/3);
  
        }
        else{
            adjustTransparency(255);
        }
    }
    
    public void adjustTransparency(int adjust){
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
    public void clickSound(){
        clickSound.play();
    }
    public void act() 
    {
        
    }    
}
