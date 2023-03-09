package ico.fes;

public class CuboDeRubik {
    private String marca;
    private int tamaño;
    private int edadmin;

    public CuboDeRubik() {
    }

    public CuboDeRubik(String marca, int tamaño, int edadmin) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.edadmin = edadmin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getEdadmin() {
        return edadmin;
    }

    public void setEdadmin(int edadmin) {
        this.edadmin = edadmin;
    }

    @Override
    public String toString() {
        return "CuboDeRubik{" +
                "marca='" + marca + '\'' +
                ", tamaño=" + tamaño +
                ", edadmin=" + edadmin +
                '}';
    }
    public void girar(){
        System.out.println("Girando...");
    }
    public void terminado(){
        System.out.println("Terminado");
    }
}
