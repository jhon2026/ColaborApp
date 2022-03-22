import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaRecebedor{
  private static LerDados dados = new LerDados();
  private static OrganizacaoFacade fachada = dados.lerDados(); 
  public JanelaRecebedor(){
    JFrame janela = new JFrame(fachada.getNome());
    int altura = 720, largura = 1200, l = 200, t = 50;
    janela.setSize(largura, altura);
    janela.setLocationRelativeTo(null);
    
    JPanel painel = new JPanel();
    painel.setLayout(null);

    Font fonteTitulo = new Font("SansSerif", Font.BOLD, 24);
    Font fonteTexto = new Font("SansSerif", Font.BOLD, 16);

    JButton demanda = new JButton("Cadastrar Demanda");
    demanda.setBounds(1200 / 2 - 150, altura / 2, l, t);
    demanda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.cadastrarDemanda();  
            }
    });

    JLabel titulo = new JLabel("Recebedor");
    titulo.setBounds(1200 / 2 - 100, 0, 400, 50);
    titulo.setFont(fonteTitulo);

    JButton sair = new JButton("Sair");
    sair.setBounds(1200 / 2 - 100, altura - 100, 100, 50);
    sair.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            janela.dispose();  
          }
    });

    painel.add(titulo);
    painel.add(sair);
    painel.add(demanda);

    janela.add(painel);
    janela.setVisible(true);
  }
  
}