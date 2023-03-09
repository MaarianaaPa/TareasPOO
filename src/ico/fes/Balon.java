package ico.fes;

public class Balon {
    private String deporte;
    private String marca;
    private String material;
    private double tamaño;
    private String color;
    private double peso;

    public Balon() {
    }

    public Balon(String deporte, String marca, String material, double tamaño, String color, double peso) {
        this.deporte = deporte;
        this.marca = marca;
        this.material = material;
        this.tamaño = tamaño;
        this.color = color;
        this.peso = peso;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
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

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
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

    @Override
    public String toString() {
        return "Balon{" +
                "deporte='" + deporte + '\'' +
                ", marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", tamaño=" + tamaño +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                '}';
    }
    public void botar(){
        System.out.println("Botando...");
    }
    public void rodar(){
        System.out.println("Rodando...");
    }
}
