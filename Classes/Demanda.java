import javax.swing.JOptionPane;
import java.io.Serializable;
class Demanda implements Serializable{
  private int codigo;
  private String tipo;
  private String descricao;
  private String situacao;


  public Demanda(){
    //setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: ")));
    String[] demandas = new String[] {"Ajuda Financeira", "Outros"};

    int selectedValue1 = JOptionPane.showOptionDialog(null, "Escolha um item", "Opçao",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, demandas, demandas[0]);


    setTipo(demandas[selectedValue1]);

    setDescricao(JOptionPane.showInputDialog("Digite uma descrição: "));
    
    String[] situacoes = new String[] {"Atendida", "Em espera"};
    
    int selectedValue2 = JOptionPane.showOptionDialog(null, "Escolha um item", "Opçao",
              JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE , null,
                  situacoes, situacoes [0]);
    
    setSituacao(situacoes[selectedValue2]);
  }
    
  void setCodigo(int codigo){
    this.codigo = codigo;
  }

  int getCodigo(){
    return this.codigo;
  }
  
  void setTipo(String tipo){
    this.tipo = tipo;
  }

  String getTipo(){
    return this.tipo;
  }

  void setDescricao(String descricao){
    this.descricao = descricao;
  }

  String getDescricao(){
    return this.descricao;
  }

  void setSituacao(String situacao){
    this.situacao = situacao;
  }

  String getSituacao(){
    return this.situacao;
  }

  public void alterarSituacao(){}
}