public class Mamifero extends Animais{
    private String genero;
    private String som;
    public Mamifero(String nome,String classe, int idade, String genero,String som) {
        super(nome, classe, idade);
        this.genero=genero;
        this.som=som;
    }

    public String getGenero(){return this.genero;}
    public void setGenero(String genero){this.genero = genero;}

    public String getSom(){return this.som;}
    public void setSom (String som){this.som = som;}

    public void fazerSom(){
        super.apresentarDados();
        System.out.println("Gênero: "+this.genero);
        System.out.println("Som: "+this.som);
    }
}
