import java.util.ArrayList;

class Main {
  public static void main(String[] args){
    Persona miPersona = new Persona();
    Alumno alumnoDefecto = new Alumno();
    Profesor miProfesor = new Profesor();
    Alumno miAlumno = new Alumno("Marivi","89765465A","ASD");
    //System.out.print(miPersona);
    System.out.println(miAlumno);
    System.out.println(miProfesor);

    ArrayList<Integer> lista = new ArrayList();
    lista.add(4);
    lista.add(5);
    System.out.println(lista);

    ArrayList<Alumno> listaAlumnos = new ArrayList();
    listaAlumnos.add(miAlumno);
    listaAlumnos.add(alumnoDefecto);
    System.out.println(listaAlumnos);
    System.out.println(listaAlumnos.get(0).getNombre());

    
  }
}
