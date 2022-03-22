import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela{

  private static OrganizacaoFacade organizacao = new OrganizacaoFacade();

  public static void main(String[] args){
    LerDados ldados = new LerDados();
    SalvarDados sdados = new SalvarDados();
    if(ldados.existe()){
      organizacao = ldados.lerDados();
    }else{
      sdados.salvarDados(organizacao);
    }

    JFrame janela = new JFrame("ColaborApp");
    int altura = 720, largura = 1200;
    janela.setSize(largura, altura);
    janela.setLocationRelativeTo(null);
    
    JPanel painel = new JPanel();
    painel.setLayout(null);    
    
    Font fonteTitulo = new Font("SansSerif", Font.BOLD, 24);
    Font fonteTexto = new Font("SansSerif", Font.BOLD, 16);

    JLabel titulo = new JLabel("ColaborApp");
    titulo.setBounds(largura / 2 - 100 , 0 , 200, 50);
    titulo.setFont(fonteTitulo);

    JButton login = new JButton("Login");
    login.setBounds(1200 / 2 - 100, 300, 100, 50);
    login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new JanelaLogin();
            }
      });

      JButton sair = new JButton("Sair");
      sair.setBounds(1200 / 2 - 100, altura - 100, 100, 50);
      sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              System.exit(0);  
            }
      });

      
    painel.add(sair);
    painel.add(login);
    painel.add(titulo);
    janela.add(painel);
    janela.setVisible(true);
  } 
  
}