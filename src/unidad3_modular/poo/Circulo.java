package unidad3_modular.poo;

public class Circulo {
    private double radio;
    private String color;
    private int centroX, centroY;



    public Circulo() {
        this.radio = 2.5;
        this.color = "negro";
        this.centroX = 100;
        this.centroY = 100;
    }

    public Circulo(double v, String amarillo, int i, int i1) {
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double nuevoRadio) {
        this.radio = nuevoRadio;
    }


    public double area() {
        return Math.PI * radio * radio;
    }

    public double longitud(){
        return 2* Math.PI* radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                ", centroX=" + centroX +
                ", centroY=" + centroY +
                '}';
    }
}
