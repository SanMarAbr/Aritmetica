package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        // Variables locales
        int a = 10;
        int b = 2;
        miMetodo();
        // Var solo se utiliza para variables locales; Estas no pueden ser utilizadas en
        // otro metodo

        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("Aritmetica1 a: " + aritmetica1.a);
        System.out.println("Aritmetica1 b: " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("Aritmetica2 a : " + aritmetica2.a);
        System.out.println("Aritmetica2 b : " + aritmetica2.b);
    }

    public static void miMetodo() {
        // a = 10; // Esta variable ya no esta al alcance de donde fue definida
        System.out.println("Otro metodo");
    }
}
