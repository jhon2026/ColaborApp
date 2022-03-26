import javax.swing.JOptionPane;
import java.io.Serializable;
class PessoaJuridica extends Parceiro implements Serializable{
  private String cnpj, razaoSocial, senha;

  public PessoaJuridica(String cnpj, String razaoSocial, String senha){
    setCNPJ(cnpj);
    setRazaoSocial(razaoSocial);
    setSenha(senha);
  }
  
  public PessoaJuridica(){
    setCNPJ(JOptionPane.showInputDialog("Digite o CNPJ: "));
    setRazaoSocial(JOptionPane.showInputDialog("Digite a razão social: "));
    setSenha(JOptionPane.showInputDialog("Digite sua senha:"));
  }
  
  public void setCNPJ(String cnpj){
    this.cnpj = cnpj;
  }
  public String getCNPJ(){
    return this.cnpj;
  }

  public void setRazaoSocial(String razaoSocial){
    this.razaoSocial = razaoSocial;
  }
  public String getRazaoSocial(){
    return this.razaoSocial;
  }
  public void setSenha(String senha){
    this.senha = senha;
  }
  public String getSenha(){
    return this.senha;
  }
}