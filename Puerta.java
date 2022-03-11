class Puerta{
    private boolean estado;
    private Ventana ventanaPuerta;

    public Puerta(){
        this.estado = false;
        this.ventanaPuerta = new Ventana();
    }
    public boolean getEstado(){
        return this.estado;
    }
    public Ventana getVentanaPuerta(){
        return this.ventanaPuerta;
    }
    public void abrir(){
        this.estado = true;
    }
    public void cerrar(){
        this.estado = false;
    }
    public String toString(){
        String resultado = "Puerta   :   cerrada";
        if (this.estado){
            resultado = "Puerta  :   abierta";
        }
        return resultado + " | " + this.ventanaPuerta;
      }
}
