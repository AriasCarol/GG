public class EnemyRoom implements Room { //esta es la sala de enemigos
    private int damage;

    public EnemyRoom(int damage) {
        this.damage = damage;
    }

    @Override
    public void enter(Player player) { //ataque de enemigo
        System.out.println("¡Oh no! Un chef malvado te ha atacado");
        player.receiveDamage(damage);
    }
}
