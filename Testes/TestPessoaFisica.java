@Test
public void TestPessoaFisica() {
  String nome = "Maria";
  String cpf = "111";
  String senha = "1234";
  
  PessoaFisica pessoa = new PessoaFisica(nome, cpf, senha);
  assertEquals(nome, pessoa.getNome());
  assertEquals(cpf, pessoa.getCPF());
  assertEquals(senha, pessoa.getSenha());
}
