package entidades;

public class Main {
    public static void main(String[] args) {
//        Opcionales:
        Opcionales op1 = new Opcionales(1, 1, 1, 1, 1);
        Opcionales op2 = new Opcionales(1, 0, 0, 0, 0);
        Opcionales op3 = new Opcionales(1, 1, 0, 0, 0);
        Opcionales op4 = new Opcionales(1, 1, 1, 0, 0);
        Opcionales op5 = new Opcionales(1, 1, 1, 1, 0);
        Opcionales op6 = new Opcionales(0, 0, 0, 0, 1);
        Opcionales op7 = new Opcionales(0, 0, 0, 1, 1);
        Opcionales op8 = new Opcionales(0, 1, 1, 1, 1);
        
//        Automoviles
        Automovil auto1 = new Automovil(Variante.SEDAN, op1);
        Automovil auto2 = new Automovil(Variante.SEDAN, op2);
        Automovil auto3 = new Automovil(Variante.SEDAN, op3);
        Automovil auto4 = new Automovil(Variante.FAMILIAR, op4);
        Automovil auto5 = new Automovil(Variante.FAMILIAR, op5);
        Automovil auto6 = new Automovil(Variante.FAMILIAR, op6);
        Automovil auto7 = new Automovil(Variante.COUPE, op7);
        Automovil auto8 = new Automovil(Variante.COUPE, op8);
        Automovil auto9 = new Automovil(Variante.COUPE, op1);
        Automovil auto10 = new Automovil(Variante.SEDAN);
        Automovil auto11 = new Automovil(Variante.FAMILIAR);
        Automovil auto12 = new Automovil(Variante.COUPE);
        Automovil auto13 = new Automovil(Variante.SEDAN, op8);
        
//        Calcular costos
        System.out.println("El costo del auto1 es: " + auto1.calcularCosto());
        System.out.println("El costo del auto2 es: " + auto2.calcularCosto());
        auto3.calcularCosto();
        auto4.calcularCosto();
        auto5.calcularCosto();
        auto6.calcularCosto();
        auto7.calcularCosto();
        auto8.calcularCosto();
        auto9.calcularCosto();
        auto10.calcularCosto();
        System.out.println("El costo del auto11: " + auto11.calcularCosto());
        System.out.println("El costo del auto12: " + auto12.calcularCosto());
        System.out.println("El costo del auto13: " + auto13.calcularCosto());
    }
}
