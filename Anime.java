public class Anime {
    // Atributos
    private String nombre;
    private String genero;
    private int episodios;

    // Constructor
    public Anime(String nombre, String genero, int episodios) {
        this.nombre = nombre;
        this.genero = genero;
        this.episodios = episodios;
    }

    // Método para obtener el nombre del anime
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el género del anime
    public String getGenero() {
        return genero;
    }

    // Método para calcular el promedio de episodios por temporada
    public double calcularPromedioEpisodiosPorTemporada(int temporadas) {
        // Try-catch para manejar la posible división por cero
        try {
            return (double) episodios / temporadas;
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero. Se ha ingresado un número inválido de temporadas.");
            return 0;
        } finally {
            System.out.println("Intento de cálculo de promedio de episodios por temporada finalizado.");
        }
    }

    // Método para mostrar la información del anime
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Episodios: " + episodios);
    }
}
