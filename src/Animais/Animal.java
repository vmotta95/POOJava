package Animais;

public abstract class Animal {
        protected String nome;
        protected String cor;
        protected String humor;

    public Animal(String nome, String cor, String humor) {
        this.nome = nome;
        this.cor = cor;
        this.humor = humor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    protected void comer(){};
    protected void dormir(){};
    public abstract void soar();

    }
