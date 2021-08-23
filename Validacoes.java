import javax.swing.JOptionPane;

// classe onde as validações dos atributos da classe cadastro ocorrem
public class Validacoes {

  // método para validar o nome e sobrenome
  void valida_nome(Cadastro cadastro) {
    String nome = cadastro.getNome();
    String sobrenome = cadastro.getSobrenome();

    // aqui o if faz a verificação se a primeira letra do nome é algum número e se
    // no deccorer da string há algum caractere q n seja letra
    if (Character.isAlphabetic((nome.charAt(0))) && Character.isAlphabetic((nome.charAt(nome.length() - 1)))
        && Character.isAlphabetic((sobrenome.charAt(0))) && Character.isAlphabetic((nome.charAt(nome.length() - 1)))) {
      System.out.println("Seu nome é válido!");
    } else {
      System.out.println("Seu nome não é válido, verifique se digitou corretamente: " + cadastro.getNome() + " "
          + cadastro.getSobrenome());
    }
  }

  // método para validar o telefone
  void valida_tel(Cadastro cadastro) {
    String tel = cadastro.getTelefone();
    // modelo padrão de número de telefone
    String padrao_tel = "\\d\\d\\d\\d\\d-\\d\\d\\d\\d";

    // o if faz a validaçao através do matches, se oq estiver na variavel tel
    // igualar com o padrão_tel, é válido, se não é inválido
    if (tel.matches(padrao_tel)) {
      System.out.println("Seu telefone é válido! ");
    } else {
      System.out.println("Seu telefone é inválido, verifique se digitou corretamente: " + tel);
    }

  }

  // método para validar o email
  void valida_email(Cadastro cadastro) {
    String email = cadastro.getEmail();

    // diferente do método do telefone, aqui o modelo padrão já está sendo comparado
    // direto com a string
    // mas o funcionamento é o mesmo, se for igual ao padrão é válido
    // fiz o email ter padrão no final de ".com.br", por isso o \\w{2,3}\\.\\w{2,3}
    // o w{2,3} significa: o minímo de letras é 2 e o máximo é 3"
    if (email.matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}")) {
      System.out.println("Email válido!");
    } else {
      System.out.println("Email inválido,  verifique se digitou corretamente: " + cadastro.getEmail());
    }
  }

  // método para validar o cep
  void valida_cep(Cadastro cadastro) {
    // modelo padrão para o cep
    String padrao_cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
    String cep_usuario = cadastro.getCep();

    // faz a validação do cep através do if, comparando com o modelo padrão
    if (cep_usuario.matches(padrao_cep)) {
      System.out.println("Seu cep é válido!");

    } else {
      System.out.println("Seu cep é inválido, verifique se digitou corretamente: " + cep_usuario);
    }
  }

  // método para validar o número da casa
  void valida_numcasa(Cadastro cadastro) {
    String numc = cadastro.getNum_casa();

    if (numc.matches("\\d{3}") || numc.matches("\\d{2,3}-\\w")) {
      System.out.println("Seu número de casa é válido! ");
    } else {
      System.out.println("Seu número de casa é inválido, verifique se digitou corretamente: " + numc);
    }
  }

  // método para a pessoa ver seus dados e confirmar eles
  void mostra_dados(Cadastro cadastro) {
    Cadastro cad = cadastro;
    JOptionPane.showConfirmDialog(null,
        "Seu cadastro foi efetuado com sucesso!\nConfirme seus dados: \n" + "Nome: " + cad.getNome() + " "
            + cad.getSobrenome() + "\nTelefone: " + cad.getTelefone() + "\nEmail: " + cad.getEmail() + "\nCep: "
            + cad.getCep() + "\nNúmero da casa: " + cad.getNum_casa());

  }
}
