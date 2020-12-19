import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TryAgainM1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryAgainM1 extends Boton
{
    private int dificultad;
    private int noPerros;
    private int noArbustos;
    private int velPerro;
    public TryAgainM1(int dificultad,int noPerros,int noArbustos,int velPerro){
        this.dificultad = dificultad;
        this.noPerros = noPerros;
        this.noArbustos = noArbustos;
        this.velPerro = velPerro;
    }
    /**
     * Act - do whatever the TryAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouse();
        if (Greenfoot.mouseClicked(this)){
             clickSound();
             Greenfoot.setWorld(new Mision1(dificultad,noPerros,noArbustos,velPerro));
        }
    }      
}
