import greenfoot.*;

/**
 * Write a description of class FrameContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrameContainer 
{
    // instance variables - replace the example below with your own
    private int frameStill;
    private int contadorFrames;
    
    /**
     * Constructor for objects of class FrameContainer
     */
    public FrameContainer()
    {
        contadorFrames=0;
        frameStill = 1;
    }

  
    public void animacion(String[] frames, Actor actor){
        if(frameStill == 0){
            if(contadorFrames>=frames.length){
                contadorFrames=1;
            }
            actor.setImage(frames[contadorFrames]);
            contadorFrames++;
        }
        if(frameStill == 1){
            actor.setImage(frames[0]);
        }
    }
    
    public void setFrameStill(int frameStill){
        this.frameStill = frameStill;
    }
    
    
    
}
