package Main;
import Subject.Cooperativa;
import Observer.Barista;
import Observer.Observer;
import Lote.LoteCafe;
public class Main {
    public static void main(String[] args) {
        Cooperativa coop = new Cooperativa();

        Observer b1 = new Barista("Leonardo", "01");
        Observer b2 = new Barista("Cristian", "02");

        coop.suscribir(b1);
        coop.suscribir(b2);

        LoteCafe lote = new LoteCafe(
            "Tabi", "Del Quindío", "El lote de tabi contiene notas de caramelo con mora", "1.25 msnm", "Pepe Gonzales", 30


        );
        coop.registrarLote(lote);

        coop.eliminarSuscripcion("01");
    }
}