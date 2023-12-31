package Operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;

    // Constructor vacio
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
        
    }

    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con arg");
    }

    // Metodo
    public void sumar() { 
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        // int resultado = a + b;
        // return resultado;
        return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a; // El argumento a se asigna al atributo this.a
        this.b = b;
        // return a + b;
        return this.sumarConRetorno();
        // This solo se utiliza en la clase donde se trabaja
        // this son los atributos de la clase
        // Metodo de la clase

    }
}