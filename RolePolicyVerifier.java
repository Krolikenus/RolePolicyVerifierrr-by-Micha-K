import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RolePolicyVerifier {

    public static boolean sprawdzJSON(File plikWejsciowy) {
        try {
            Scanner skaner = new Scanner(plikWejsciowy);
            StringBuilder trescJSON = new StringBuilder();
            while (skaner.hasNextLine()) {
                trescJSON.append(skaner.nextLine());
            }
            skaner.close();

            String tresc = trescJSON.toString();

            if (tresc.contains("\"Resource\"")) {
                int indexPoczatkowy = tresc.indexOf("\"Resource\"") + "\"Resource\"".length();
                int indexKoncowy = tresc.indexOf('"', indexPoczatkowy + 1);
                String zasoby = tresc.substring(indexPoczatkowy, indexKoncowy).trim();

                return !("*".equals(zasoby) && !zasoby.contains(","));
            } else {
                return false;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Błąd podczas odczytu pliku JSON: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        File plikWejsciowy = new File("C:\\Users\\kroli\\.jdks\\openjdk-22\\bin\\input.json");
        // Ścieżka do pliku JSON
        boolean jestPoprawny = sprawdzJSON(plikWejsciowy);
        System.out.println("Czy dane wejściowe są poprawne? " + jestPoprawny);
    }
}
