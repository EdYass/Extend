public class Main {
    public static void main(String[] args) {
    Funcionario f1 = new Funcionario("Jun", 20,450);
    Gerente f2 = new Gerente("Nadya", 18, 3500, "Gerente");
    f1.status();
        System.out.println("==============================");
    f2.status();

    }
}