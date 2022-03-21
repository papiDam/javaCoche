//Alberto Sanjuan Perez

// creacion de la clase cable
public class Cable{
  private int longitud;
  private String entrada;
  private String salida;
  private boolean datos;
  private boolean carga;


//creacion de constructores

  public Cable(){
    this.longitud = 2;
    this.entrada = "USB";
    this.salida = "Tipo C";
    this.datos = true;
    this.carga = true;
    }

  public Cable(int longitud, String entrada, String salida, boolean datos, boolean carga){
    this.longitud = longitud;
    this.entrada = entrada;
    this.salida = salida;
    this.datos = datos;
    this.carga = carga;
    }

  //creaqcion de los get
  public int getLongitud(){
    return this.longitud;
  }

  public String getEntrada(){
    return this.entrada;
  }

  public String getSalida(){
    return this.salida;
  }

  public Boolean getDatos(){
    return this.datos;
  }

  public Boolean getCarga(){
    return this.carga;
  }

// creacion de los set

  public void setLongitud(){
    this.longitud = longitud;
  }

  public void setEntrada(){
    this.entrada = entrada;
  }

  public void setSalida(){
    this.salida = salida;
  }

  public void setDatos(){
    this.datos = datos;
  }

  public void setCarga(){
    this.carga = carga;
  }

  public String toString(){
    return "longitud : " + this.longitud + "\n" + " Entrada : " + this.entrada + "\n" + "Salida : " + this.salida + "\n" + "Datos : " + this.datos + "\n" + "Carga : " + this.carga;
  }
}  
