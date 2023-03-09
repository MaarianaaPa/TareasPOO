package ico.fes;

public class Tarea7 {
    public static void main(String[] args) {
        Pais pais = new Pais("Mexico", "CDMX", "America", "Español", "Peso");
        System.out.println("Detalles visitante: ");
        System.out.println(pais);
        pais.visitar();
        pais.salir();

        Giroscopio giro = new Giroscopio("Patito", "Patito", "Dorado", 22);
        System.out.println("Detalles giroscopio: ");
        System.out.println(giro);
        giro.mover();
        giro.detener();

        Computadora compu = new Computadora("Dell", "3400", "SSD", 16, "i5","16pulg","Windows");
        System.out.println("Detalles Computador: ");
        System.out.println(compu);
        compu.encender();
        compu.actualizar();
        compu.apagar();

        CuboDeRubik cubo = new CuboDeRubik("Patito",10,16);
        System.out.println("Detalles Cubo Rubik: ");
        System.out.println(cubo);
        cubo.girar();
        cubo.terminado();

        Libro libro = new Libro("MDZS","MXTX", "Danmei",1300,2,"Patito",1400.59);
        System.out.println("Detalles Libro: ");
        System.out.println(libro);
        libro.comprar();
        libro.leer();

        Balon balon = new Balon("Soccer","Patito","Sintetico",39.29,"DORADO",3.55);
        System.out.println("Detalles Balon: ");
        System.out.println(balon);
        balon.botar();
        balon.rodar();

        Lampara lamp = new Lampara("Clasico","Patito", "Multicolor",22.29,"Metalico");
        System.out.println("Detalles Lampara: ");
        System.out.println(lamp);
        lamp.encender();
        lamp.apagar();

        Gato gato = new Gato("Siames",30.45,"Pardo", 6.78,"Sociable",7);
        System.out.println("Detalles Gato: ");
        System.out.println(gato);
        gato.jugar();
        gato.comer();
        gato.dormir();

        System.out.println("Finalizado");
    }

}
