class Numerica extends Contrasenia{

  public Numerica(String pass){
    super(pass);
  }
  public boolean tamaValido(){
    /*// Solución para establecer estructura.
    return "tamaValido sin implementar";
    */
    /* // Solución para para devolver String y que sea más visual
    String solucion = "Tamanio no valido";
    if ((this.pass).length() >= 4)
      solucion = "Tamanio valido";
    return solucion;
    */
    // Solucion final con boolean
    return (this.pass).length() >= 4;
  }
//  public boolean charValido(){
    /*// Solución para establecer estructura.
    return "charValido sin implementar";
    */
    // Solucion mejorable -> Añadir otro bool para optimizar + isDigit()
  //  char[] numeros = {'0','1','2','3','4','5','6','7','8','9'};
  //  boolean valido = true;
//for (int i = 0 ; i < (this.pass).length() && valido; i++){
  //    valido = false;
  //    for (int j = 0 ; j < numeros.length; j++){
  //      if (numeros[j] == this.pass.charAt(i)) valido = true;
        //System.out.println("numero: " + numeros[j] + " la contrasenia: " + this.pass.charAt(i) + " valido: " + valido);
    //  }
//    }
//    return valido;

  //}
  public boolean charValido(){
    //para cada letra de la contraseña pass(this.pass.charAt(i))
    // comprobamos si es im digito/numero
    // (Character.isDigit)(que queremos comprobar)
    boolean valido = true;
    for (int i = 0 ; i < (this.pass).length() && valido; i++){
      valido = Character.isDigit(this.pass.charAt(i));
        //System.out.println("numero: " + numeros[j] + " la contrasenia: " + this.pass.charAt(i) + " valido: " + valido);
      }
      return valido;
    }

}
