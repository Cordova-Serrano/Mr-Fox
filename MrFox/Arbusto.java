import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arbusto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbusto extends Entorno
{
    /**
     * Act - do whatever the Arbusto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        zorroEnArbusto();
    }
    public boolean zorroEnArbusto(){
        Actor zorroColision = getOneIntersectingObject(Zorro.class);
        if(zorroColision != null){
            adjustTransparency(255/3);
            return true;
        }else{
            adjustTransparency(255);
            return false;
        }

    }
    public void adjustTransparency(int adjust){
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }  
}
