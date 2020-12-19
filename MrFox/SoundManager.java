import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoundManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundManager{
    private static SoundManager soundManager;
    
    private GreenfootSound intro = new GreenfootSound("Intro.mp3"); // Musica para la intro
    private GreenfootSound musicM1 = new GreenfootSound("Mision1.mp3");  //Musica para la mision1
    
    private SoundManager(){
        
    }
    
    public static SoundManager getSoundManager(){
        if(soundManager == null){
            soundManager = new SoundManager();
        }
        return soundManager;
    }
    
    public void playIntro(){
        intro.setVolume(25);
        intro.play();   
    }
    
    public void stopIntro(){
        intro.stop();
    }
    
    public void playMusicM1(){
        musicM1.setVolume(25);
        musicM1.play();
    }
    
    public void stopMusicM1(){
        musicM1.stop();
    }
}
