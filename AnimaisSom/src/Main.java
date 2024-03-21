public class Main {
    public static void main(String[] args) {
    Animais a1 = new Animais("Pintado","Peixe",2);
    Mamifero a2 = new Mamifero("Cachorro","Mamífero",10,"F","AU AU AU AU");

    a1.apresentarDados();
        System.out.println("======================================");
    a2.fazerSom();
    }
}