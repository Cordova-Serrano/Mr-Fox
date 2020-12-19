import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class Zorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zorro extends Actor{
    private GreenfootSound walk = new GreenfootSound("Walk.mp3");
    private String[] framesWalkDer = {"ZorroWalk/zorroStillR.png","ZorroWalk/zorro1R.png","ZorroWalk/zorro2R.png","ZorroWalk/zorro3R.png","ZorroWalk/zorro4R.png","ZorroWalk/zorro5R.png"};
    private String[] framesWalkIzq = {"ZorroWalk/zorroStillL.png","ZorroWalk/zorro1L.png","ZorroWalk/zorro2L.png","ZorroWalk/zorro3L.png","ZorroWalk/zorro4L.png","ZorroWalk/zorro5L.png"};
    private int xDirection=1;   //Variable usada para indicar la direccios de los frames
    private int velocity = 9;
    private String key;
    private FrameContainer frameContainer;
    private int vida;
    private int comida;
    private Arbusto arbusto;
    
    public Zorro(){
        frameContainer = new FrameContainer();
        arbusto = new Arbusto();
    }
    
    public void act()
    {
        control();
        animacionConFrameContainer();
        cazar();
    }

    public void animacionConFrameContainer(){
        if(xDirection==1) {
            frameContainer.animacion(framesWalkDer, this);
        } else {
            frameContainer.animacion(framesWalkIzq, this);
        }
    }
    
    public void control(){
        key = Greenfoot.getKey();
        int x = getX();
        int y = getY();
        walk.setVolume(40);
        /*--- Controles de Direccion ---*/
        if(Greenfoot.isKeyDown("A") && canMoveLeft()){
            xDirection = -1;
            x = x - velocity;
            walk.play();
        }
        if(Greenfoot.isKeyDown("D") && canMoveRight()){
            xDirection = 1;
            x = x + velocity;
            walk.play();
        }
        if(Greenfoot.isKeyDown("W") && canMoveTop()){
            y = y - velocity;
            walk.play();
        }
        if(Greenfoot.isKeyDown("S") && canMoveBot() ){
            y = y + velocity;
            walk.play();
        }
        /*--- Controles de frameStill ---*/
        if(key==null && (Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("S"))){
            frameContainer.setFrameStill(0);
        } else {
            frameContainer.setFrameStill(1);
        }
        setLocation(x,y);
    }
    
    public boolean zorroEscondido(){
        Actor arbustoColision = getOneIntersectingObject(Arbusto.class);
        if(arbustoColision != null &&  Greenfoot.isKeyDown("J")){
            return true;
        }else{
            return false;
        }
    }
 
    public boolean cazar(){
        boolean bandera = false;
        Actor Gallina;
        Gallina = getOneObjectAtOffset(0,0,Gallina.class);

        if(Gallina != null && Greenfoot.isKeyDown("K")){
            World detect;
            detect = getWorld();
            detect.removeObject(Gallina);
            bandera = true;
        }
        return bandera;
    }
    public boolean zorroAtacado(){
        boolean bandera = false;
        Actor Perro;
        Perro = getOneObjectAtOffset(0,0,Perro.class);
        if(Perro != null){
            World detect;
            detect = getWorld();
            bandera = true;
        }
        return bandera;
    }
    public boolean isOver(){
        boolean bandera = false;
        if(getVida() == 0){
            bandera = true;
        }
        return bandera;
    }
    public void setVida(int vida){
        this.vida = vida;
        System.out.println("Vida del Zorro: "+vida);
    }
    
    public void setComida(int comida){
        this.comida = comida;
        System.out.println("Comida del Zorro: "+comida);
    }
    
    public int getVida(){
        return vida;
    }
    
    public int getComida(int comida){
        Actor Perro;
        Perro = getOneObjectAtOffset(0,0,Perro.class);
        if(Perro != null){
            World detect;
            detect = getWorld();
            detect.removeObject(Perro);
        }
        return comida;
    }
   public boolean canMoveLeft(){
       boolean canMove =  true;
       
       int imageWidth = getImage().getWidth();
       int imageHeight = getImage().getHeight();
                                          // x  y             // Pixeles Cerca del objeto //
       if(getOneObjectAtOffset(imageWidth / -2 , imageHeight / -2, Arbol.class) != null || 
          getOneObjectAtOffset(imageWidth / -2 , imageHeight / 2, Arbol.class) != null)
          canMove = false;
          
       return canMove;
   }
    
   public boolean canMoveRight(){
       boolean canMove =  true;
       
       int imageWidth = getImage().getWidth();
       int imageHeight = getImage().getHeight();
                                         // x  y              // Pixeles Cerca del objeto //
       if(getOneObjectAtOffset(imageWidth / 2 , imageHeight / -2, Arbol.class) != null || 
          getOneObjectAtOffset(imageWidth / 2 , imageHeight / 2, Arbol.class) != null)
          canMove = false;
          
       return canMove;
   }
   
   public boolean canMoveTop(){
       boolean canMove = true;
       Arbol arbol;
       
       int imageWidth = getImage().getWidth();
       int imageHeight = getImage().getHeight();
       
       if(getOneObjectAtOffset(-imageWidth / 4, imageHeight / -2, Arbol.class) != null || 
          getOneObjectAtOffset(imageWidth / 4, imageHeight / -2, Arbol.class) != null ||
          getOneObjectAtOffset(0, imageHeight / -2, Arbol.class) != null){
          canMove = false;
        }
          
       return canMove;
   }
   
   public boolean canMoveBot(){
      boolean canMove = true;
       Arbol arbol;
       
       int imageWidth = getImage().getWidth();
       int imageHeight = getImage().getHeight();
       
       if(getOneObjectAtOffset(-imageWidth / 4, imageHeight / 2, Arbol.class) != null || 
          getOneObjectAtOffset(imageWidth / 4, imageHeight / 2, Arbol.class) != null ||
          getOneObjectAtOffset(0, imageHeight / 2, Arbol.class) != null){
          canMove = false;
        }
          
       return canMove;
   }
}  

