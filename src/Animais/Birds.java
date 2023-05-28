package Animais;

public class Birds extends Animal {
    static int numeroDeBirds;


    public Birds(String nome, String cor, String humor) {
        super(nome, cor, humor);
    }

    //Sobrepoem a classe herdada
    @Override
    public void soar() {
        System.out.println("PIUPIU");
    }
}
