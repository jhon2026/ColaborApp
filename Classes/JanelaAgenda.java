import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaAgenda{
  
  public static OrganizacaoFacade organizacao = new OrganizacaoFacade();

  public JanelaAgenda(){
    atualizarDados();
    JFrame janela = new JFrame("Agenda");
    int altura = 720, largura = 1200;
    janela.setSize(largura, altura);
    janela.setLocationRelativeTo(null);
    
    JEditorPane painel = new JEditorPane();
    painel.setEditable(false);
    painel.setContentType("text/html"); 
    painel.setText(mostrar());
     
    Font fonteTitulo = new Font("SansSerif", Font.BOLD, 24);
    Font fonteTexto = new Font("SansSerif", Font.BOLD, 16);

    JLabel titulo = new JLabel("Agenda");
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
    
    String html = "";
    html += "<html>";
    html += "<style> p{font-size: 18pt;} h2{font-size:21;} .agenda{margin-left: 400px; margin-top: 50px}</style>";
    html += "<body>";

    html += "<div class='agenda'>";
    html += "<h2>Pendências:</h2>";

    if (this.organizacao != null) {
      for (Pendencia pendencia : this.organizacao.getAgenda().getPendencias()) {
        html += "<p><b>" + pendencia.getTipoPendencia() + "</b>" + " : " + pendencia.getStatus() +"</p>";
        html += "<p><u>" + pendencia.getDescricao() + "</u></p>";
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