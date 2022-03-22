import javax.swing.JOptionPane;
import java.io.Serializable;
class Pessoa implements Serializable{
  private String nome, cpf, dataNascimento, sexo, escolaridade, estadoCivil, deficiencia, autoDeclaracao, senha;
  private boolean empregado;
  private double salario;


  public Pessoa(){
      setNome(JOptionPane.showInputDialog("Digite seu nome:"));
      setCPF(JOptionPane.showInputDialog("Digite seu CPF: "));
      setDataNascimento(JOptionPane.showInputDialog("Digite sua data de nascimento: "));
      setSexo(JOptionPane.showInputDialog("Qual seu sexo? "));
      setEscolaridade(JOptionPane.showInputDialog("Qual seu grau de escolaridade? "));
      setEstadoCivil(JOptionPane.showInputDialog("Qual o seu estado civil? "));
      setDeficiencia(JOptionPane.showInputDialog("Possui deficiencia? "));
      String[] autoDeclaracao = {"Branco", "Preto", "Pardo", "Indigena"};
      int selectedValue = JOptionPane.showOptionDialog(null, "Auto declaração", "Opcao",
              JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                  autoDeclaracao, autoDeclaracao [0]);
      setAutoDeclaracao(autoDeclaracao[selectedValue]);
      setEmpregado(false);
      setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salario: ")));
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
  public void setDataNascimento(String dataNascimento){
    this.dataNascimento = dataNascimento;
  }
  public String getDataNasciemento(){
    return this.dataNascimento;
  }
  public void setSexo(String sexo){
    this.sexo = sexo;
  }
  public String getSexo(){
    return this.sexo;
  }
  public void setEscolaridade(String escolaridade){
    this.escolaridade = escolaridade;
  }
  public String getEscolaridade(){
    return this.escolaridade;
  }
  public void setEstadoCivil(String estadoCivil){
    this.estadoCivil = estadoCivil;
  }
  public String getEstadoCivil(){
    return this.estadoCivil;
  }
  public void setDeficiencia(String deficiencia){
    this.deficiencia = deficiencia;
  }
  public String getDeficiencia(){
    return this.deficiencia;
  }
  public void setAutoDeclaracao(String autoDeclaracao){
    this.autoDeclaracao = autoDeclaracao;
  }
  public String getAutoDeclaracao(){
    return this.autoDeclaracao;
  }
  public void setEmpregado(boolean empregado){
    this.empregado = empregado;
  }
  public boolean getEmpregado(){
    return this.empregado;
  }
  public void setSalario(double salario){
    this.salario = salario;
  }
  public double getSalario(){
    return this.salario;
  }
  public void setSenha(String senha){
    this.senha = senha;
  }
  public String getSenha(){
    return this.senha;
  }
}