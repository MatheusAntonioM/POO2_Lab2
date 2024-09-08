public class App {
    public static void main(String[] args) throws Exception {
   // Singleton Samsung
   FabricanteCelular samsung = Samsung.getInstancia();
   Celular galaxy8 = samsung.constroiCelular("Galaxy8");
   galaxy8.fazLigacao();
   galaxy8.tiraFoto();

   Celular galaxy20 = samsung.constroiCelular("Galaxy20");
   galaxy20.fazLigacao();
   galaxy20.tiraFoto();

   // Singleton Apple
   FabricanteCelular apple = Apple.getInstancia();
   Celular iPhoneX = apple.constroiCelular("IPhoneX");
   iPhoneX.fazLigacao();
   iPhoneX.tiraFoto();

   Celular iPhoneS = apple.constroiCelular("IPhoneS");
   iPhoneS.fazLigacao();
   iPhoneS.tiraFoto();
}
}
