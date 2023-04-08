import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesInOut {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String formattedName = formatName(parts[0]);
                String formattedDate = formatDate(parts[1]);
                writer.write(formattedName + " " + formattedDate);
                writer.newLine();
            }
            System.out.println("The file has been formatted!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    private static String formatName(String name) {
        StringBuilder formattedName = new StringBuilder();
        for (String word : name.split(" ")) {
            if (!word.isEmpty()) {
                formattedName.append(Character.toUpperCase(word.charAt(0)));
                formattedName.append(word.substring(1).toLowerCase().replaceAll("\\d", ""));
                formattedName.append(" ");
            }
        }
        return formattedName.toString().trim();
    }
    
    private static String formatDate(String date) {
        String month = date.substring(0, 2);
        String day = date.substring(2, 4);
        String year = date.substring(4);
        return month + "/" + day + "/" + year;
    }
}