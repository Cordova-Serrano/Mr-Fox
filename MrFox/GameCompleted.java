import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameCompleted here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameCompleted extends Actor
{
    private static GameCompleted gameCompleted;
    public GameCompleted(){
        
    }
    public static GameCompleted getGameCompleted(){
        if(gameCompleted == null){
            gameCompleted = new GameCompleted();
        }
        return gameCompleted;
    }    
}
