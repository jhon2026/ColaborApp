import java.util.List;
import java.util.ArrayList;

class Agenda{
  private List<Pendencia> pendencias = new ArrayList<Pendencia>(); 

  void cadastrarPendencia(Pendencia pendencia){
    this.pendencias.add(pendencia);
  }

  List<Pendencia> retornarPendencias(){
    return this.pendencias;
  }
}