import javax.swing.JOptionPane;
import java.io.Serializable;
class Pendencia implements Serializable{
  private String tipoPendencia, descricao, status;

  public Pendencia(){
    String[] tipoPendencias = new String [] {"Cadastro", "Visita"};
    int selectedValue = JOptionPane.showOptionDialog(null, "Escolha o tipo", "Tipo",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, tipoPendencias, tipoPendencias[0]);
    setTipoPendencia(tipoPendencias[selectedValue]);
    setDescricao(JOptionPane.showInputDialog("Digite uma descrição: "));
    setStatus(JOptionPane.showInputDialog("Status: "));
  }

  public void setTipoPendencia(String tipoPendencia){
    this.tipoPendencia = tipoPendencia;
  }
  public String getTipoPendencia(){
    return this.tipoPendencia;
  }
  public void setDescricao(String descricao){
    this.descricao = descricao;
  }
  public String getDescricao(){
    return this.descricao;
  }
  public void setStatus(String status){
    this.status = status;
  }
  public String getStatus(){
    return this.status;
  }

  public void concluir(){
    
  }
}