package Extra02;

public class CantanteFamoso {

    private String cantante;
    private String discoMasVendido;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String cantante, String discoMasVendido) {
        this.cantante = cantante;
        this.discoMasVendido = discoMasVendido;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "cantante=" + cantante + ", discoMasVendido=" + discoMasVendido + '}';
    }

}
