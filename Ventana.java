class Ventana{
    private boolean estado;

    public Ventana(){
        this.estado = false;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public void abrir(){
        this.estado = true;
    }
    public void cerrar(){
        this.estado = false;
    }
    public String toString(){
        String resultado = "Ventana   :   cerrada";
        if (this.encendido==true){
            resultado = "Ventana  :   abierta"
        }
        return resultado;

}