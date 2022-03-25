public class Alumno extends Persona{
  private String grado;


  public Alumno(){
    this.grado = "DAM";
  }

  public Alumno(String nombre, String dni, String grado){
    //Super llama al constructor de la clase superior(de la que extendemos)
    super(nombre, dni);
    this.grado = grado;
  }

  public String toString(){
    return super.toString() + ". Estoy en el grado de " + this.grado;
  }
}
