package br.edu.up;

public class Ponto {
    private double x;
    private double y;

    public Ponto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Ponto p) {
        double deltaX = p.getX() - this.x;
        double deltaY = p.getY() - this.y;

        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public double calcularDistancia(double x, double y) {
        double deltaX = x - this.x;
        double deltaY = y - this.y;

        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    @Override
    public String toString() {
        return "Ponto{" +
               "x=" + x +
               ", y=" + y +
               '}';
    }
}
