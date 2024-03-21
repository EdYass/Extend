import java.util.*;
public class Cachorro extends Animais{
    private String raca;
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca=raca;
    }

    public void coletarDados(){
        super.coletarDados();
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite a raça do animal: ");
        this.raca = teclado.nextLine();
    }
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Raça: "+this.raca);
    }
}
