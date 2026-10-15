public class j18_Calificaciones {
    public static void main(String[] args) {

        // Inicialización directa con calificaciones
        double[] calificaciones = {85.5, 90.0, 78.5, 92.0, 88.0};
        double suma = 0;
        double maxima = calificaciones[0]; // Tomamos la primera como referencia inicial

        System.out.println("--- Lista de Calificaciones ---");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + calificaciones[i]);
            suma += calificaciones[i]; // Acumulamos la suma de las calificaciones

            // Verificamos si encontramos una calificación mayor
            if (calificaciones[i] > maxima) {
                maxima = calificaciones[i];
            }
        }

        double promedio = suma / calificaciones.length;

        System.out.println("\nSuma Total: " + suma);
        System.out.println("Promedio General: " + promedio);
        System.out.println("Calificación más alta: " + maxima);
    }
}