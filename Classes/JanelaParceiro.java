import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaParceiro{
  private static LerDados dados = new LerDados();
  private static OrganizacaoFacade fachada = dados.lerDados(); 
  public JanelaParceiro(){
    JFrame janela = new JFrame(fachada.getNome());
    int altura = 720, largura = 1200, l = 200, t = 50;
    janela.setSize(largura, altura);
    janela.setLocationRelativeTo(null);
    
    JPanel painel = new JPanel();
    painel.setLayout(null);

    Font fonteTitulo = new Font("SansSerif", Font.BOLD, 24);
    Font fonteTexto = new Font("SansSerif", Font.BOLD, 16);

    JButton doacao = new JButton("Cadastrar Doação");
    doacao.setBounds(1200 / 2 - 300 , altura / 2, l, t);
    doacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.cadastrarDoacao();  
            }
    });

    JButton demandas = new JButton("Visualizar Demandas");
    demandas.setBounds(1200 / 2 + 100 , altura / 2, l, t);
    demandas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.visualizarDemandas();   
            }
    });

    JLabel titulo = new JLabel("Parceiro");
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
    painel.add(doacao);
    painel.add(demandas);
    janela.add(painel);
    janela.setVisible(true);
  }
  
}