class Familia extends Recebedor{
  List<Pessoa> membros = ArrayList<Pessoa>();

  public double calcularRenda(){
    double renda = 0.00;
    foreach(Pessoa membro : membros){
      if(membro.getEmpregado){
        renda += membro.getSalario();
      }
    }
    return this.renda;
  }

  int quantidadeMebros(){
    return membros.lenght();
  }
}