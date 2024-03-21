import java.util.*;
public class Estudante extends Pessoa{

    private int matricula;
    public Estudante(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula=matricula;
    }

    public int getMatricula(){return this.matricula;}
    public void setMatricula(int matricula){this.matricula=matricula;}

    public void coletarDados(){
        Scanner tecaldo = new Scanner(System.in);
        super.coletarDados();
        System.out.printf("Digite a matrícula: ");
        this.matricula=tecaldo.nextInt();
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Matrícula: "+this.matricula);
    }
}
