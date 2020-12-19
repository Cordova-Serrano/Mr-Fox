import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonLoad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonLoad extends Boton
{
    GameRecord gameRecord = GameRecord.getGameRecord();
    
    
    /**
     * Act - do whatever the BotonLoad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        checkMouse();
        
        if (Greenfoot.mouseClicked(this)){
            int datos[];
            datos = new int[7];
            System.out.println("Loading Game Files...");
             datos = gameRecord.readFile("files/gameRecord.txt");
             clickSound();   
             game(datos);
            }
    }
    public void game(int[] datos){
        if(datos[2] == 1){//Mision1
            Greenfoot.setWorld(new Mision1(datos[3],1,datos[5],datos[6]));
        }
        if(datos[2] == 2){//Mision2
            Greenfoot.setWorld(new Mision2(datos[3],2,datos[5],datos[6],datos[1]-1,datos[0]));
        }
        if(datos[2] == 3){//Mision3
            Greenfoot.setWorld(new Mision3(datos[3],1,datos[5],datos[6],datos[1]-1,datos[0]));
        }
    }
}
