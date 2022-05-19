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

    /*ArrayList<Integer> lista = new ArrayList();
    lista.add(4);
    lista.add(5);
    System.out.println(lista);

    ArrayList<Alumno> listaAlumnos = new ArrayList();
    listaAlumnos.add(miAlumno);
    listaAlumnos.add(alumnoDefecto);
    System.out.println(listaAlumnos);
    System.out.println(listaAlumnos.get(0).getNombre());
    */
    //----------------------------------------------------
    Color miColor, miSegundoColor;
    Color arrColores[] = Color.values();
    for(Color c : arrColores){
      System.out.println(c);
    }
    System.out.println("Asignando color: ");
    miColor = Color.ROJO;
    System.out.println(miColor);
    System.out.println("Asignando color con Color.valueOf(\"COLOR\"): ");
    miColor = Color.valueOf("VERDE");
    System.out.println(miColor);

    System.out.println(Color.VERDE.getNumLapices());
    System.out.println(miColor.getNumLapices());

    //Ahora con error
    //System.out.println("Asignando color: ");
    //miColor = Color.NEGRO;
    //System.out.println(miColor);
    //System.out.println("Asignando color con Color.valueOf(\"COLOR\"): ");
    //miColor = Color.valueOf("NEGRO");
    //System.out.println(miColor);
    System.out.println("CUANTOS LAPICES AZULES TENGO SI -2, ME TIENDE QUE DECIR QUE TENGO 0");
    miSegundoColor = Color.valueOf("AZUL");
    miSegundoColor.setNumLapices(-2);
    System.out.println("lapices azules para mi segundo color");
    System.out.println(miSegundoColor.getNumLapices());
    System.out.println("lapices azules para mi color");
    miColor = Color.valueOf("AZUL");
    System.out.println(miColor.getNumLapices());
    System.out.println("el ordinal de mi segundo color AZUL: ");
    System.out.println(miSegundoColor.ordinal());

    miSegundoColor.setNumLapices(2);
    System.out.println("lapices azules para mi segundo color");
    System.out.println(miSegundoColor.getNumLapices());
    System.out.println("lapices azules para mi color");
    System.out.println(miColor.getNumLapices());

    System.out.println("el ordinal de mi segundo color AZUL: ");
    System.out.println(miSegundoColor.ordinal());
    System.out.println("el ordinal de mi color VERDE: ");
    System.out.println(miColor.ordinal());




  }
}
