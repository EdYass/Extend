import java.util.*;
public class Veiculo {
    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano){
        this.modelo=modelo;
        this.ano=ano;
    }

    public String getModelo(){return this.modelo;}
    public void setModelo(String modelo){this.modelo=modelo;}

    public int getAno(){return this.ano;}
    public void setAno(int ano){this.ano=ano;}

    public void coletarDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o nome do modelo: ");
        this.modelo=teclado.nextLine();
        System.out.printf("Digite o ano do carro: ");
        this.ano=teclado.nextInt();
    }

    public void apresentarDados(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
    }
}
