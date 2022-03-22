import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class SalvarDados{

	void salvarDados(OrganizacaoFacade fachada){
		
		try{
			File arquivo = new File("dados/organizacao.dat");
			ObjectOutputStream gravador = new ObjectOutputStream(new FileOutputStream(arquivo));
			gravador.writeObject(fachada);
			gravador.close();

		}
		catch(Exception exception){
			System.out.println("Erro: " + exception);
		}

	}
}