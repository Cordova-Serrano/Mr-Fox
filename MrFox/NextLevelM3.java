import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevelM2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevelM3 extends Boton
{
    private static NextLevelM3 level3;
    private static int vida;
    private static int comida;
    private static int velPerro;
    private static int noPerros;
    private static int dificultad; //1 = Easy, 2 = Medium, 3 = Hard//
    private static int noArbustos;
    
    public NextLevelM3(int dificultad,int noPerros,int noArbustos,int velPerro,int comida,int vida){
        this.dificultad = dificultad;
        this.noPerros = noPerros;
        this.noArbustos = noArbustos;
        this.velPerro = velPerro;
        this.comida = comida;
        this.vida = vida;
    }
    public static NextLevelM3 getNextLevelM3(int dificultad,int noPerros,int noArbustos,int velPerro,int comida,int vida){
        if(level3 == null){
            level3 = new NextLevelM3(dificultad,noPerros,noArbustos,velPerro,comida,vida);
        }
        return level3;
    }
    public void act() 
    {
        checkMouse();
        if (Greenfoot.mouseClicked(this)){
             Greenfoot.setWorld(new Mision3(dificultad,noPerros,noArbustos,velPerro,comida,vida));
        }
    }
}
