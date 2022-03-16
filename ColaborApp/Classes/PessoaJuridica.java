class PessoaJuridica{
  private String cnpj, razaoSocial;

  public PessoaJuridica(){}
  
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
}