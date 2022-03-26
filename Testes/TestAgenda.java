@Test
public void TestAgenda() {
  ArrayList<Pendencia> pendencias = new ArrayList<Pendencia>();
  pendencias.add(new Pendencia("Cadastro", "Nova família", "Pendente"));  
  pendencias.add(new Pendencia("Cadastro", "Novo parceiro", "Realizado"));
  pendencias.add(new Pendencia("Visita", "Familia nova cadastrada", "Pendente"));
  Agenda agenda = new Agenda();
  for(Pendencia pendencia : pendencias){
    agenda.cadastrarPendencia(pendencia);
  }

  assertEquals(pendencias.get(1).getTipoPendencia(), agenda.getPendencias().get(1).getTipoPendencia());
  assertEquals(pendencias.get(1).getDescricao(), agenda.getPendencias().get(1).getDescricao());
}
