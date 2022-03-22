import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaVoluntario{
  private static LerDados dados = new LerDados();
  private static OrganizacaoFacade fachada = dados.lerDados(); 
  public JanelaVoluntario(){
    JFrame janela = new JFrame(fachada.getNome());
    int altura = 720, largura = 1200, l = 200, t = 50;
    janela.setSize(largura, altura);
    janela.setLocationRelativeTo(null);
    
    JPanel painel = new JPanel();
    painel.setLayout(null);

    Font fonteTitulo = new Font("SansSerif", Font.BOLD, 24);
    Font fonteTexto = new Font("SansSerif", Font.BOLD, 16);

    JButton voluntario = new JButton("Cadastrar Voluntario");
    voluntario.setBounds(1200 / 2 - 500, altura / 2 - 100, l, t);
    voluntario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               fachada.cadastrarVoluntario();
            }
    });

    JButton demanda = new JButton("Cadastrar Demanda");
    demanda.setBounds(1200 / 2 - 250, altura / 2 - 100, l, t);
    demanda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.cadastrarDemanda();  
            }
    });

    JButton pendencia = new JButton("Cadastrar Pendência");
    pendencia.setBounds(1200 / 2 , altura / 2 - 100, l, t);
    pendencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.cadastrarPendencia();  
            }
    });

    JButton recebedor = new JButton("Cadastrar Recebedor");
    recebedor.setBounds(1200 / 2 + 250, altura / 2 - 100, l, t);
    recebedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.cadastrarRecebedor();
            }
    });

    JButton parceiro = new JButton("Cadastrar Parceiro");
    parceiro.setBounds(1200 / 2 - 400, altura / 2 + 50, l, t);
    parceiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.cadastrarParceiro(); 
            }
    });

    JButton demandas = new JButton("Visualizar Demandas");
    demandas.setBounds(1200 / 2 - 100, altura / 2 + 50, l, t);
    demandas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.visualizarDemandas();  
            }
    });

    JButton pendencias = new JButton("Visualizar Agenda");
    pendencias.setBounds(1200 / 2 + 200, altura / 2 + 50, l, t);
    pendencias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              fachada.visualizarPendencias();  
            }
    });

    JLabel titulo = new JLabel("Voluntário");
    titulo.setBounds(1200 / 2 - 100, -20, 500, l);
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
    painel.add(demanda);
    painel.add(pendencia);
    painel.add(recebedor);
    painel.add(parceiro);
    painel.add(demandas);
    painel.add(pendencias);

    janela.add(painel);
    janela.setVisible(true);
  }
  
}