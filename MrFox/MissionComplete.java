import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MissionComplete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MissionComplete extends Actor
{
    private static MissionComplete missionComplete;
    public MissionComplete(){
        
    }
    public static MissionComplete getMissionComplete(){
        if(missionComplete == null){
            missionComplete = new MissionComplete();
        }
        return missionComplete;
    }   
}
