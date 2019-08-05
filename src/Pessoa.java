public class Pessoa {

private String nome;
private Integer idade;
private int cpf;

public Pessoa(String nome, Integer idade, int cpf) {
super();
this.nome = nome;
this.idade = idade;
this.cpf = cpf;
}


public Pessoa() { //constructor v
super();
}



public String getNome() {
return nome;
}


public void setNome(String nome) {
this.nome = nome;
}


public Integer getIdade() {
return idade;
}
}

