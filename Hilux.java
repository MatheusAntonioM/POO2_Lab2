public class Hilux implements IVehicle {
    @Override
    public void start() {
        System.out.println("Hilux está ligando...");
    }

    @Override
    public void drive() {
        System.out.println("Hilux está rodando...");
    }

    @Override
    public void stop() {
        System.out.println("Hilux está parando...");
    }
}
