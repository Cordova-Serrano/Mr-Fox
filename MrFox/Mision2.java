import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;
/**
 * Write a description of class Mision2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mision2 extends Misiones{
    private int vida;
    private int comida;
    private int mision = 2;
    private int velPerro;
    private int noPerros;
    private int dificultad; //1 = Easy, 2 = Medium, 3 = Hard//
    private int noArbustos;
    //Creacion de Personajes//
    Zorro zorro = new Zorro();
    Gallina gallina = new Gallina();
    //Creacion de Entorno//
    Madrigera m1 = new Madrigera();
    Madrigera m2 = new Madrigera();
    //Creacion del HUD//
    HUD hud = new HUD();
    //Sonido//
    SoundManager sound = SoundManager.getSoundManager();
    /**
     * Constructor for objects of class Mision1.
     * 
     */
    public Mision2(int dificultad,int noPerros,int noArbustos,int velPerro,int comida,int vida)
    {   
        this.velPerro = velPerro;
        this.noPerros = noPerros;
        this.dificultad = dificultad;
        this.comida = comida;
        this.vida = vida;
        spawnBushes(noArbustos);
        spawnDogs(noPerros,velPerro);
        prepare();
    }
    
    private void prepare(){
        sound.playMusicM1();
        //Personajes agregados a Mision1//
        addObject(zorro,710,427);
        zorro.setVida(vida);
        zorro.setComida(comida);
        addObject(gallina,300,500);
        addObject(m1,934,219);
        addObject(m2,313,677);
        spawnTrees();
        hud.hudStatus(vida,comida);
        addObject(hud,520,750);
    }
    
    public void act(){
        Actor Perro;
        
        if(Greenfoot.isKeyDown("P")){
            clickSound.play();
            menuPause();
        }
        
        if(zorro.zorroAtacado()){
            deleteDogs();
            if(vida == 0){
            }else{
            spawnDogs(noPerros,velPerro);        
            vida = vida - 1;
            zorro.setVida(vida);
            hud.hudStatus(vida,comida);
            }
        }
        
        if(zorro.isOver()){
            youLose();
            deleteDogs();
            sound.stopMusicM1();
        }
        
        if(zorro.cazar()){
            comida = comida + 1;
            zorro.setComida(comida);
            hud.hudStatus(vida,comida);
        }
        if(comida == 2){
            missionComplete();
        }
    }
    
    public void missionComplete(){
        MissionComplete complete = MissionComplete.getMissionComplete();
        SaveGame saveGame = SaveGame.getSaveGame(vida,comida,mision,dificultad,noPerros,noArbustos,velPerro);
        NextLevelM3 level3 = NextLevelM3.getNextLevelM3(dificultad,noPerros,noArbustos,velPerro,comida,vida);
        
        addObject(complete,500,400);
        addObject(saveGame,320,450);
        addObject(level3,700,450);
        deleteDogs();
    
    }
    public void spawnTrees(){
        //Coordenadas de los arboles
        int x[]= {900,180,434,676};
        int y[]= {680,650,196,74};
      
        for(int i=0; i<4;i++){
            addObject(new Arbol(),x[i],y[i]);
        }
       
    }
    
    public void spawnBushes(int noArbustos){
        int x[]= {875,766,671,461,89};
        int y[]= {433,710,258,608,349};
        
        for(int i=0; i<5;i++){
            addObject(new Arbusto(),x[i],y[i]);
        }
       
    }
    
    public void spawnDogs(int noPerros,int velPerro){
        int x[]= {5,167,971,542};
        int y[]= {179,772,782,16};
        
        for(int i=0; i<noPerros;i++){
            addObject(new Perro(velPerro),x[i],y[i]);
        }
    }
   
    public void youLose(){    
        Lose youLose = Lose.getLose();
            
        addObject(youLose.getYouLose(),530,400);
        addObject(youLose.getExit(),435,455);
        addObject(youLose.getTryAgainM2(dificultad,noPerros,noArbustos,velPerro,comida,vida),620,455);
    }
}
