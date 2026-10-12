package me.davidsir1.formasgeometricaspolimorfismo.Formas;

/**
 *
 * @author david
 */
public class Retangulo extends FormaGeometrica{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super("Retangulo");
        if (base > 0 && altura > 0) {
            this.base = base;
            this.altura = altura;
        }
    }
    
    // Métodos
    public double getDiagonal() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (base + altura);
    }

    // Sobrecarga
    public double getArea(double base, double altura) {
        return base * altura;
    }

    public double getPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    @Override
    public void exibirInformacao() {
        System.out.println("Informações do " + nome_forma + ":");
        System.out.printf("Base: %.2f", base);
        System.out.printf("Altura: %.2f", altura);
    }

    // Getters e Setters
    public double getBase() { return base; }
    public void setBase(double base) {
        if (base > 0) this.base = base;
    }

    public double getAltura() { return altura; }
    public void setAltura(double altura) {
        if (altura > 0) this.altura = altura;
    }
}
