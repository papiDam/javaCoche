import java.util.ArrayList;
import java.util.Arrays;

//Herencia de clase
public class Armario extends Mueble{
  private String tipoPuerta;
  private int numBaldas;


//Constructor por defecto
  public Armario(){
    super();
    this.tipoPuerta = "Abatible";
    this.numBaldas = 5;
  }
//Constructores con parametros
  public Armario(String material,ArrayList<Integer>dimensiones,String tipoPuerta, int numBaldas){
    super(material,dimensiones);
    this.tipoPuerta = tipoPuerta;
    this.numBaldas = numBaldas;
  }

  public Armario(String material,int ancho, int profundo, int alto, String tipoPuerta, int numBaldas){
    super(material,ancho,profundo,alto);
    this.tipoPuerta = tipoPuerta;
    this.numBaldas = numBaldas;
  }
//Creacion de los get
  public String getTipoPuerta(){
      return this.tipoPuerta;
  }
  public int getNumBaldas(){
    return this.numBaldas;
  }
//Creacion de los set
  public void setTipoPuerta(String tipoPuerta){
      this.tipoPuerta = tipoPuerta;
  }
  public void setNumBaldas(int numBaldas){
      this.numBaldas = numBaldas;
  }
  //metodo de superficie
  protected int superficie(){
    return super.superficie() * numBaldas;
  }
  //super.superficie()*numero baldas esta funcion me da error

//Creacion del toString
  public String toString(){
      return super.toString() + "\n-----Tipo de puerta-----\n"+ this.tipoPuerta + "\n-----Numero de baldas-----\n"+ this.numBaldas;
  }
}
