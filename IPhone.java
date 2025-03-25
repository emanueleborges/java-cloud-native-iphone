public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;

    public IPhone(String modelo) {
        this.modelo = modelo;
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música no iPhone " + modelo);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no iPhone " + modelo);
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica + " no iPhone " + modelo);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " do iPhone " + modelo);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no iPhone " + modelo);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone " + modelo);
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url + " no iPhone " + modelo);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do iPhone " + modelo);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no iPhone " + modelo);
    }
}