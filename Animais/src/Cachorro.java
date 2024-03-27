import java.util.*;
public class Cachorro extends Animais{
    private String raca;
    private int idade;
    public Cachorro(String nome, float peso, int idade, String raca) {
        super(nome, peso);
        this.raca=raca;
        this.idade=idade;
    }

    public void coletarDados(){
        super.coletarDados();
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite a raça do animal: ");
        this.raca = teclado.nextLine();
        System.out.printf("Digite a idade do animal: ");
        this.idade = teclado.nextInt();
    }
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Raça: "+this.raca);
        System.out.println("Idade: "+this.idade);
    }
}
