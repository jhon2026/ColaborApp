import java.io.Serializable;
public class Administrador implements Serializable{
  String cpf, senha; 
  
  public Administrador(){
    setCPF("11111111111");
    setSenha("admin");
  }

  void setCPF(String cpf){
    this.cpf = cpf;
  }

  String getCPF(){
    return this.cpf;
  }

  void setSenha(String senha){
    this.senha = senha;
  }

  String getSenha(){
    return this.senha;
  }
  
}