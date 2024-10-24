import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private List<String> inventory;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    public void receiveDamage(int damage) { //Recibe daño e imprime msj
        this.health -= damage;
        System.out.println(name + " has recibido " + damage + " puntos de daño. Puntos de vida restantes: " + health);
    }

    public void addItem(String item) { //Para sala de inventario
        inventory.add(item);
        System.out.println(name + " has encontrado " + item);
    }

    public void showStatus() { //Condición del jugador, saluddd
        System.out.println("Jugador: " + name);
        System.out.println("Salud: " + health);
        System.out.println("Inventario: " + inventory);
    }

    public boolean isAlive() {
        return health > 0;
    }
}
