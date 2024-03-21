import java.util.*;
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome=nome;}

    public int getIdade(){return this.idade;}
    public void setIdade(int idade){this.idade=idade;}

    public void coletarDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o nome: ");
        this.nome = teclado.nextLine();
        System.out.printf("Digite a idade: ");
        this.idade = teclado.nextInt();
    }

    public void mostrarDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
    }
}
