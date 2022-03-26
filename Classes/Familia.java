import java.util.ArrayList;
import java.io.Serializable;
class Familia extends Recebedor implements Serializable{
  ArrayList<Pessoa> membros = new ArrayList<Pessoa>();
  Pessoa responsavel;
  
  public Familia(ArrayList<Pessoa> membros){
    this.membros = membros;
  }

  public Familia(int membrosFamilia){
    int i = 0;
    while (i < membrosFamilia){
      Pessoa pessoa = new Pessoa();
      this.membros.add(pessoa);
      ++i;
    }
    
  }

  public void definirResponsavel(){
    this.responsavel = membros.get(0);
  }
  
  public Pessoa getResponsavel(){
    return this.responsavel;
  }

  public double calcularRenda(){
    double renda = 0.00;
    for(Pessoa membro : membros){
      if(membro.getEmpregado()){
        renda += membro.getSalario();
      }
    }
    return renda;
  }

  public int quantidadeMembros(){
    return this.membros.size();
  }
}