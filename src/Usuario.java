import iphone.Iphone;

public class Usuario {

    public static void main(String[] args) {

        Iphone iphoneDeCarlos = new Iphone();

        // String usuario = "Carlos Gomes Tavares";
        String url = "youtube.com";
        String aplicativo = "Internet";
        String numero = "14 998924147";
        String musica = "Rei de Pratania";
    


        iphoneDeCarlos.usuário = "Carlos Gomes Tavares";
        iphoneDeCarlos.url = url;
        iphoneDeCarlos.aplicativo = aplicativo;
        iphoneDeCarlos.numeroTelefone = numero;
        iphoneDeCarlos.musica = musica;

        iphoneDeCarlos.ligarTelefone();
        iphoneDeCarlos.desbloquear();

        iphoneDeCarlos.selecionarAplicacao(aplicativo);

        iphoneDeCarlos.bloquear();
        iphoneDeCarlos.desligar();

    }
    
}
