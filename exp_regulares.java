
public class exp_regulares {
  public static void main(String[] args) {
    // criando objetos das classes cadastro e validacoes

    Cadastro c = new Cadastro();
    Validacoes val = new Validacoes();
    // colocando dados nos atributos da classe cadastro
    c.setNome("Luiza");
    c.setSobrenome("Isa");
    c.setTelefone("98803-2341");
    c.setEmail("Luisa@gmail.com.br");
    c.setCep("12345-678");
    c.setNum_casa("088");

    // chamando os métodos de validações
    val.valida_nome(c);
    val.valida_tel(c);
    val.valida_email(c);
    val.valida_cep(c);
    val.valida_numcasa(c);
    val.mostra_dados(c);

    System.out.println("------------");
    System.out.println(" ");
    System.out.println("Tipo de dados inválidos:");

    // criando um outro objeto da classe cadastro para verificar se as invalidaçoes
    // estão funcionando
    Cadastro c2 = new Cadastro();
    c2.setNome("1Af0ns0");
    c2.setSobrenome("4lencar.");
    c2.setTelefone("9w1234-0000");
    c2.setEmail("123@hotmail.br");
    c2.setCep("xxxxx-xx1");
    c2.setNum_casa("aaa");

    // chamando os métodos de validações
    val.valida_nome(c2);
    val.valida_tel(c2);
    val.valida_email(c2);
    val.valida_cep(c2);
    val.valida_numcasa(c2);

  }
}
