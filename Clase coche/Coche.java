class Coche{
  private Motor motorCoche;
  private Puerta puertaI;
  private Puerta puertaD;


  public Coche(){
    this.motorCoche = new Motor();
    this.puertaD = new Puerta();
    this.puertaI = new Puerta();
    }

    public Puerta getPuertaI(){
      return this.puertaI;
    }

    public Puerta getPuertaD(){
      return this.puertaD;
    }

    public Motor getMotor(){
      return this.motorCoche;
    }

    public void abrirVentanaDer(){
      this.puertaD.getVentanaPuerta().abrir();
    }

    public String toString(){
      return this.motorCoche + "\n" + this.puertaD + "\n" + this.puertaI;
    }
}
