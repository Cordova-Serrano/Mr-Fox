import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Perro extends Personaje
{
    private String[] framesWalkDer = {"Perro/perro1R.png","Perro/perro2R.png","Perro/perro3R.png","Perro/perro4R.png","Perro/perro5R.png"};
    private String[] framesWalkIzq = {"Perro/perro1L.png","Perro/perro2L.png","Perro/perro3L.png","Perro/perro4L.png","Perro/perro5L.png"};
    
    private String key;
    private FrameContainer frameContainer;
    //private int DireccionX=1;
    
    private Zorro Zorro;
    public Perro(int velocidad){
        super(velocidad);
        frameContainer = new FrameContainer();
        Zorro = new Zorro();
    }
    
    public void act() 
    {
        //frameContainer = new FrameContainer();
        IAperro();
        animacionConFrameContainer();
    }
    
    public void IAperro(){
        key = Greenfoot.getKey();
        x = getX();
        y = getY();
        /*---IA Perro---*/
        //Variables para rastrear al Zorro
        Actor zorro = getWorld().getObjects(Zorro.class).get(0);
        int xZorro = zorro.getX();
        int yZorro = zorro.getY();
        
        if(((Zorro)zorro).zorroEscondido()==true){
            moverseEnDireccionesAleatorias(15);
            
            //Variables para rastrear al Conejo
            if(getWorld().getObjects(Conejo.class).size() != 0){
                Actor conejo = getWorld().getObjects(Conejo.class).get(0);
                int xConejo = conejo.getX();
                int yConejo = conejo.getY();
                if(conejo != null){
                    persegirPresa(xConejo, x, yConejo, y);
                }
            }
            //
        }    
        else{
            persegirPresa(xZorro, x, yZorro, y);
        }
        
        /*--- Controles de frameStill ---*/
        if(key==null){
            frameContainer.setFrameStill(0);
        } else {
            frameContainer.setFrameStill(1);
        }
        
        setLocation(x,y);
    }
    
    public void animacionConFrameContainer(){
        if(DireccionX==1) {
            frameContainer.animacion(framesWalkDer, this);
        } else {
            frameContainer.animacion(framesWalkIzq, this);
        }
    }
    
    public void persegirPresa(int xPresa, int x, int yPresa, int y){
        if(xPresa<x){
            this.x = x - velocity;
            DireccionX= -1;
        }
        else{
            this.x = x + velocity;
            DireccionX= 1;
        }
        if(yPresa<y){
            this.y = y - velocity;
        }
        else{
            this.y = y + velocity;
        }
    }
}
