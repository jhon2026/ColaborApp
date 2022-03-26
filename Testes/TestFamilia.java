@Test
public void TestFamilia() {
  ArrayList<Pessoa> membros= new ArrayList<Pessoa>();
  membros.add(new Pessoa("", "", "", "", "", "", "", "", true, 1200.00, "")); 
  membros.add(new Pessoa("", "", "", "", "", "", "", "", true, 600.00, "")); 
  membros.add(new Pessoa("", "", "", "", "", "", "", "", false, 0.00, "")); 
  
  Familia familia = new Familia(membros);
  
  assertEquals(1800.00, familia.calcularRenda(), 0.00);
  assertEquals(3, familia.quantidadeMembros());
}
