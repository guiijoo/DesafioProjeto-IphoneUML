package iphone;


import iphone.aplicativos.AparelhoTelefonico;
import iphone.aplicativos.NavegadorInternet;
import iphone.aplicativos.ReprodutorMusial;

public class Iphone implements ReprodutorMusial, AparelhoTelefonico, NavegadorInternet{

    public String usuário;
    public String aplicativo;
    public String numeroTelefone;
    public String url;
    public String musica;
    
    public void ligarTelefone()
    {
        System.out.println("Ligando telefone.");
    }

    public void desbloquear()
    {
        System.out.println("Celular desbloqueado. Bem vindo " + usuário);
    }

    public void bloquear()
    {
        System.out.println("Celular bloqueado.");
    }

    public void desligar()
    {
        System.out.println("Desligando celular!");
    }

    public void selecionarAplicacao(String aplicativo)
    {
        System.out.println("Aplicativo selecionado: "+aplicativo);
        switch (aplicativo) {
            case "Musica":
                tocar();
                pausar();
                selecionarMusica(musica);
                break;
            
            case "Telefone":
                ligar(numeroTelefone);
                atender();
                iniciarCorreioVoz();
                break;

            case "Internet":
                exibirPagina(url);
                adicionarNovaAba();
                atualizarPagina();
                break;
            
            default:
                break;
        }
    }

    public void exibirPagina(String url) {
        
        System.out.println("Exibindo página '"+ url +"' no navegador!");

    }

    public void adicionarNovaAba() {
        
        System.out.println("Adicionando nova página ao navegador!");

    }

    public void atualizarPagina() {
        
        System.out.println("Atualizando pagina");

    }

    public void ligar(String numero) {
        
        System.out.println("Ligando para o telefone: " + numero);

    }

    public void atender() {
        
        System.out.println("Atendendo telefone.");

    }

    public void iniciarCorreioVoz() {
        
        System.out.println("Iniciando correio de voz.");

    }

    public void tocar() {
        
        System.out.println("Tocando música.");

    }

    public void pausar() {
        
        System.out.println("Pausar música.");
    }

    public void selecionarMusica(String musica) {
        
        System.out.println("Música selecionada: "+ musica);

    }
    
}
