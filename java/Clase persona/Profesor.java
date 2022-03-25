public class Profesor extends Persona{
  private int seguridadSocial;
  private double sueldo;

  public Profesor(){
    super();
    this.seguridadSocial = 4564354;
    this.sueldo = 1487.65;
  }
  public Profesor(String nombre, String dni, int seguridadSocial, double sueldo){
    super(nombre,dni);
    this.seguridadSocial = seguridadSocial;
    this.sueldo = sueldo;
  }

  public String toString(){
    return super.toString() + ". Mi numero de la seguridad social es " + this.seguridadSocial + " y mi sueldo es "+ this.sueldo;
  }
}
