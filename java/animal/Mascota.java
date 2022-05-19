public class Mascota{
  public String nombre;
  public int nivelAmistad;

  //constructores
  public Mascota(){
    this.nombre = "Arturo";
    this.nivelAmistad = 0;
  }

  public Mascota(String nombre){
    this.nombre = nombre;
    nivelAmistad = 0;
  }

  //getters y setters

  public String getNombre(){
    return this.nombre;
  }

  public int getNivel(){
    return this.nivelAmistad;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  // el set de nivel no lo hago por que no se puede cambiar solo aumenta cuando se acariacia la mascota

  public int  acariciar(){
    return nivelAmistad ++;
  }
  public String limpiarCaca(int numero){
    if(numero >= 3){
      numero = 0;
      return "Vamos a limpiar esa caquita";
    }
    else{
      return "Todavia podemos esperar un pco mas";
    }
  }

}
