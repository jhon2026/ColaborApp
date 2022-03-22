import javax.swing.*;
import java.util.Vector;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaLogin{

  private static boolean logado = false;
  private static ArrayList<Familia> recebedores;
  private static ArrayList<Parceiro> parceiros;
  private static ArrayList<Voluntario> voluntarios;
  private static Administrador administrador;
  private JFrame janela;
  private static LerDados dados = new LerDados();
  private static OrganizacaoFacade organizacao = new OrganizacaoFacade(); 
  public JanelaLogin(){
    atualizarDados();

    janela = new JFrame("Login");
    int altura = 400, largura = 400;
    janela.setSize(largura, altura);
    janela.setLocationRelativeTo(null);
    
    JPanel painel = new JPanel();
    painel.setLayout(null);

    Font fonteTitulo = new Font("SansSerif", Font.BOLD, 24);
		Font fonteTexto = new Font("SansSerif", Font.BOLD, 16);

    JLabel titulo = new JLabel("Login");
    titulo.setFont(fonteTitulo);
    titulo.setBounds(largura / 2 - 50 , 0 , 100, 50);

    JLabel tipo = new JLabel("Tipo de Usuario");
    tipo.setFont(fonteTexto);
    tipo.setBounds(largura / 2 - 150 , 70, 150, 50);
    
    JComboBox usuario = new JComboBox(tiposUsuarios());
    usuario.setBounds(largura / 2 + 20 , 80, 100, 30);
    
    JLabel codigoLabel = new JLabel("Codigo: ");
    codigoLabel.setFont(fonteTexto);
    codigoLabel.setBounds(largura / 2 - 150, 120 , 100, 30);
    
    JTextField codigo = new JTextField();
    codigo.setBounds(largura / 2 + 20, 125, 100, 30);

    JLabel senhaLabel = new JLabel("Senha: ");
    senhaLabel.setFont(fonteTexto);
    senhaLabel.setBounds(largura / 2 - 150, 170, 100, 30);
    
    JPasswordField senha = new JPasswordField();
    senha.setBounds(largura / 2 + 20 , 170, 100, 30);
    
    JLabel mensagem = new JLabel("");
    mensagem.setBounds(largura / 2 - 120 , altura - 150 , 100, 30);

    JButton entrar = new JButton("Logar");
    entrar.setBounds(largura / 2 - 60 , altura - 100 , 100, 30);
    entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Login login = validarDados(usuario.getSelectedIndex(), codigo.getText(), senha.getText());
              if(login.getStatus()){
                redirecionar(login);
                janela.dispose();
              }else{
                mensagem.setText("Login Inválido");
              }
            }
    });
    
    painel.add(titulo);
    painel.add(tipo);
    painel.add(usuario);
    painel.add(codigoLabel);
    painel.add(codigo);
    painel.add(senhaLabel);
    painel.add(senha);
    painel.add(entrar);
    janela.add(painel);
    janela.setVisible(true);
  }

  Login validarDados(int tipo, String codigo, String senha){
    atualizarDados();
    boolean valido = false;
    if(tipo == 0){
      if(administrador.getCPF().equals(codigo) & administrador.getSenha().equals(senha)){
        valido = true;
      }
    }else if(tipo == 1){
      for(Voluntario voluntario : voluntarios){
        if(voluntario.getCPF().equals(codigo) & voluntario.getSenha().equals(senha)){
          valido = true;
        }
      }
    }else if(tipo == 2){
      for(Parceiro parceiro : parceiros){
        if(parceiro instanceof PessoaFisica){
          PessoaFisica parceiroPF = (PessoaFisica) parceiro;
          if(parceiroPF.getCPF().equals(codigo) & parceiroPF.getSenha().equals(senha)){
            valido = true;
          }     
        }else{
          PessoaJuridica parceiroPJ = (PessoaJuridica) parceiro;
          if(parceiroPJ.getCNPJ().equals(codigo) & parceiroPJ.getSenha().equals(senha)){
            valido = true;
          }  
        }
      }
    }else if(tipo == 3){
      for(Familia recebedor : recebedores){
        if(recebedor.getResponsavel().getCPF().equals(codigo) & recebedor.getResponsavel().getSenha().equals(senha)){
          valido = true;
        } 
      }
       
    }

    Login login = new Login();
    
    login.setTipo(tipo);
    login.setStatus(valido);
    
    return login;
  }

  void atualizarDados(){
    this.organizacao = dados.lerDados();
    this.recebedores = organizacao.getRecebedores();
    this.parceiros = organizacao.getParceiros();
    this.voluntarios = organizacao.getVoluntarios();
    this.administrador = organizacao.getAdministrador();
  }

  Vector tiposUsuarios(){
    Vector usuarios = new Vector();
    
    usuarios.add("Administrador");
    usuarios.add("Voluntario");
    usuarios.add("Parceiro");
    usuarios.add("Recebedor");
    
    return usuarios;
  }

  void redirecionar(Login login){
    int tipo = login.getTipo();
    if(tipo == 0){
      new JanelaAdministrador();
    }else if(tipo == 1){
      new JanelaVoluntario();
    }else if(tipo == 2){
      new JanelaParceiro();
    }else if(tipo == 3){
      new JanelaRecebedor();
    }
  }
}