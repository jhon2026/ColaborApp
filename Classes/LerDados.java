import java.io.File;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class LerDados{

	private static File arquivo = new File("dados/organizacao.dat");
	
	static OrganizacaoFacade lerDados(){
		OrganizacaoFacade organizacao = new OrganizacaoFacade();
		if (existe()) {
			try(ObjectInputStream leitor = new ObjectInputStream(new FileInputStream(arquivo))){
				organizacao = (OrganizacaoFacade) leitor.readObject();
				leitor.close();
			}
			catch(Exception exception){
				System.out.println("Erro: " + exception);
			}finally{
				
			}
		}

		return organizacao;

	}

	static boolean existe(){
		return arquivo.exists();
	}
}