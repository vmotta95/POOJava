package Animais;

public class Dogs {
    //atributos
    static int numeroDeDogs;
   private String nome;
    private String raca;
    private int Idade;
    private String humor;

    //Getters e Setters para encapsulamento
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }
    public static int getNumeroDeDogs() {
        return numeroDeDogs;
    }

    public static void setNumeroDeDogs(int numeroDeDogs) {
        Dogs.numeroDeDogs = numeroDeDogs;
    }



    public void comer (){}
    public void latir (){
        System.out.println("AUAU");
    }

    public String pegar (){
       return "Bolinha";
    }

    //Construtores definido pelo usuario
    public Dogs(){}
    public Dogs(String nome, String raca, int idade, String humor) {
        this.nome = nome;
        this.raca = raca;
        this.Idade = idade;
        this.humor = humor;

        numeroDeDogs ++;
    }

    //metodos

    public String interagirDog (String acao){
       switch (acao){
           case "Carinho" : this.humor = "Feliz";
           break;
           case "Brigar" : this.humor = "Puto";
           break;
           case "Pisar" : this.humor = "Raivoso";
           break;
           default:this.humor = "Neutro";
       }
        return this.humor;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
