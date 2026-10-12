package me.davidsir1.formasgeometricaspolimorfismo.Formas;

/**
 *
 * @author david
 */
public class Triangulo extends FormaGeometrica{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double base;
    private double altura;

    public Triangulo(double ladoA, double ladoB, double ladoC, double base, double altura) {
        super("Triangulo");
        if (isTriangulo(ladoA, ladoB, ladoC)) {
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        } else {
            this.ladoA = 0;
            this.ladoB = 0;
            this.ladoC = 0;
        }
        this.base = base;
        this.altura = altura;
    }
    
    // Métodos
    public String getTipoTriangulo() {
        if (ladoA == ladoB && ladoA == ladoC) {
            return "Triângulo Equilatero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Triângulo Isósceles";
        } else {
            return "Triângulo Escaleno";
        }
    }
    
    private boolean isTriangulo(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;
    }
    
    // Getters e Setters
    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setLadoA(double ladoA) {
        if (ladoA > 0)
            this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        if (ladoB > 0)
            this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        if (ladoC > 0)
            this.ladoC = ladoC;
    }

    public void setBase(double base) {
        if (base > 0)
            this.base = base;
    }

    public void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
    }
    
    // Sobrecarga de métodos
    @Override
    public double getArea() {
        return (base * altura) / 2;
    }
    
    public double getArea(double base, double altura) {
        return (base * altura) / 2;
    }
    
    // Pega area do triângulo equilatero
    public double getArea(double lado) {
        return ( Math.sqrt(3) / 4 ) * (lado * lado); // lado * lado = lado ^ 2
    }

    @Override
    public double getPerimetro() {
        return ladoA + ladoB + ladoC;
    }
    
    public double getPerimetro(double a, double b, double c) {
        return a + b + c;
    }

    @Override
    public void exibirInformacao() {
        System.out.println("Informações do " + nome_forma + ":");
        System.out.printf("Lados: a: %.2f  b: %.2f  c: %.2f\n", ladoA, ladoB, ladoC);
        System.out.printf("Base: %.2f\n", base);
        System.out.printf("Altura: %.2f\n", altura);
    }
}
