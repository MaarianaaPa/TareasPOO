package ico.fes;

public class Gato {
    private String especie;
    private double tamano;
    private String color;
    private double peso;
    private String caracter;
    private int esperanzavida;

    public Gato() {
    }

    public Gato(String especie, double tamano, String color, double peso, String caracter, int esperanzavida) {
        this.especie = especie;
        this.tamano = tamano;
        this.color = color;
        this.peso = peso;
        this.caracter = caracter;
        this.esperanzavida = esperanzavida;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamaño(double tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public int getEsperanzavida() {
        return esperanzavida;
    }

    public void setEsperanzavida(int esperanzavida) {
        this.esperanzavida = esperanzavida;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "especie='" + especie + '\'' +
                ", tamano=" + tamano +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", caracter='" + caracter + '\'' +
                ", esperanzavida=" + esperanzavida +
                '}';
    }
    public void dormir(){
        System.out.println("Durmiendo");
    }
    public void comer(){
        System.out.println("Comiendo...");
    }
    public void jugar(){
        System.out.println("Jugando...");
    }
}
