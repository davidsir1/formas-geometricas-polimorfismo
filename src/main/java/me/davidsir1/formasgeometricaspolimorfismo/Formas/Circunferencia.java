package me.davidsir1.formasgeometricaspolimorfismo.Formas;

/**
 *
 * @author david
 */
public class Circunferencia extends FormaGeometrica {
    private double raio;

    public Circunferencia(double raio) {
        super("Circunferencia");
        if (raio > 0) {
            this.raio = raio;
        }
    }
    
    // Métodos
    public double getDiametro() {
        return 2 * raio;
    }
    
    // Getters e Setters
    public void setRaio(double raio) {
        if (raio > 0)
            this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getArea(double raio) {
        return Math.PI * (raio * raio);
    }

    public double getPerimetro(double raio) {
        return 2 * Math.PI * raio;
    }

    @Override
    public void exibirInformacao() {
        System.out.println("Informações do " + nome_forma + ":");
        System.out.printf("Raio: %.2f%n", raio);
    }
}
