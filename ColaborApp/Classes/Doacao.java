class Doacao{
  private String tipo;
  private String especificacao;

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