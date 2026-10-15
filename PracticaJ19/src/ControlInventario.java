import java.util.ArrayList;

public class ControlInventario {
    public static void main(String[] args) {
        ArrayList<Integer> stockProductos = new ArrayList<>();

        stockProductos.add(15);
        stockProductos.add(3);
        stockProductos.add(28);
        stockProductos.add(8);

        System.out.println("--- Reporte de Inventario ---");

        for (int stock : stockProductos) {
            if (stock > 5) {
                System.out.println("Stock: " + stock + " u. -> Disponible");
            } else {
                System.out.println("Stock: " + stock + " u. -> ¡Alerta: Stock bajo!");
            }
        }
    }
}