public class Animais {
    private String nome;
    private int idade;
    private String classe;

    public Animais(String nome,String classe, int idade){
        this.nome=nome;
        this.classe=classe;
        this.idade=idade;
    }

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public String getClasse(){return this.classe;}
    public void setClasse(String classe){this.classe = classe;}

    public int getIdade(){return this.idade;}
    public void setIdade(int idade){this.idade = idade;}

    public void apresentarDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Classe: "+this.classe);
        System.out.println("Idade: "+this.idade);
    }
}
