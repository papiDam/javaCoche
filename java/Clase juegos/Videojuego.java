//Alberto SAnjuan Perez
public class Videojuego extends Juego{
  private String plataforma;

  //Constructores
  public Videojuego(){
    super();
    this.plataforma = "PC";
  }

  public Videojuego(String nombre,double precio,String plataforma){
    super(nombre,precio);
    this.plataforma = plataforma;
  }
  //get
  public String getPlataforma(){
    return this.plataforma;
  }
  //set
  public void setPlataforma(String plataforma){
    this.plataforma = plataforma;
  }
  //metodo descuento
  protected double descuento(){
    double precioFinal;
    if(precio*0.2 > 10){
        precioFinal=this.precio-(precio*0.2);
    }
    else{
       precioFinal=super.descuento();
    }
    return precioFinal;
  }

    public String toString(){
      return super.toString() + "\n-----Plataforma-----\n" + this.plataforma;
    }
  }
