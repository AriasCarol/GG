public class EmptyRoom implements Room { //clase sala vacía
    @Override
    public void enter(Player player) {
        System.out.println("¡Ups! esta sala solo tiene basura"); //mensaje
    }
}
