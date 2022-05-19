public abstract class Contrasenia{
  protected String pass;

  public Contrasenia(String pass){
    this.pass = pass;
  }

  // Set && Get

  public boolean noRepetidos(){
    //return "Codigo sin implementar: No se reptien";
    boolean valido = true;
    int contador = 1;
    char actual = this.pass.charAt(0), anterior;
    for (int i = 1 ; i < (this.pass).length() && valido; i++){
      anterior = actual; // QUEDA DESFASADO EL VALOR ACTUAL
      actual = this.pass.charAt(i); // ACTUALIZAMOS EL VALOR ACTUAL
      if (anterior == actual) contador++;
      else contador = 1;
      if (contador >= 3) valido = false;
    }
    return valido;
  }
  public abstract boolean tamaValido();
  public abstract boolean charValido();
  public boolean contrValida(){
    return this.tamaValido() && this.charValido() && this.noRepetidos();
  }

  public String toString(){
    return "La contrasenia es " + this.pass + ".";
  }
}
