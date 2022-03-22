import java.util.ArrayList;
import java.io.Serializable;
class Recebedor implements Serializable{

  private ArrayList<Demanda> demandas = new ArrayList<Demanda>();

  void adicionarDemanda(Demanda demanda){
    demandas.add(demanda);
  }

  ArrayList<Demanda> getDemandas(){
    return this.demandas;
  }
}