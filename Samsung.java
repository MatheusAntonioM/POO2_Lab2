public class Samsung implements FabricanteCelular {

    private static Samsung instancia;

    private Samsung() { }

    public static Samsung getInstancia() {
        if (instancia == null) {
            instancia = new Samsung();
        }
        return instancia;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        switch (modelo.toLowerCase()) {
            case "galaxy8":
                return new Galaxy8();
            case "galaxy20":
                return new Galaxy20();
            default:
                throw new IllegalArgumentException("Modelo não disponível: " + modelo);
        }
    }
}
