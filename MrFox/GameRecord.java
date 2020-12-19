import java.io.*;
import java.util.*;
import java.lang.*;

public class GameRecord{
    private static GameRecord file;
    
    public GameRecord(){
    }
    public static GameRecord getGameRecord(){
        if(file == null){
            file = new GameRecord();
        }
        return file;
    }
    
    public boolean setFile(int vida,int comida,int mision){
        boolean bandera = false; 
        String vidaS = String.valueOf(vida);
        String comidaS = String.valueOf(comida);
        String misionS = String.valueOf(mision);
        
        
        try {
            //String ruta = "/files/";
            String contenido = vidaS + comidaS + misionS;
            File file = new File("files/gameRecord.txt");
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(vidaS+"\n");
            bw.write(comidaS+"\n");
            bw.write(misionS+"\n");
            bandera = true; //Bandera TRUE archivo creado correctamente
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bandera;
    }
    public int[] readFile(String nameFile){
        Scanner archivo = null;
        int datos[];
        datos = new int[7];
        System.out.println("Leyendo File GameRecord");
        try{
        archivo = new Scanner(new File(nameFile));
        }
        catch(Exception e){
            System.err.println("Archivo no encontrado");
        }
        
        int num=0, i=1;
        while(archivo.hasNext()){
            
        
          num = archivo.nextInt(); //El valor tipo string es convertido a entero
          System.out.println("Valor entero: "+num);
          if(i == 1){//Vida
              datos[0] = num;
              System.out.println("Vida: "+datos[0]);
            }
          if(i == 2){//Comida
              datos[1] = num;
              System.out.println("Comida: "+datos[1]);
            }
          if(i == 3){//Vida
              datos[2] = num;
              System.out.println("Mision: "+datos[2]);
            }
          if(i == 4){//Vida
              datos[3] = num;
              System.out.println("Dificultad: "+datos[3]);
            }
          if(i == 5){//Comida
              datos[4] = num;
              System.out.println("#Perros: "+datos[4]);
            }
          if(i == 6){//Vida
              datos[5] = num;
              System.out.println("#noArbustos: "+datos[5]);
            }
          if(i == 7){//Vida
              datos[6] = num;
              System.out.println("Vel Perro: "+datos[6]);
            }
            i++;
        }
        return datos;
    }
}

