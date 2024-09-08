public class App {
    public static void main(String[] args) throws Exception {
        // Fabricante Toyota (Singleton)
        IVehicleMaker toyota = Toyota.getInstancia();
        IVehicle corolla = toyota.makeVehicle("Corolla");
        corolla.start();
        corolla.drive();
        corolla.stop();

        IVehicle hilux = toyota.makeVehicle("Hilux");
        hilux.start();
        hilux.drive();
        hilux.stop();

        // Fabricante Honda (Singleton)
        IVehicleMaker honda = Honda.getInstancia();
        IVehicle civic = honda.makeVehicle("Civic");
        civic.start();
        civic.drive();
        civic.stop();

        IVehicle fit = honda.makeVehicle("Fit");
        fit.start();
        fit.drive();
        fit.stop();
    }
}