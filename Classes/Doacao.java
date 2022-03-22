import javax.swing.JOptionPane;
import java.io.Serializable;
class Doacao implements Serializable{
  private int codigo;
  private String tipo;
  private String especificacao;

  public Doacao(){
    setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código:")));
    setTipo(JOptionPane.showInputDialog("Digite o tipo: "));
    setEspecificacao(JOptionPane.showInputDialog("Digite a especificação: "));
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

  void setEspecificacao(String especificacao){
    this.especificacao = especificacao;
  }

  String getEspecificacao(){
    return this.especificacao; 
  }
}