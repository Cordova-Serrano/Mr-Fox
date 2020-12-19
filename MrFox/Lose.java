import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lose
{
    private static Lose lose;
    private static YouLose youLose;
    private static Exit exit;
    private static TryAgainM1 tryAgainM1;
    private static TryAgainM2 tryAgainM2;
    private static TryAgainM3 tryAgainM3;
    
    private Lose(){
        
    }
    
    public static Lose getLose(){
        if(lose == null){
            lose = new Lose();
        }
        return lose;
    }
    
    public YouLose getYouLose(){
        if(youLose == null){
            youLose = new YouLose();
        }
        return youLose;
    }
    
    public Exit getExit(){
        if(exit == null){
            exit = new Exit();
        }
        return exit;
    }
    
    public TryAgainM1 getTryAgainM1(int dificultad,int noPerros,int noArbustos,int velPerro){
        if(tryAgainM1 == null){
            tryAgainM1 = new TryAgainM1( dificultad, noPerros, noArbustos, velPerro);
        }
        return tryAgainM1;
    }
    
    public TryAgainM2 getTryAgainM2(int dificultad,int noPerros,int noArbustos,int velPerro,int comida,int vida){
        if(tryAgainM2 == null){
            tryAgainM2 = new TryAgainM2( dificultad, noPerros, noArbustos, velPerro,comida,vida);
        }
        return tryAgainM2;
    }
    
    public TryAgainM3 getTryAgainM3(int dificultad,int noPerros,int noArbustos,int velPerro,int comida,int vida){
        if(tryAgainM3 == null){
            tryAgainM3 = new TryAgainM3( dificultad, noPerros, noArbustos, velPerro,comida,vida);
        }
        return tryAgainM3;
    }
}
