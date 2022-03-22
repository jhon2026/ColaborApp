import javax.swing.JOptionPane;
import java.io.Serializable;
class Endereco implements Serializable{
  private String estado, cidade, bairro, rua, complemento, numero;

  public Endereco(){
    setEstado(JOptionPane.showInputDialog("Digite o estado: "));
    setCidade(JOptionPane.showInputDialog("Digite a cidade:"));
    setBairro(JOptionPane.showInputDialog("Digite o bairro: "));
    setRua(JOptionPane.showInputDialog("Digite a rua: "));
    setComplemento(JOptionPane.showInputDialog("Digite o complemento: "));
    setNumero(JOptionPane.showInputDialog("Digite o número: "));
  }
  
  public String getEstado(){
    return estado;
  }
  public void setEstado(String estado){
    this.estado=estado;
  }
  public String getCidade(){
    return cidade;
  }
  public void setCidade(String cidade){
    this.cidade=cidade;
  }
  public String getBairro(){
    return bairro;
  }
  public void setBairro(String bairro){
    this.bairro=bairro;
  }
  public String getRua(){
    return rua;
  }
  public void setRua(String rua){
    this.rua=rua;
  }
  public String getComplemento(){
    return complemento;
  }
  public void setComplemento(String complemento){
    this.complemento=complemento;
  }
  public String getNumero(){
    return numero;
  }
  public void setNumero(String numero){
    this.numero=numero;
  }
  public String toString(){
    return "\nEstado: " +this.estado + "\nCidade: " + this.cidade + "\nBairro: " + this.bairro + "\nRua: " + this.rua + "\nComplemento: " + this.complemento + "\nNumero: " + this.numero;
  }
}