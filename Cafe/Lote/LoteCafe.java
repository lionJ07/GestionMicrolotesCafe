package Lote;

public class LoteCafe {
    private String varietal;
    private String origen;
    private String notas;
    private String alturaCult;
    private String nombreProd;
    private int cantDisponible;

    public LoteCafe(String varietal, String origen, String notas, String alturaCult, String nombreProd, int cantDisponible) {
        this.varietal = varietal;
        this.origen = origen;
        this.notas = notas;
        this.alturaCult = alturaCult;
        this.nombreProd = nombreProd;
        this.cantDisponible = cantDisponible;
    }

    public String getVarietal() {
        return varietal;
    }

    public String getNotas() {
        return notas;
    }

    public String getOrigen() {
        return origen;
    }

    public String getAlturaCult() {
        return alturaCult;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }
}
