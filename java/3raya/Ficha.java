//Creacion de la clase ficha
public class Ficha{
  private String forma;

//Constructor por defecto
  public Ficha(){
    this.forma = "X";
  }

//Constructor con parametros
  public Ficha(String ficha){
    if(ficha == "X" || ficha == "O")
      this.forma = ficha;
  }

// Get de ficha
  public String getFicha(){
    return this.forma;
  }

//Set de ficha
  public void setFicha(){
    this.forma = forma;
  }
}
