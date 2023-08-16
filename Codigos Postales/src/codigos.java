import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class codigos {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\luisa\\Downloads\\codigos_postales_hmo"));
            String linea;
            HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\t");

                if (palabras.length > 0) {
                    String primeraPalabra = palabras[0];
                    frecuenciaPalabras.put(primeraPalabra, frecuenciaPalabras.getOrDefault(primeraPalabra, 0) + 1);
                }
            }
            br.close();
            // Imprimir la frecuencia de los codigos
            for (String palabra : frecuenciaPalabras.keySet()) {
                int frecuencia = frecuenciaPalabras.get(palabra);
                System.out.println("Codigo Postal: " + palabra + " - Frecuennnnnncia: " + frecuencia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}