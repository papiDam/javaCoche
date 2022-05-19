public class Alumno extends Persona{
  private enum Nota{
  SOBRESALIENTE,
  NOTABLE,
  BIEN,
  SUFICIENTE,
  INSUFICIENTE;
  }

  // Como traduce Java un ENUM:
  /*
  class Nota{
    public static final Nota SOBRESALIENTE = new Nota();
    public static final Nota NOTABLE = new Nota();
    public static final Nota BIEN = new Nota();
    public static final Nota SUFICIENCIENTE = new Nota();
    public static final Nota INSUFICIENTE = new Nota();
  }
  */
  private String grado;                 // Acceso de la propia clase
          String gradoSinModificador;   // Acceso desde el paquete
  public String gradoPublico;           // Acesso desde hijos y desde el paquete
  private String gradoProtegido;      // Acceso global
  private Nota nota;
  private String resultadoNotas;    // no tiene set ni get


  public Alumno(){
    super();
    this.grado = "DAM";
    this.nota = Nota.SUFICIENTE;
  }

  public Alumno(String nombre, String dni, String grado){
    //Super llama al constructor de la clase superior(de la que extendemos)
    super(nombre, dni);
    this.grado = grado;
    this.nota = Nota.SUFICIENTE;
    //this.nombre = nombre;  //no se puede hacer por que nombre es privado del padre
  }
  public Alumno(Alumno alumno){
    super(alumno.nombre,alumno.dni);
    this.grado = alumno.grado;
    this.nota = alumno.nota;
  }

  private String stringNotas(){
    switch(this.nota){
      case SOBRESALIENTE:
        resultadoNotas = "Oleeeeee! Asi se hase! :)";
        break;
      case NOTABLE:
        resultadoNotas = "Lo has hecho muy bien! :)";
        break;
      case BIEN:
        resultadoNotas = "Bien!";
        break;
      case SUFICIENTE:
        resultadoNotas = "Ta' aprobao por los peloh!";
        break;
      case INSUFICIENTE:
        resultadoNotas = "Eso no ta' bien :(";
        break;
    }
    return resultadoNotas;
  }

  public String toString(){
    return super.toString() + ". Estoy en el grado de " + this.grado +" y el profesor me ha dicho que " + this.stringNotas();
  }
}
