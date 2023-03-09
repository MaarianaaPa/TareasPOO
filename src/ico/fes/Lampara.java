package ico.fes;

import java.awt.*;

public class Lampara {
    private String estilo;
    private String marca;
    private String colorluz;
    private double tamaño;
    private String material;

    public Lampara() {
    }

    public Lampara(String estilo, String marca, String colorluz, double tamaño, String material) {
        this.estilo = estilo;
        this.marca = marca;
        this.colorluz = colorluz;
        this.tamaño = tamaño;
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return colorluz;
    }

    public void setColor(Color color) {
        this.colorluz = colorluz;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "estilo='" + estilo + '\'' +
                ", marca='" + marca + '\'' +
                ", colorluz=" + colorluz +
                ", tamaño=" + tamaño +
                ", material='" + material + '\'' +
                '}';
    }
    public void encender(){
        System.out.println("encendiendo");
        System.out.println(colorluz);
    }public void apagar(){
        System.out.println("apagando");
    }
}
