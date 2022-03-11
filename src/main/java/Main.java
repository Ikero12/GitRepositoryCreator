import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        MetodosGithub git = new MetodosGithub();

        git.accesoFile("/home/dam1/gitconfig.txt");                 //Conectar a github con archivo de configuración
        //git.accesoToken();   //Conectar a github mediante el Token de acceso

        git.crearRepositorio("Estemen");    //Crea repositorio con el nombre indicado en el parámetro










    }
}
