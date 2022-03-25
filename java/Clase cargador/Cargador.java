//Alberto Sanjuan Perez

//creacion de clase cargador
public class Cargador{
  private Cable cable;
  private Adaptador adaptador;

  //creacion de los constructores
  public Cargador(){
    this.cable = new Cable();
    this.adaptador = new Adaptador();
    }

  //creaqcion de los get
  public Cable getCable(){
    return this.cable;
  }

  public Adaptador getAdaptador(){
    return this.adaptador;
  }



}
