import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Disparo extends Personaje
{
    private String[] frameBala = {"Cazador/bala.png","Cazador/bala.png"};
    private String key;
    private FrameContainer frameContainer;
    private Zorro Zorro;
    
    public Disparo(int velocidad){
        super(velocidad);
        frameContainer = new FrameContainer();
        Zorro = new Zorro();
    }
    
    public void act() 
    {
        Trayectoria();
        animacionConFrameContainer();
        colisionZorro();
    }    
    
    public void Trayectoria(){
        key = Greenfoot.getKey();
        x = getX();
        y = getY();

        /*---IA---*/
        x = x-velocity;

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
            frameContainer.animacion(frameBala, this);
        } else {
            frameContainer.animacion(frameBala, this);
        }
    }
    
    public void colisionZorro(){
        Actor zorro = getOneObjectAtOffset(0,0,Zorro.class);
        int vida;
        if(zorro != null){
            World detect = getWorld();
            vida = ((Zorro)zorro).getVida()-1;
            ((Zorro)zorro).setVida(vida);
            //detect.removeObject(this);
        }
    }
}
