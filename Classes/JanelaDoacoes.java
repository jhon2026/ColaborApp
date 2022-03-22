import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaDoacoes{
public static OrganizacaoFacade organizacao = new OrganizacaoFacade();

  public JanelaDoacoes(){
    atualizarDados();
    JFrame janela = new JFrame("Doações");
    int altura = 720, largura = 1200;
    janela.setSize(largura, altura);
    janela.setLocationRelativeTo(null);
    
    JEditorPane painel = new JEditorPane();
    painel.setEditable(false);
    painel.setContentType("text/html"); 
    painel.setText(mostrar());
     
    Font fonteTitulo = new Font("SansSerif", Font.BOLD, 24);
    Font fonteTexto = new Font("SansSerif", Font.BOLD, 16);

    JLabel titulo = new JLabel("Doações");
    titulo.setBounds(1200 / 2 - 80, 0, 400, 50);
    titulo.setFont(fonteTitulo);

   
    JButton sair = new JButton("Sair");
    sair.setBounds(1200 / 2 - 80, altura - 100, 100, 50);
    sair.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            janela.dispose();  
          }
    });

      
    painel.add(sair);
    painel.add(titulo);
    janela.add(painel);
    janela.setVisible(true);
  }

  String mostrar(){
    atualizarDados();
    String html = "";
    html += "<html>";
    html += "<style> p{font-size: 18pt;} h2{font-size:21;} .doacoes{margin-left: 400px; margin-top: 50px}</style>";
    html += "<body>";

    html += "<div class='doacoes'>";
    html += "<h2>Doações:</h2>";

    if (this.organizacao != null) {
      for(Doacao doacao : organizacao.getDoacoes()){
        html += "<p>" + doacao.getTipo()+ " : " + doacao.getEspecificacao() +"</p>";
      }      
    }

    html += "</div>";
    html += "</body>";
    html += "</html>";
     
    return html;
  }

  void atualizarDados(){
    LerDados dados = new LerDados();
    organizacao = dados.lerDados();
  }
  

}