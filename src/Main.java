public class Main {
    public static void main(String[] args) {

        Orchard huerto = new Orchard(10);

        Farmer nando = new Farmer("Fernando", 10, 4, huerto);

        Client cliente = new Client("Luquita", 6,4,huerto);
        Client cliente2 = new Client("Modric", 4,2,huerto);

        nando.start();
        cliente.start();
        cliente2.start();

    }
}