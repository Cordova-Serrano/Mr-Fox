import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Conejo extends Personaje
{
    private String[] framesWalkDer = {"ConejoWalk/conejoWalk1R.png","ConejoWalk/conejoWalk2R.png","ConejoWalk/conejoWalk3R.png","ConejoWalk/conejoWalk4R.png","ConejoWalk/conejoWalk5R.png"};
    private String[] framesWalkIzq = {"ConejoWalk/conejoWalk1L.png","ConejoWalk/conejoWalk2L.png","ConejoWalk/conejoWalk3L.png","ConejoWalk/conejoWalk4L.png","ConejoWalk/conejoWalk5L.png"};
        
    private String key;
    private FrameContainer frameContainer;

    
    public Conejo(){
        super(5);
        frameContainer = new FrameContainer();
    }
    
    public void act() 
    {
        IAconejo();
        animacionConFrameContainer();
    }    
    
    public void IAconejo(){
        key = Greenfoot.getKey();
        x = getX();
        y = getY();

        /*---IA---*/
        moverseEnDireccionesAleatorias(5);

        /*--- Controles de frameStill ---*/
        if(key==null){
            frameContainer.setFrameStill(0);
        } else {
            frameContainer.setFrameStill(1);
        }
        
        setLocation(x,y);
        
    }
    
    public void animacionConFrameContainer(){
        if(DireccionX==1) {
            frameContainer.animacion(framesWalkDer, this);
        } else {
            frameContainer.animacion(framesWalkIzq, this);
        }
    }
}
