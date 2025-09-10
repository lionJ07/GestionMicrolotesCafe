package Observer;

import Lote.LoteCafe;

public class Barista implements Observer {
    private String nombre;
    private String id;

    public Barista(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public void update(LoteCafe lote) {
        System.out.println("-- Nueva Notificación --");
        System.out.println("Para: " + nombre);
        System.out.println("Varietal: " + lote.getVarietal() + " (" + lote.getCantDisponible() + " lbs)");
        System.out.println("Origen: " + lote.getOrigen());
        System.out.println("Productor: " + lote.getNombreProd());
        System.out.println("Notas: " + lote.getNotas());
        System.out.println("Altura: " + lote.getAlturaCult());
    }

    @Override
    public String getId() {
        return id;
    }
}
