import java.util.*;
public class Animais implements Metodos {
    private String nome;
    private float peso;

    public Animais(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }


    @Override
    public void coletarDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o nome do animal: ");
        this.nome = teclado.nextLine();
        System.out.printf("Digite o peso do animal: ");
        this.peso = teclado.nextFloat();
        teclado.close();
    }

    @Override
    public void apresentarDados() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Peso: "+this.peso+"KG");

    }
}
