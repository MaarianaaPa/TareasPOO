package ico.fes;
import javax.swing.*;
import java.util.Scanner;

public class Pais {
    private String pais;
    private String capital;
    private String continente;
    private String idioma;
    private String moneda;

    public Pais() {
    }

    public Pais(String pais, String capital, String continente, String idioma, String moneda) {
        this.pais = pais;
        this.capital = capital;
        this.continente = continente;
        this.idioma = idioma;
        this.moneda = moneda;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String toString() {
        return "Pais{" +
                "pais='" + pais + '\'' +
                ", capital='" + capital + '\'' +
                ", continente='" + continente + '\'' +
                ", idioma='" + idioma + '\'' +
                ", moneda='" + moneda + '\'' +
                '}';
    }
    public void visitar(){
        System.out.println("Bienvenido a: " + pais);
    }
    public void salir(){
        System.out.println("Adios");
    }

}
