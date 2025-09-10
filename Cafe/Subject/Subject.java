package Subject;
import Observer.Observer;
public interface Subject{
    public void suscribir(Observer o);
    public void eliminarSubs(String id);
    public void notificacion(LoteCafe lote);
} 