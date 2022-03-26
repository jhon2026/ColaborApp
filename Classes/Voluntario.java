import javax.swing.JOptionPane;
import java.io.Serializable;
class Voluntario implements Serializable{
 private String nome, cpf, senha;

  public Voluntario(String nome, String cpf, String senha){
    setNome(nome);
    setCPF(cpf);
    setSenha(senha);
  }
  
  public Voluntario(){
    setNome(JOptionPane.showInputDialog("Digite o nome:"));
    setCPF(JOptionPane.showInputDialog("Digite o CPF:"));
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