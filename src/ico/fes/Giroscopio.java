package ico.fes;

public class Giroscopio {
    private String marca;
    private String material;
    private String color;
    private int tamaño;

    public Giroscopio() {
    }

    public Giroscopio(String marca, String material, String color, int tamaño) {
        this.marca = marca;
        this.material = material;
        this.color = color;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }
    public void mover(){
        System.out.println("Moviendo...");
    }
    public void detener(){
        System.out.println("Deteniendo...");
    }
}