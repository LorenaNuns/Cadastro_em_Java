// classe onde coloco todo os atributos necessários para o cadastro e faço seus respectivos métodos get e set
public class Cadastro {

  String nome, sobrenome, email;
  String telefone, cep, num_casa;

  public String getNome() {
    return nome;
  }

  public void setNome(String n) {
    this.nome = n;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sn) {
    this.sobrenome = sn;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getNum_casa() {
    return num_casa;
  }

  public void setNum_casa(String nc) {
    this.num_casa = nc;
  }
}
