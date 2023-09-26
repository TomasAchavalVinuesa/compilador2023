import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LeerDocumento {

    public static String DocumentoTraido(String direccion){ //el método debe ser static para que se lo pueda llamar sin necesidad de instanciarlo
        String documento= ""; //esta variable va a ser retornada y su contenido será el contenido del documento
        Path inputPath = Paths.get(direccion); //se crea una variable del tipo Path para almacenar la dirección
        InputStream input; //se crea una variable del tipo InputStream para poder leer el documento

        try { //try / catch obligatorio
            input = Files.newInputStream(inputPath, StandardOpenOption.READ); //se le asocia el documento y el modo lectura a la variable input
            int i;
            /* se recorre todo el documento y se van concatenando los caracteres a la variable que se retornará
               el método devuelve los valores en números, por eso se lo debe pasar a CHAR y al terminar el documento devuelve -1 */
            while((i= input.read()) != -1){
                documento = documento + (char)i;
            }
            input.close(); //se cierra el documento
        } catch (IOException e) {
            throw new RuntimeException(e); //aviso de error en caso de que algo salga mal en la lectura del archivo
        }

    return documento; //Retorna un String que debe asociarse a una variable del tipo String o ser impreso en pantalla
    }

}
