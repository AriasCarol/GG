import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DungeonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear al jugado
        System.out.println("¡Hola! Bienvenido a este emocionante juego. \nEres un chef de cobre que busca aspirar ser un gran chef de oro, para lograr eso debes pasar por una serie de desafíos.");

        System.out.print("¿Así que tú eres el que está buscando el rango de chef de oro? \npor favor, ingresa tu nombre :) : ");

        String playerName = scanner.nextLine();
        Player player = new Player(playerName, 100);  // puntos de vida otorgadoss al jugador

        // Tipos de salas
        List<Room> dungeon = new ArrayList<>();
        dungeon.add(new TreasureRoom("Cuchillo")); // primera sala con tesoro
        dungeon.add(new EmptyRoom()); // sala vacía
        dungeon.add(new TreasureRoom("Cuchara de palo"));
        dungeon.add(new EnemyRoom(20));  // Enemigo resta 20 puntos de daño
        dungeon.add(new TreasureRoom("Tenedor plateado"));
        dungeon.add(new EmptyRoom());
        dungeon.add(new EnemyRoom(30));  // Enemigo restaa 30 puntos de daño

        // Ciclo del juego
        for (Room room : dungeon) {
            if (!player.isAlive()) {
                System.out.println("¡Has muerto :(! Fin del juego.");
                break;
            }

            //  entrar a sala
            room.enter(player);

            // estado de salud del jugador
            player.showStatus();

            System.out.println("Escribe next y enter para continuar a la siguiente sala..");
            scanner.nextLine();
        }

        if (player.isAlive()) {
            System.out.println("¡Felicidades! Completaste el juego, te has convertido en chef de oro :D");
        }

        scanner.close();
    }
}


/* import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DungeonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

*/
