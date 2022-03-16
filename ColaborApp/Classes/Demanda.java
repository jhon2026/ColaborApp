class Demanda{
  private String tipo;
  private String descricao;
  private String situacao;

  void setTipo(String tipo){
    this.tipo = tipo;
  }

  String getTipo(){
    return this.tipo;
  }

  void setDescricao(String descricao){
    this.descricao = descricao;
  }

  String getDescricao(){
    return this.descricao;
  }

  void setSituacao(String situacao){
    this.situacao = situacao;
  }

  String getSituacao(){
    return this.situacao;
  }

  public void alterarSituacao(){}
}