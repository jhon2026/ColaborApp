import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaAdministrador{
  private static LerDados dados = new LerDados();
  private static OrganizacaoFacade fachada = dados.lerDados(); 
  public JanelaAdministrador(){
    JFrame janela = new JFrame(fachada.getNome());
    int altura = 720, largura = 1200, l = 200, t = 50;
    janela.setSize(largura, altura);
    janela.setLocationRelativeTo(null);
    
    JPanel painel = new JPanel();
    painel.setLayout(null);

    Font fonteTitulo = new Font("SansSerif", Font.BOLD, 24);
    Font fonteTexto = new Font("SansSerif", Font.BOLD, 16);

    JButton voluntario = new JButton("Cadastrar Voluntario");
    voluntario.setBounds(1200 / 2 - 500 , altura / 2, l, t);
    voluntario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.cadastrarVoluntario();  
            }
    });

    JButton pendencia = new JButton("Cadastrar Pendência");
    pendencia.setBounds(1200 / 2 - 250, altura / 2, l, t);
    pendencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.cadastrarPendencia();  
            }
    });

    JButton pendencias = new JButton("Visualizar Agenda");
    pendencias.setBounds(1200 / 2, altura / 2, l, t);
    pendencias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.visualizarPendencias();
            }
    });

    JButton doacoes = new JButton("Visualizar Doações");
    doacoes.setBounds(1200 / 2 + 250 , altura / 2, l, t);
    doacoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.visualizarDoacoes();
            }
    });
    /*
    JButton relatorio = new JButton("Gerar Relatório");
    relatorio.setBounds(1200 / 2 + 250 , altura / 2, l, t);
    relatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.gerarRelatorio();
            }
    });
    */
    JLabel titulo = new JLabel("Administrador");
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
    painel.add(voluntario);
    painel.add(pendencia);
    painel.add(pendencias);
    painel.add(doacoes);
    janela.add(painel);
    janela.setVisible(true);
  }
  
  
}