@Test
public void TestVoluntario() {
  String nome = "Joao";
  String cpf = "222";
  String senha = "987654321";

  Voluntario voluntario = new Voluntario(nome, cpf, senha);

  assertEquals(nome, voluntario.getNome());
  assertEquals(cpf, voluntario.getCPF());
  assertEquals(senha, voluntario.getSenha());
}
