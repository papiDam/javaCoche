public class Alumno extends Persona{
  private String grado;                 // Acceso de la propia clase
          String gradoSinModificador;   // Acceso desde el paquete
  public String gradoPublico;           // Acesso desde hijos y desde el paquete
  protected String gradoProtegido;      // Acceso global


  public Alumno(){
    this.grado = "DAM";
  }

  public Alumno(String nombre, String dni, String grado){
    //Super llama al constructor de la clase superior(de la que extendemos)
    super(nombre, dni);
    this.grado = grado;
    //this.nombre = nombre;  //no se puede hacer por que nombre es privado del padre
  }

  public String toString(){
    return super.toString() + ". Estoy en el grado de " + this.grado;
  }
}
