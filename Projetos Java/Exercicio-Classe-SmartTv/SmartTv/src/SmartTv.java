public class SmartTv {
    boolean ligada=false; 
    int canal=1;
    int volume=25;
    

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        // volume = volume + 1
        volume ++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        // volume = volume - 1
        volume --;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        
    }

    public void aumentarCanal() {
        canal ++;
       // System.out.println("Diminuindo volume para: " + volume);
    }

    public void diminuirCanal() {
        canal --;
       // System.out.println("Diminuindo volume para: " + volume);
    }

}


