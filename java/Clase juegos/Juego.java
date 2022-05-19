//Alberto Sanjuan Perez
//Creacion de kla clase padre
public class Juego{
  private String nombre;
  protected double precio;

  //Constructores
  public Juego(){
    this.nombre = "Fallout";
    this.precio = 30;
  }

  public Juego(String nombre, double precio){
    this.nombre = nombre;
    this.precio = precio;
  }

  //get
  public String getNombre(){
    return this.nombre;
  }

  public double getPrecio(){
    return this.precio;
  }

  //set
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setPrecio(double precio){
    this.precio = precio;
  }

  //metodo descuento
  protected double descuento(){
    return this.precio - 10;
  }

  //toString
  public String toString(){
    return "-----Nombre Juego----- \n"+ this.nombre + "\n-----Precio-----\n" + this.precio + "\n-----Precio con descuento\n" + this.descuento();
  }
}
