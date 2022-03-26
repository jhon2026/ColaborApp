Test
public void TestPessoaJuridica() {
  String cnpj = "0764000165";
  String razaoSocial = "Caju's Mall";
  String senha = "52134";

  PessoaJuridica pessoa = new PessoaJuridica(cnpj, razaoSocial, senha);

  assertEquals(cnpj, pessoa.getCNPJ());
  assertEquals(razaoSocial, pessoa.getRazaoSocial());
  assertEquals(senha, pessoa.getSenha());
}
