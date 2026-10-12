package me.davidsir1.formasgeometricaspolimorfismo.Formas;

/**
 *
 * @author david
 */
public abstract class FormaGeometrica implements Exibivel{
    protected String nome_forma;

    public FormaGeometrica(String nome_forma) {
        this.nome_forma = nome_forma;
    }
    
    public abstract double getArea();
    public abstract double getPerimetro();
    
    // Getters e Setters
    public String getNomeForma() {
        return nome_forma;
    }

    @Override
    public abstract void exibirInformacao();
}
