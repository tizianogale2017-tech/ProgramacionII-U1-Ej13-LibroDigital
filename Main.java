package Ejercicio13_libroDigital;

public class Main {
    public static void main(String[] args) {
        LibroDigital libro = new LibroDigital("978-987-1234-56-7", "El Aleph", 4.5, 0);
        System.out.println("Libro: " + libro.getTitulo() + " (" + libro.getTamanioMB() + " MB)");

        for (int i = 1; i <= 5; i++) {
            libro.registrarDescarga();
            System.out.println("Descarga #" + i + " registrada.");
        }

        System.out.println("Descargas totales: " + libro.getDescargasTotales());
        System.out.println("Almacenamiento total consumido: " + libro.calcularEspacioConsumido() + " MB");
    }
}
