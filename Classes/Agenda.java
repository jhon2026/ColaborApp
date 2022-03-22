import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

class Agenda implements Serializable{
  private ArrayList<Pendencia> pendencias = new ArrayList<Pendencia>(); 

  void cadastrarPendencia(Pendencia pendencia){
    this.pendencias.add(pendencia);
  }

  ArrayList<Pendencia> getPendencias(){
    return this.pendencias;
  }
}