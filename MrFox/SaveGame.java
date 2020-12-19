import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SaveGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaveGame extends Boton
{
    private static SaveGame saveGame;
    private static int vida;
    private static int comida;
    private static int mision;
    private static int velPerro;
    private static int noPerros;
    private static int dificultad; //1 = Easy, 2 = Medium, 3 = Hard//
    private static int noArbustos;
    public SaveGame(int vida,int comida,int mision,int dificultad,int noPerros,int noArbustos,int velPerro){
        this.vida = vida;
        this.comida = comida;
        this.mision = mision;
        this.dificultad = dificultad;
        this.noPerros = noPerros;
        this.noArbustos = noArbustos;
        this.velPerro = velPerro;
    }
    public static SaveGame getSaveGame(int vida,int comida,int mision,int dificultad,int noPerros,int noArbustos,int velPerro){
        if(saveGame == null){
            saveGame = new SaveGame(vida,comida,mision,dificultad,noPerros,noArbustos,velPerro);
        }
        else{
            saveGame.setAll(vida,comida,mision,dificultad,noPerros,noArbustos,velPerro);
            
        }
        return saveGame;
    }
    public void act() 
    {
        // Add your action code here.
        checkMouse();
        if (Greenfoot.mouseClicked(this)){
             GameRecord record = GameRecord.getGameRecord();
             clickSound();
             record.setFile(vida,comida,mision);
        }
    }
    public void setAll(int vida,int comida,int mision,int dificultad,int noPerros,int noArbustos,int velPerro){
        this.vida = vida;
        this.comida = comida;
        this.mision = mision;
        this.dificultad = dificultad;
        this.noPerros = noPerros;
        this.noArbustos = noArbustos;
        this.velPerro = velPerro;
    }
}
