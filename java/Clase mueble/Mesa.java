import java.util.ArrayList;
import java.util.Arrays;

//Herencia de clase
public class Mesa extends Mueble{
  private int numPatas;


//Constructor por defecto
  public Mesa(){
    super();
    this.numPatas = 4;
  }
//Constructores con parametros
  public Mesa(String material,ArrayList<Integer>dimensiones,int numPatas){
    super(material,dimensiones);
    this.numPatas = numPatas;
  }

  public Mesa(String material,int ancho, int profundo, int alto, int numPatas){
    super(material,ancho,profundo,alto);
    this.numPatas = numPatas;
  }
//Creacion del get
  public int getMesa(){
      return this.numPatas;
  }
//Creacion del set
  public void setMesa(int numPatas){
      this.numPatas = numPatas;
  }
//Creacion del toString
  public String toString(){
      return super.toString() + "\n-----Numero de patas-----\n"+ this.numPatas;
  }
}