import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class Personaje extends Actor
{
    /*---Variables usadas para mover al personaje---*/
    protected int velocity;
    protected int x;
    protected int y;
    
    /*---Variables usadas para direcciones random---*/
    protected Random Direccion;
    protected int DireccionX;
    protected int DireccionY;
    protected int contadorParaCambiarDireccion=0;
    public void act() 
    {
        // Add your action code here.
    }  
    
    public Personaje(int velocity){
        this.velocity = velocity;
        Direccion = new Random();
    }
    
    public void moverseEnDireccionesAleatorias(int cambio){
        if(contadorParaCambiarDireccion==0){
            DireccionX = Direccion.nextInt(2); //Numero aleatorio entre 0 y 1
            DireccionY = Direccion.nextInt(2); //Numero aleatorio entre 0 y 1
            contadorParaCambiarDireccion=cambio;
        }
        else{
            contadorParaCambiarDireccion--;
        }
        if(DireccionX==0){
            this.x = x - velocity;
        }
        if(DireccionX==1){
            this.x = x + velocity;
        }
        if(DireccionY==0){
            this.y = y - velocity;
        }
        if(DireccionY==1){
            this.y = y + velocity;
        }
    }
}
