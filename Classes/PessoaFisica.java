import javax.swing.JOptionPane;
import java.io.Serializable;
class PessoaFisica extends Parceiro implements Serializable{
  private String nome, cpf, senha;

  public PessoaFisica(){
    setNome(JOptionPane.showInputDialog("Digite o nome: "));
    setCPF(JOptionPane.showInputDialog("Digite o CPF: "));
    setSenha(JOptionPane.showInputDialog("Digite sua senha:"));
  }
  
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }
  public void setCPF(String cpf){
    this.cpf = cpf;
  }
  public String getCPF(){
    return this.cpf;
  }
  public void setSenha(String senha){
    this.senha = senha;
  }
  public String getSenha(){
    return this.senha;
  }
}