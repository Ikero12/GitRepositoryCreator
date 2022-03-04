import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class MetodosGithub {
    GitHub git;
    GHRepository repo;


   public void accesoFile(String Ruta){
       try{
           git = new GitHubBuilder().fromPropertyFile(Ruta).build();

       }catch(IOException e){
           System.out.println("Error accesoFile" + e.getMessage());
       }finally {
           System.out.println("Conectado con éxito.");
       }
   }









    public void accesoToken(String Token){
        try {

            git = new GitHubBuilder().withOAuthToken(Token).build();
            git = GitHub.connect();
        } catch (IOException e) {

        }finally {
            System.out.println("Conectado con éxito");
        }
    }

    public void crearRepositorio(String NombreRepo){
        try {

            repo = git.createRepository(NombreRepo).create();

        } catch (IOException e) {
            System.out.println("Error conexión " + e.getMessage());
        }


    }
}
