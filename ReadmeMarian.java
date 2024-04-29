import java.io.FileWriter;
import java.io.IOException;

public class ReadmeMarian {
    public static void main(String[] args) {
        String moduleName = "Módulo Programación";
        String content = "Cuestiones referentes a Java";
        String course = "Curso 2023/24";
        String school = "IES Francisco Javier de Burgos";

        String readmeContent = "# " + moduleName + "\n\n"
                + "## Contenido\n\n"
                + content + "\n\n"
                + "## Curso\n\n"
                + course + "\n\n"
                + "## Centro educativo\n\n"
                + school + "\n\n"
                + "---\n\n"
                + "*Este README fue generado automáticamente.*";

        // Nombre del archivo README.md
        String fileName = "README.md";

        try {
            // Crear un FileWriter para escribir en el archivo
            FileWriter writer = new FileWriter(fileName);

            // Escribir el contenido en el archivo
            writer.write(readmeContent);

            // Cerrar el FileWriter
            writer.close();

            System.out.println("El archivo " + fileName + " ha sido generado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + fileName);
            e.printStackTrace();
        }
    }
}
