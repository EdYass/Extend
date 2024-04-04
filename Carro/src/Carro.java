import java.util.*;
public class Carro extends Veiculo{
    private String cor;

    public Carro(String modelo, int ano, String cor) {
        super(modelo, ano);
        this.cor=cor;
    }

    public String getCor(){return this.cor;}
    public void setCor(String cor){this.cor=cor;}

    public void coletarDados(){
        super.coletarDados();
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite a cor do carro: ");
        this.cor= teclado.nextLine();
        teclado.close();
    }

    public void apresentarDados(){
        super.apresentarDados();
        System.out.println("Cor: "+this.cor);
    }
}
