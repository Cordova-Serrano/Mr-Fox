import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Cazador extends Personaje
{
    private String[] framesCazador = {"Cazador/cazador1.png","Cazador/cazador2.png","Cazador/cazador3.png"};
    private String key;
    private FrameContainer frameContainer;

    private int tiempoRetroseso;
    public Cazador(){
        super(5);
        frameContainer = new FrameContainer();
        tiempoRetroseso=0;
    }
    
    public void act() 
    {
        IACasador();
        animacionConFrameContainer();
        disparar();
    }    
    
    public void IACasador(){
        key = Greenfoot.getKey();
        x = getX();
        y = getY();

        /*---IA---*/
        Actor zorro = getWorld().getObjects(Zorro.class).get(0);
        int yZorro = zorro.getY();
        if(yZorro<y){
            this.y = y - velocity;
        }
        else{
            this.y = y + velocity;
        }

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
            frameContainer.animacion(framesCazador, this);
        } else {
            frameContainer.animacion(framesCazador, this);
        }
    }
    
    public void disparar(){
        
        if(tiempoRetroseso==25){
            Disparo disparo = new Disparo(10);
            getWorld().addObject(disparo,x,y);
            tiempoRetroseso=0;
        }
        tiempoRetroseso++;
    }
}
