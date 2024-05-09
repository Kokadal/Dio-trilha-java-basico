public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv SmartTv = new SmartTv();

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();

        System.out.println("Canal Atual: " +SmartTv.canal);
        SmartTv.mudarCanal(13);
        System.out.println("Canal Atual: " +SmartTv.canal);


        System.out.println("TV ligada? ->"  + SmartTv.ligada);
        System.out.println("Canal Atual : ->  " + SmartTv.canal );
        System.out.println("Volume Atual : -> " + SmartTv.volume);
        
        SmartTv.ligar ();
        System.out.println(" Novo Status -> TV ligada?" + SmartTv.ligada);
        
        SmartTv.desligar();
        System.out.println(" Novo Status -> TV desligada?" + SmartTv.ligada);


    }
}
