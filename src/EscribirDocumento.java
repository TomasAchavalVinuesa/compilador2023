import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class EscribirDocumento {
    public static void EscribiendoDocumento(ArrayList<AST> arboles, String direccion) { //el método debe ser static para que se lo pueda llamar sin necesidad de instanciarlo

        Path outputPath = Paths.get(direccion); //se crea una variable del tipo Path para almacenar la dirección


        try { //try / catch obligatorio
            Files.newOutputStream(outputPath, StandardOpenOption.CREATE);

            OutputStream outputStream = Files.newOutputStream(outputPath, StandardOpenOption.WRITE);

            int i;
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e); //aviso de error en caso de que algo salga mal en la lectura del archivo
        }
    }
}
