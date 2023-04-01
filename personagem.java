import java.util.ArrayList;

public class personagem {
    String nome;
    int vida;
    ArrayList<item> inventario;
    int level;
    String classe;
    Room loc;
    public void olhainventario(){
        System.out.println(inventario);
    }
    public void dropar(int index){
        inventario.remove(index);
    }
    public personagem(String nam, String cls, Room x){
        nome = nam;
        vida = 50 + (level * 2);
        level = 0;
        classe = cls;
        loc = x;
    }
    public personagem(){
        nome = "Goblin";
        vida = 2;
        level = 1;
        classe = "Goblin";
    }
    public void getItem(item x){
        this.inventario.add(x);
    }

}


