import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TryAgainM2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryAgainM2 extends Boton
{
    private int dificultad;
    private int noPerros;
    private int noArbustos;
    private int velPerro;
    private int comida;
    private int vida;
    public TryAgainM2(int dificultad,int noPerros,int noArbustos,int velPerro,int comida,int vida){
        this.dificultad = dificultad;
        this.noPerros = noPerros;
        this.noArbustos = noArbustos;
        this.velPerro = velPerro;
        this.comida = comida;
        this.vida = vida;
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
             Greenfoot.setWorld(new Mision2(dificultad,noPerros,noArbustos,velPerro,1,3));
        }
    }      
}
