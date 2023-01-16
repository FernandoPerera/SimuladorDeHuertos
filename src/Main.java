public class Main {
    public static void main(String[] args) {

        Orchard huerto = new Orchard(10);

        Farmer nando = new Farmer("Fernando", 5, 2, huerto);

        Client cliente = new Client("Adrian", 5,2,huerto);

        nando.setPriority(10);
        nando.start();
        cliente.start();

    }
}