package Ejercicio13_libroDigital;

public class LibroDigital {
    private String isbn;
    private String titulo;
    private double tamanioMB;
    private int descargasTotales;

    public LibroDigital(String isbn, String titulo, double tamanioMB, int descargasTotales) {
        this.isbn = isbn;
        this.titulo = titulo;
        setTamanioMB(tamanioMB);
        setDescargasTotales(descargasTotales);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getTamanioMB() {
        return tamanioMB;
    }

    public void setTamanioMB(double tamanioMB) {
        if (tamanioMB < 0) {
            throw new IllegalArgumentException("El tamaño no puede ser negativo.");
        }
        this.tamanioMB = tamanioMB;
    }

    public int getDescargasTotales() {
        return descargasTotales;
    }

    public void setDescargasTotales(int descargasTotales) {
        if (descargasTotales < 0) {
            throw new IllegalArgumentException("Las descargas no pueden ser negativas.");
        }
        this.descargasTotales = descargasTotales;
    }

    public void registrarDescarga() {
        descargasTotales++;
    }

    public double calcularEspacioConsumido() {
        return tamanioMB * descargasTotales;
    }
}
