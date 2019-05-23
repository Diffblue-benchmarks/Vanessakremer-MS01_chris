package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        /*
         * This is the preferred way to access resource files (this is the "Musterlösung" of ms0).
         * All resource files for non-test classes should be located in the directory src/main/resources.
         * They can then be accessed calling getResource or getResourceAsStream on the current class.
         *
         * Accessing resource files like this is machine-independent. Thanks to Gradle everyone who imported
         * the project as a Gradle project can access all files like this and even if you run the Gradle task
         * "jar" to create a Jar-file, you will be able to access the files using getResourceAsStream if you
         * run the Jar-file.
         *
         * Please note that calling getResource("file.txt") from within the main package will access the
         * file "main/file.txt". Absolute paths start with a slash, for example getResource("/main/file.txt") will
         * access the same file. More information in the "Git-Anleitung".
         */
        InputStream input = Main.class.getResourceAsStream("file.txt");

        // Read the InputStream in UTF-8 and use a BufferedReader to read lines
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8))) {
            String line;
            // Read new lines until readLine() returns null
            while ((line = reader.readLine()) != null) {
                // Print all lines
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
