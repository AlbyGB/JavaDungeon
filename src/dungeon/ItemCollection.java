package dungeon;

import java.util.StringJoiner;
import java.util.Vector;

public class ItemCollection {

    private Vector<Item> contenuto;

    public ItemCollection(Vector<Item> contenuto) {
        this.contenuto = contenuto;
    }

    public ItemCollection() {
        contenuto = new Vector<>();
    }

    public void addItem(Item item){
        contenuto.add(item);
    }

    public int elementi(){
        return contenuto.size();
    }

    public String elementiContenuti(){
        var sg = new StringJoiner(",");
        for(int i = 0; i < contenuto.size(); i++){
            sg.add(contenuto.get(i).getNome());
        }
        return sg.toString();
    }

}
