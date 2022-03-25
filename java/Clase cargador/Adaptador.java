// Alberto Sanjuan Perez

//Creacion de clase Adaptador
public class Adaptador{
  private int potSalida;
  private int potEntrada;
  private int puertos;

  //creacion de los constructores
  public Adaptador(){
    this.potSalida = 2;
    this.potEntrada = 18;
    this.puertos = 2;
    }

  public Adaptador(int potSalida, int potEntrada, int puertos){
    this.potSalida = potSalida;
    this.potEntrada = potEntrada;
    this.puertos = puertos;
    }

  //creaqcion de los get
  public int getPotSalida(){
    return this.potSalida;
  }

  public int getPotEntrada(){
    return this.potEntrada;
  }

  public int getPuertos(){
    return this.puertos;
  }


// creacion de los set

  public void setPotSalida(){
    this.potSalida = potSalida ;
  }

  public void setPotEntrada(){
    this.potEntrada = potEntrada;
  }

  public void setPuertos(){
    this.puertos = puertos;
  }

  public String toString(){
    return "Potencia de salida: " + this.potSalida + "\n" + "Potencia de entrada : " + this.potEntrada + "\n" + "Numeros de puertos : " + this.puertos;
  }
}
