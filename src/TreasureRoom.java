public class TreasureRoom implements Room, GameObject {
    private String treasure;

    public TreasureRoom(String treasure) {
        this.treasure = treasure;
    }

    @Override //interactuar
    public void enter(Player player) {
        System.out.println("¡Atención! ¡En esta sala hay tesoros!");
        interact(player);
    }

    @Override
    public void interact(Player player) {
        player.addItem(treasure);
    }
}


/*
    public TreasureRoom(String treasure) {
        this.treasure = treasure;
    }
*/