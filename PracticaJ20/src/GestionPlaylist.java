import java.util.ArrayList;

public class GestionPlaylist {
    public static void main(String[] args) {

        ArrayList<String> playlist = new ArrayList<>();

        System.out.println("=== 1. MÉTODO .add() ===");
        playlist.add("Blinding Lights");
        playlist.add("Starboy");
        playlist.add("Save Your Tears");
        playlist.add(1, "The Hills");

        System.out.println("Playlist actual: " + playlist);

        System.out.println("\n=== 2. MÉTODO .get() ===");
        String primera = playlist.get(0);
        String segunda = playlist.get(1);

        System.out.println("Reproduciendo ahora (Posición 0): " + primera);
        System.out.println("Siguiente en la fila (Posición 1): " + segunda);


        System.out.println("\n=== 3. MÉTODO .set() ===");
        playlist.set(2, "Can't Feel My Face");

        System.out.println("Playlist tras actualizar la posición 2: " + playlist);


        System.out.println("\n=== 4. MÉTODO .remove() ===");

        playlist.remove(0);
        System.out.println("Después de quitar la primera canción: " + playlist);

        playlist.remove("Save Your Tears");
        System.out.println("Después de eliminar 'Save Your Tears': " + playlist);


        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Total de canciones restantes (.size()): " + playlist.size());
        System.out.println("Playlist final: " + playlist);
    }
}