import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private String color;
    private int kilometraje;

    public Carro(String marca, String modelo, String color, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public String toString() {
        return marca + " " + modelo + " (" + color + ") - " + kilometraje + " km";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de carros a registrar: ");
        int cantidad = sc.nextInt();

        Carro[] carros = new Carro[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Carro #" + (i+1));
            System.out.print("Marca: ");
            String marca = sc.next();
            System.out.print("Modelo: ");
            String modelo = sc.next();
            System.out.print("Color: ");
            String color = sc.next();
            System.out.print("Kilometraje: ");
            int kilometraje = sc.nextInt();

            carros[i] = new Carro(marca, modelo, color, kilometraje);
        }

        System.out.println("Carros sin ordenar:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        // Ordenamiento bubble sort por modelo
        for (int i = 0; i < carros.length - 1; i++) {
            for (int j = 0; j < carros.length - i - 1; j++) {
                if (carros[j].getModelo().compareTo(carros[j+1].getModelo()) > 0) {
                    Carro temp = carros[j];
                    carros[j] = carros[j+1];
                    carros[j+1] = temp;
                }
            }
        }

        System.out.println("Carros ordenados por modelo:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        // Ordenamiento bubble sort por kilometraje
        for (int i = 0; i < carros.length - 1; i++) {
            for (int j = 0; j < carros.length - i - 1; j++) {
                if (carros[j].getKilometraje() > carros[j+1].getKilometraje()) {
                    Carro temp = carros[j];
                    carros[j] = carros[j+1];
                    carros[j+1] = temp;
                }
            }
        }

        System.out.println("Carros ordenados por kilometraje:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
}