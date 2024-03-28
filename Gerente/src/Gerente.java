public class Gerente extends Funcionario{
    private String cargo;

    public Gerente(String nome, int idade, float salario, String cargo) {
        super(nome, idade, salario);
        this.cargo = cargo;
    }

    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}

    @Override
    public void status(){
        super.status();
        System.out.println("Cargo: "+this.cargo);
    }

}
