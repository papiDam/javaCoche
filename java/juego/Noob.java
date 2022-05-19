// Clase noob
public class Noob{
  public String nombre;
  protected int numVidas;
  protected int velocidad;

  private final static int VELOCIDAD = 9;

//Contructores
  public Noob(){
    this.nombre = "Alberto";
    this.numVidas = 5;
    this.velocidad = VELOCIDAD;
  }

  public Noob(String nombre,int numVidas){
    this.nombre = nombre;
    this.numVidas = numVidas;
    this.velocidad = VELOCIDAD;
  }

//Getter y setters
  public String getNombre(){
    return this.nombre;
  }
  public int getNumVidas(){
    return this.numVidas;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public int caminar(){
    return VELOCIDAD;
  }
}
