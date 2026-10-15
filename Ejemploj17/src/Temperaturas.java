public class Temperaturas {
    public static void main(String[] args) {
        double[] temps = {22.5, 24.0, 19.8, 25.3, 21.0};
        double suma = 0;

        System.out.println("--- Temperaturas Registradas ---");
        for (double t : temps) {
            System.out.println("• " + t + " °C");
            suma += t;
        }

        double promedio = suma / temps.length;
        System.out.println("\nPromedio semanal: " + promedio + " °C");
    }
}