class Pessoa extends Recebedor{
  private String nome, cpf, dataNascimento, sexo, escolaridade, estadoCivil, deficiencia, autoDeclaracao;
  private boolean empregado;
  private double salario;

  public Pessoa(){}

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
    this.dataNascimento = dataNasciemnto;
  }
  public String getDataNasciemento(){
    return this.dataNasciemento;
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
  public void setEmpregado(String empregado){
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
}