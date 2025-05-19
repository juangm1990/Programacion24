package PrimerTrimestre.Clases.Unidireccional;

public class Banco {
    public static void main(String[] args) throws Exception {

        CuentaBancaria c1 = new CuentaBancaria("1111 1111 1111 1111", "Javi");
        CuentaBancaria c2 = new CuentaBancaria("2222 2222 2222 2222", "Dani");
        CuentaBancaria c3 = new CuentaBancaria("3333 3333 3333 3333", "paco", 500);
        CuentaBancaria c4 = new CuentaBancaria();
        CuentaBancaria c5 = new CuentaBancaria(c4);

        c3.sacar(200);
        c3.ingresar(4.5);

        c3.transferir(50, c4);
     
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
