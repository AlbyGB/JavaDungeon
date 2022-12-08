package dungeon;

import java.util.StringJoiner;
import java.util.Vector;

public class ItemCollection {

    private final Vector<Item> contenuto;

    public ItemCollection(Vector<Item> contenuto) {
        this.contenuto = contenuto;
    }

    public ItemCollection() {
        contenuto = new Vector<>();
    }

    public void addItem(Item item){
        contenuto.add(item);
    }

    public int elementi() {
        return contenuto.size();
    }

    public String elementiContenuti(){
        var sg = new StringJoiner(",");
        for (Item item : contenuto) {
            sg.add(item.getNome());
        }
        return sg.toString();
    }

}
