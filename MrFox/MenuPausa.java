import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuPausa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuPausa extends Actor
{
    private static MenuPausa menuPausa;
    private static Pause pause;
    private static Continue continuar;
    private static Options options;
    private static SaveGame saveGame;
    private static Exit exit;
    private static int vida;
    private static int comida;
    private static int mision;
    private static int velPerro;
    private static int noPerros;
    private static int dificultad; //1 = Easy, 2 = Medium, 3 = Hard//
    private static int noArbustos;
    
    public MenuPausa(int vida,int comida,int mision,int dificultad,int noPerros,int noArbustos,int velPerro){
        this.vida = vida;
        this.comida = comida;
        this.mision = mision;
        this.dificultad = dificultad;
        this.noPerros = noPerros;
        this.noArbustos = noArbustos;
        this.velPerro = velPerro;
    }
    
    public static MenuPausa getMenuPausa(){
        if(menuPausa == null){
            menuPausa = new MenuPausa(vida,comida,mision,dificultad,noPerros,noArbustos,velPerro);
        }
        return menuPausa;
    }
    //Getters de la instancia de cada uno de los botones del menu
    public Pause getPause(){
        if(pause == null){
            pause = new Pause();
        }
        return pause;
    }
    public Continue getContinue(){
        if(continuar == null){
            continuar = new Continue();
        }
        return continuar;
    }
    public Options getOption(){
        if(options == null){
            options = new Options();
        }
        return options;
    }
    public SaveGame getSaveGame(){
        if(saveGame == null){
            saveGame = new SaveGame(vida,comida,mision,dificultad,noPerros,noArbustos,velPerro);
        }
        return saveGame;
    }
    public Exit getExit(){
        if(exit == null){
            exit = new Exit();
        }
        return exit;
    }
}
