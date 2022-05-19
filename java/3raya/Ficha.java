//Creacion de la clase ficha
public class Ficha{
  private String forma;
  private String color;

//Constructor por defecto
  public Ficha(){
    this.forma = "X";
    this.color = "azul"
  }

//Constructor con parametros
  public Ficha(String ficha){
    if(ficha == "X" || ficha == "O") this.forma = ficha;
    this.color = color;
  }

public Ficha(Ficha ficha, String color){
  this.forma = ficha.forma;
  this.ficha = ficha.color;
}
// Get de ficha
  public String getFicha(){
    return this.forma;
  }

  public String getColor(){
    return this.color;
  }

//Set de ficha
  public void setFicha(){
    this.forma = forma;
  }

  public void setColor(){
    this.color = color;
  }
}
