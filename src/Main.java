import Animais.Animal;
import Animais.Birds;
import Animais.Cats;
import Animais.Dogs;
import Lojas.Petshop;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello word POO JAVA");

        // Criando dogs de maneiras diferentes e utilizando metodos
        Dogs dogs1 = new Dogs();
        dogs1.setNome("Billy");
        dogs1.setRaca("Labrador");
        dogs1.setIdade(15);

        System.out.println(dogs1.getNumeroDeDogs());
        Dogs dogs2 = new Dogs("Bob","Poodle",10,"Feliz");

        System.out.println(dogs2.getNumeroDeDogs());

        Dogs dogs3 = new Dogs("Rex","Poodle",10,"Feliz");

        System.out.println(dogs3.getNumeroDeDogs());
        System.out.println(dogs1.getNumeroDeDogs());

        //criando cats
        Cats cat1 = new Cats ("Tutichu","Rajada","Brava");

        //criando Birds
        Birds bird1 = new Birds("Piu Piu","Amarelo", "Pacifico");

        //criando Gatos referenciando  Animais
        Animal cat2 = new Cats("Repolho","Preto","Doido");

        //Chamando a classe Petshop e alterando valores
        Petshop petshop = new Petshop();

        petshop.darBanho(cat1);
        System.out.println(cat1.getHumor());

        petshop.darBanho(bird1);
        System.out.println(bird1.getHumor());

        petshop.tosar(cat1);
        System.out.println(cat1.getHumor());

        //Chamando metodos
       dogs1.latir();
       dogs1.pegar();

       //Pegando infos privadas
        System.out.println(dogs2.getNome());
        System.out.println(dogs2.getHumor());

        //Chamando metodos e definindo valores
        System.out.println("O cachorro pegou uma " + dogs1.pegar());
        System.out.println("o Doguinho esta " + dogs1.interagirDog("Carinho"));
        System.out.println("o Doguinho esta " + dogs1.interagirDog("Nada"));
        System.out.println("o Doguinho esta " + dogs1.interagirDog("Brigar"));

        System.out.println(dogs2.toString());

        cat1.soar();
        bird1.soar();


    }
}