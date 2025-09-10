package Subject;

import Observer.Observer;
import Lote.LoteCafe;

public interface Subject {
    void suscribir(Observer o);
    void eliminarSubs(String id);
    void notificacion(LoteCafe lote);
}
