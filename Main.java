public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone("15 Pro");

        // Testando Reprodutor Musical
        meuIPhone.tocar();
        meuIPhone.selecionarMusica("Bohemian Rhapsody");
        meuIPhone.pausar();

        // Testando Aparelho Telefônico
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIPhone.exibirPagina("www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}