public class Numerica extends Contrasenia{

  char numeros[] = {'0','1','2','3','4','5','6','7','8','9'};

  public Numerica(String pass){
    super(pass);
  }

  public boolean tamanioValido(){
    return (this.pass).length() >= 4;
  }
  public boolean caracterValido(){
    boolean valido = true;
    for (int i = 0; i < (this.pass).length()&& valido; i++){
      valido = false;
      for(int j = 0; j < numeros.length; j++){
        if (numeros[j] == this.pass.charAt(i)) valido = true;
      }
    }
    return valido;
  }
  public boolean noCaracterRep(){
    char actual;
    char anterior = this.pass.charAt(0);
    int contador = 1;
    boolean valido = true;
    for(int i = 1; i < (this.pass).length() && valido; i++){
      actual = this.pass.charAt(i);
      anterior = this.pass.charAt(i-1);
      if(actual==anterior) contador++;
      else contador = 1;
      if(contador >= 3) valido = false;
    }
    return valido;
  }
  public String toString(){
    return "La contraseña es " + this.pass + ".";
  }
}
