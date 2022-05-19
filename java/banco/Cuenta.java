public class Cuenta{
  private String titular;
  private double cantidad;

  public Cuenta(){
    this.titular = "Trenzitas";
    this.cantidad = 2589.52;
  }

  public Cuenta(String titular){
    this.titular = titular;
    this.cantidad = 0;
  }

  public Cuenta(String titular, double cantidad){
    this.titular = titular;
    if (cantidad>0){
      this.cantidad = cantidad;
    }
    else{
      this.cantidad = 0;
    }
  }

  public String getTitular(){
    return this.titular;
  }

  public double getCantidad(){
    return this.cantidad;
  }

  public void setNombre(String titular){
    this.titular = titular;
  }

  public void setCantidad(double cantidad){
    if (cantidad>0){
      this.cantidad = cantidad;
    }
  }

  public void ingresar(double ingreso){
    if (ingreso > 0){
      this.cantidad += ingreso;
    }
  }
  public void retirar(double retirada){
    if (cantidad>0){
      this.cantidad -= retirada;
    }

    if (cantidad<=0){
      this.cantidad = 0;
    }
  }

  public String toString(){
    return "-----titular-----\n"+ this.titular + "\n -----Saldo-----\n"+ this.cantidad;
  }
}
