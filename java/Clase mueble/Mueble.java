
import java.util.ArrayList;
import java.util.Arrays;
//Creacion de clase
public class Mueble{
  private String material;
  protected ArrayList<Integer>dimensiones;

//Constructor por defecto
  public Mueble(){
    this.material = "Madera";
    this.dimensiones = new ArrayList<Integer>(Arrays.asList(200,80,80));
  }
//Constructores con parametros
  public Mueble(String material, int ancho, int profundo, int alto){
    this.material = material;
    this.dimensiones = new ArrayList<Integer>(Arrays.asList(ancho,profundo,alto));
  }

  public Mueble(String material, ArrayList<Integer>dimensiones){
    this.material = material;
    this.dimensiones = dimensiones;
  }
  //creacion de los gets
  public String getMaterial(){
    return this.material;
  }
  public ArrayList<Integer> getDimensiones(){
    return this.dimensiones;
  }
  //creacion de los sets
  public void setMaterial(String material){
    this.material = material;
  }
  public void setDimensiones(ArrayList<Integer>dimensiones){
    this.dimensiones = dimensiones;
  }
  public void setDimensiones(int ancho, int profundo, int alto){
    this.dimensiones = new ArrayList<Integer>(Arrays.asList(ancho,profundo,alto));
  }
  //metodo de superficie
  protected int superficie(){
    return this.dimensiones.get(0)*this.dimensiones.get(1);
  }
  //super.superficie()*numero baldas
  public String toString(){
    return "-----Material-----\n" + this.material + "\n-----dimensiones-----\n"+ "Ancho " + this.dimensiones.get(0)+"cm \n"+ "Profundidad " + this.dimensiones.get(1)+ "cm \n"+ "Altura " + this.dimensiones.get(2)+"cm \n-----superficie----- \n" + this.superficie() + "cm2";
  }
}
