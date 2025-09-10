package Observer;
import Observer.Observer;
public class Barista implements Observer{
    private String nombre;
    private String id;

    public Barista(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
    }
    @Override
    public void uptade(LoteCafe lote){
        System.out.println("--Nueva Notificación--" + "\nPara: " + nombre + "\nNuevo lote disponible: " + lote.getVarietal() + "/ " + lote.getCantDisponible() + " lbs." +
        "\n--Caracteristicas--" + "\n - Origen: " + lote.getOrigen() + "\n - Productor: " + lote.getNombreProd() + 
        "\n - Notas: " + lote.getNotas() + "\n - Altura: " + lote.getAlturaCult);
    }
    public String getId(){
        return id;
    }
}