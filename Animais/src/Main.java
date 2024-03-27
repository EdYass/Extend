public class Main {
    public static void main(String[] args) {
        Animais a1 = new Animais("",0.0f);
        Cachorro a2 = new Cachorro("",0.0f,0,"");

        a1.coletarDados();
        a1.apresentarDados();
        System.out.println("============================================");
        a2.coletarDados();
        a2.apresentarDados();
    }
}