//Creamos la clase persona
//Dos tipos de herencia: extension(a los metodos del padre le añadimos metodos
//propios) y especificacion(modificamos los metodos del
//padre par adaptarlos a nuestra necesidad)
//ademas de la  por agregacion a composicion(añadir clases como attibutos
//de nuestra clase)explicado en coche

public class Persona{
  protected String nombre;
  protected String dni;

//Constructor
  public Persona(){
    this.nombre = "Alberto";
    this.dni = "12345678A";
  }
  public Persona(String nombre, String dni){
    this.nombre = nombre;
    this.dni = dni;
  }
  // Gets
  public String getNombre(){
    return this.nombre;
  }
  public String getDni(){
    return this.dni;
  }
  //Set
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setDni(String dni){
    this.dni = dni;
  }
  public String toString(){
    return "Me llamo "+ this.nombre + " y mi dni es " + this.dni;
  }
}
