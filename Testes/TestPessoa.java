@Test
public void TestPessoa() {
  String nome = "Nagy";
  String cpf = "22222";
  String dataNascimento = "12/09/2003";
  String sexo = "F";
  String escolaridade = "Graduando";
  String estadoCivil = "Casada";
  String deficiencia = "Nao";
  String autoDeclaracao = "Branco";
  boolean empregado = true;
  double salario = 2000.00;
  String senha = "123456";

  Pessoa pessoa = new Pessoa(nome, cpf, dataNascimento, sexo, escolaridade, deficiencia, estadoCivil, autoDeclaracao, empregado, salario, senha);
  assertEquals(nome, pessoa.getNome());
  assertEquals(cpf, pessoa.getCPF());
  assertEquals(dataNascimento, pessoa.getDataNascimento());
  assertEquals(sexo, pessoa.getSexo());
  assertEquals(escolaridade, pessoa.getEscolaridade());
  assertEquals(deficiencia, pessoa.getDeficiencia());
  assertEquals(estadoCivil, pessoa.getEstadoCivil());
  assertEquals(autoDeclaracao, pessoa.getAutoDeclaracao());
  assertEquals(empregado, pessoa.getEmpregado());
  assertEquals(salario, pessoa.getSalario(), 0.00);
  assertEquals(senha, pessoa.getSenha());

}
