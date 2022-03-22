import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.Serializable;

class OrganizacaoFacade implements Serializable{
  private String nome, cnpj;
  private Administrador administrador = new Administrador();
  private Agenda agenda = new Agenda();
  private Endereco endereco;
  private Contato contato;
  private ArrayList<Parceiro> parceiros = new ArrayList<Parceiro>();
  private ArrayList<Voluntario> voluntarios = new ArrayList<Voluntario>();
  private ArrayList<Familia> recebedores = new ArrayList<Familia>();
  private ArrayList<Doacao> doacoes = new ArrayList<Doacao>();
  
  public OrganizacaoFacade(){}

  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }
  public void setCNPJ(String cnpj){
    this.cnpj = cnpj;
  }
  public String getCNPJ(){
    return this.cnpj;
  }

  public Agenda getAgenda(){
    return this.agenda;
  }

  public ArrayList<Parceiro> getParceiros(){
    return this.parceiros;
  }

  public ArrayList<Voluntario> getVoluntarios(){
    return this.voluntarios;
  }

  public ArrayList<Familia> getRecebedores(){
    return this.recebedores;
  }

  public Administrador getAdministrador(){
    return this.administrador;
  }

  public ArrayList<Doacao> getDoacoes(){
    return this.doacoes;
  }

  public void cadastrarRecebedor(){
    Familia recebedor = new Familia(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de membros :")));
    recebedor.definirResponsavel();
    recebedores.add(recebedor);
    atualizarDados();
  }

  public void cadastrarPendencia(){
    Pendencia pendencia = new Pendencia();
    agenda.cadastrarPendencia(pendencia);
    atualizarDados();
  }

  public void cadastrarDemanda(){
    String codigo = (JOptionPane.showInputDialog("Digite o cpf do responsável familiar: "));
    Recebedor recebedorDemanda = new Recebedor();
    for(Familia recebedor : this.recebedores){
      if(recebedor.getResponsavel().getCPF().equals(codigo)){
        recebedorDemanda = (Familia) recebedor;
      }
    }
    
    Demanda demanda = new Demanda();
    recebedorDemanda.adicionarDemanda(demanda); 
    atualizarDados();
  }

  void atenderDemanda(Recebedor recebedor, int codigo){
   for(Demanda demanda : recebedor.getDemandas()){
     if(demanda.getCodigo() == codigo){
       demanda.setSituacao("Atendida");
     }
   }
   atualizarDados();
  }

  void cadastrarDoacao(){
    Doacao doacao = new Doacao();
    doacoes.add(doacao);
    atualizarDados();
  }

  public void cadastrarParceiro(){
    Parceiro parceiro;

    String[] tipo = new String[] {"Pessoa Fisica", "Pessoa Juridica"};
    int selectedValueTipo = JOptionPane.showOptionDialog(null, "Escolha o tipo", "Opçao",
              JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                  tipo, tipo [0]);
    
    if(selectedValueTipo == 0){
      parceiro = new PessoaFisica();
    }
    else{
      parceiro = new PessoaJuridica();
    }
    parceiros.add(parceiro);
    atualizarDados();
  }

  public void cadastrarVoluntario(){
    Voluntario voluntario = new Voluntario();
    voluntarios.add(voluntario);
    atualizarDados();
  }

  public void visualizarDemandas(){
    new JanelaDemandas();
  }

  public void visualizarDoacoes(){
    new JanelaDoacoes();
  }

  public void visualizarPendencias(){
    new JanelaAgenda();
  }

  public void gerarRelatorio(){
    //something
  }

  public void atualizarDados(){
    SalvarDados dados = new SalvarDados();
    dados.salvarDados(this);
  }
}