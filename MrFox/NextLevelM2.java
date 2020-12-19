import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevelM2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevelM2 extends Boton
{
    private static NextLevelM2 level2;
    private static int vida;
    private static int comida;
    private static int velPerro;
    private static int noPerros;
    private static int dificultad; //1 = Easy, 2 = Medium, 3 = Hard//
    private static int noArbustos;
    
    public NextLevelM2(int dificultad,int noPerros,int noArbustos,int velPerro,int comida,int vida){
        this.dificultad = dificultad;
        this.noPerros = noPerros;
        this.noArbustos = noArbustos;
        this.velPerro = velPerro;
        this.comida = comida;
        this.vida = vida;
        
    }
    public static NextLevelM2 getNextLevelM2(int dificultad,int noPerros,int noArbustos,int velPerro,int comida,int vida){
        if(level2 == null){
            level2 = new NextLevelM2(dificultad,noPerros,noArbustos,velPerro,comida,vida);
        }
        return level2;
    }
    public void act() 
    {
        checkMouse();
        if (Greenfoot.mouseClicked(this)){
             Greenfoot.setWorld(new Mision2(dificultad,noPerros,noArbustos,velPerro,comida,vida));
        }
    }
}
