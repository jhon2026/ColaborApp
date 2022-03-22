import javax.swing.JOptionPane;
import java.io.Serializable;
class Contato implements Serializable{
  private String telefone, email, celular;

  public Contato(){
    setTelefone(JOptionPane.showInputDialog("Digite o telefone: "));
    setEmail(JOptionPane.showInputDialog("Digite o email: "));
    setCelular(JOptionPane.showInputDialog("Digite o celular: "));
  }

  
  public String getTelefone(){
    return telefone;
  }
  public void setTelefone(String telefone){
    this.telefone=telefone;
  }
  public String getEmail(){
    return email;
  }
  public void setEmail(String email){
    this.email=email;
  }
  public String getCelular(){
    return celular;
  }
  public void setCelular(String celular){
    this.celular=celular;
  }
  public String toString(){
  return "\nTelefone: " + this.telefone + "\nEmail: " +  this.email + "\nCelular: " +  this.celular;
  }

}
