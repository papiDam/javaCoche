class Main{
    public static void main(String[] args){

      Cuenta miCuenta = new Cuenta();
      Cuenta miCuenta2 = new Cuenta("Alberto");
      Cuenta miCuenta3 = new Cuenta("Enanno",2569.26);

      System.out.println(miCuenta);

      System.out.println(miCuenta2);

      System.out.println(miCuenta3);

      miCuenta.ingresar(152.65);

      miCuenta2.ingresar(152.65);

      miCuenta3.ingresar(152.65);

      System.out.println(miCuenta);

      System.out.println(miCuenta2);

      System.out.println(miCuenta3);

      miCuenta.retirar(1522.65);

      miCuenta2.retirar(1522.65);

      miCuenta3.retirar(1522.65);

      System.out.println(miCuenta);

      System.out.println(miCuenta2);

      System.out.println(miCuenta3);
  }
}
