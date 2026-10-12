package me.davidsir1.formasgeometricaspolimorfismo.Formas;

/**
 *
 * @author david
 */
public class Pentagono extends FormaGeometrica{
    double a, b, c, d, e; // 5 variáveis caso o pentagono seja irregular

    public Pentagono(double a, double b, double c, double d, double e) {
        super("Pentágono");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    // Métodos
    public boolean isPentagonoRegular() {
        if (a == b && a == c && a == d && a == e) {
            return true;
        } else {
            return false;
        }
    }
    
    public double getApotema() {
        if (isPentagonoRegular()) {
            return a / (2 * Math.tan(Math.toRadians(36)));
        }
        
        return 0.0f;
    }
    
    // Getters e Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {    
        this.e = e;
    }

    @Override
    public double getArea() {
        if (isPentagonoRegular()) {
            return (5.0/2) * a * getApotema();
        } else {
            return 0.0f;
        }
    }
    
    public double getArea(double apotema) {
        if (isPentagonoRegular()) {
            return (5.0/2) * a * apotema;
        } else {
            return 0.0f;
        }
    }

    @Override
    public double getPerimetro() {
        if (isPentagonoRegular()) {
            return a * 5;
        } else {
            return a + b + c + d + e;
        }
    }
    
    public double getPerimetro(double lado) {
        return lado * 5;
    }
    
    @Override
    public void exibirInformacao() {
        System.out.println("Informações do " + nome_forma + ":");
        System.out.printf("Lados: %.2f  %.2f  %.2f  %.2f  %.2f\n", a, b, c, d, e);
        System.out.println("É regular: " + (isPentagonoRegular() ? "Sim" : "Não"));
    }
}
