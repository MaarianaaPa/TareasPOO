package ico.fes;

public class Computadora {
    private String marca;
    private String modelo;
    private String tipodd; //disco duro
    private int memoria;
    private String procesador;
    private String tamañopantalla;
    private String sistoperativo;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, String tipodd, int memoria, String procesador, String tamañopantalla, String sistoperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipodd = tipodd;
        this.memoria = memoria;
        this.procesador = procesador;
        this.tamañopantalla = tamañopantalla;
        this.sistoperativo = sistoperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipodd() {
        return tipodd;
    }

    public void setTipodd(String tipodd) {
        this.tipodd = tipodd;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTamañopantalla() {
        return tamañopantalla;
    }

    public void setTamañopantalla(String tamañopantalla) {
        this.tamañopantalla = tamañopantalla;
    }

    public String getSistoperativo() {
        return sistoperativo;
    }

    public void setSistoperativo(String sistoperativo) {
        this.sistoperativo = sistoperativo;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipodd='" + tipodd + '\'' +
                ", memoria=" + memoria +
                ", procesador='" + procesador + '\'' +
                ", tamañopantalla='" + tamañopantalla + '\'' +
                ", sistoperativo='" + sistoperativo + '\'' +
                '}';
    }
    public void encender(){
        System.out.println("Encendiendo...");
    }
    public void apagar(){
        System.out.println("Apagando...");
    }
    public void actualizar(){
        System.out.println("Actualizando...");
    }
}
