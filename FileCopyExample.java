import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyExample {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (
            Scanner scanner = new Scanner(inputFile);              // baca dari file
            PrintWriter writer = new PrintWriter(outputFile);      // tulis ke file
        ) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();  // baca baris
                writer.println(line);              // tulis ke output
            }

            System.out.println("File berhasil disalin.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
