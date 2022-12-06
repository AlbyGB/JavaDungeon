package dungeon;

public class Spada extends Item {
    private int livello;
    private final int durabilita;

    public Spada(String nome,int livello,int durabilita) {
        super(nome);
        this.livello = livello;
        this.durabilita = durabilita;
    }
}
