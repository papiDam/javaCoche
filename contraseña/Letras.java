class Letras extends Contrasenia{

  public Letras(String pass){
    super(pass);
  }
  public boolean tamaValido(){
    return (this.pass).length() >= 8;
  }
  public boolean charValido(){
    // Solucion mejorable -> Añadir otro bool para optimizar + isDigit()
    char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    boolean valido = true;
    for (int i = 0 ; i < (this.pass).length() && valido; i++){
      valido = false;
      for (int j = 0 ; j < letras.length; j++){
        if (letras[j] == this.pass.charAt(i)) valido = true;
        //System.out.println("numero: " + numeros[j] + " la contrasenia: " + this.pass.charAt(i) + " valido: " + valido);
      }
    }
    return valido;
  }
}