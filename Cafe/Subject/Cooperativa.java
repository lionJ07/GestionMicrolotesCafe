package Subject;

import java.util.ArrayList;
import java.util.List;
import Observer.Observer;
import Lote.LoteCafe;

public class Cooperativa implements Subject {
    private List<Observer> baristas = new ArrayList<>();

    @Override
    public void suscribir(Observer o) {
        baristas.add(o);
        System.out.println("El barista " + o.getId() + " ha sido suscrito correctamente.");
    }

    @Override
    public void eliminarSubs(String id) {
        baristas.removeIf(b -> b.getId().equals(id));
        System.out.println("El barista " + id + " ha sido desuscrito correctamente.");
    }

    @Override
    public void notificacion(LoteCafe lote) {
        for (Observer b : baristas) {
            b.update(lote);
        }
    }

    public void registrarLote(LoteCafe lote) {
        System.out.println("Nuevo lote de café registrado: " + lote.getVarietal());
        notificacion(lote);
    }
}
