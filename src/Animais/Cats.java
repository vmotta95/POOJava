package Animais;

public class Cats  extends Animal{

    static int numeroDeCats;

    public Cats(String nome, String cor, String humor) {
        super(nome, cor, humor);
    }


    @Override
    public String toString() {
        return "Cats{" +
                "nome='" + nome + '\'' +
                '}';
    }

    //Sobrepoem a classe herdada
    @Override
    public void soar() {
        System.out.println("MIAU MIAU MIAUUUU");
    }
}
