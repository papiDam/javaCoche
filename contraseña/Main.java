import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Numerica contraseniaNum;
    Letras contraseniaLet;
    String strContrNum;
    String strContrLtr;
    boolean contraseniaValidaNum = false;
    boolean contraseniaValidaLtr = false;

    while (!contraseniaValidaNum){
      System.out.print("Introduce una contrasenia: ");
      strContrNum = sc.nextLine();
      contraseniaNum = new Numerica(strContrNum);
      System.out.print("No repetidos: ");
      System.out.println(contraseniaNum.noRepetidos());
      System.out.print("Tamanio valido: ");
      System.out.println(contraseniaNum.tamaValido());
      System.out.print("Caracteres validos: ");
      System.out.println(contraseniaNum.charValido());
      contraseniaValidaNum = contraseniaNum.contrValida();
    }
    while (!contraseniaValidaLtr){
        System.out.print("Introduce una contrasenia: ");
        strContrLtr = sc.nextLine();
        contraseniaLet = new Letras(strContrLtr);
        System.out.print("No repetidos: ");
        System.out.println(contraseniaLet.noRepetidos());
        System.out.print("Tamanio valido: ");
        System.out.println(contraseniaLet.tamaValido());
        System.out.print("Caracteres validos: ");
        System.out.println(contraseniaLet.charValido());
        contraseniaValidaLtr = contraseniaLet.contrValida();
    }
  }
}