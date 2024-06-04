import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de la clase Anime
        Anime miAnime = new Anime("Attack on Titan", "Acción", 75);

        // Mostrar la información del anime
        miAnime.mostrarInfo();

        // Solicitar el número de temporadas al usuario
        System.out.print("Ingrese el número de temporadas: ");
        int temporadas = scanner.nextInt();

        // Calcular y mostrar el promedio de episodios por temporada
        double promedioEpisodios = miAnime.calcularPromedioEpisodiosPorTemporada(temporadas);
        if (promedioEpisodios > 0) {
            System.out.println("Promedio de episodios por temporada: " + promedioEpisodios);
        }

        scanner.close();
    }
}
