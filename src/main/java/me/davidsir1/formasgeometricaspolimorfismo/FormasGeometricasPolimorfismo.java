package me.davidsir1.formasgeometricaspolimorfismo;

import java.util.ArrayList;
import me.davidsir1.formasgeometricaspolimorfismo.Formas.Circunferencia;
import me.davidsir1.formasgeometricaspolimorfismo.Formas.FormaGeometrica;
import me.davidsir1.formasgeometricaspolimorfismo.Formas.Pentagono;
import me.davidsir1.formasgeometricaspolimorfismo.Formas.Retangulo;
import me.davidsir1.formasgeometricaspolimorfismo.Formas.Triangulo;

/**
 *
 * @author david
 */
public class FormasGeometricasPolimorfismo {

    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();
        
        FormaGeometrica triangulo = new Triangulo(3, 4, 5, 3, 4);
        FormaGeometrica trianguloEquilatero = new Triangulo(5, 5, 5, 5, 4.33);
        FormaGeometrica trianguloIsosceles = new Triangulo(6, 6, 8, 8, 4.47);
        
        FormaGeometrica retangulo = new Retangulo(4, 6);
        
        FormaGeometrica pentagono = new Pentagono(5, 5, 5, 5, 5);
        FormaGeometrica pentagonoIrregular = new Pentagono(3, 4, 5, 6, 7);
        
        FormaGeometrica circunferencia = new Circunferencia(6);
        
        // Adiciona as formas na arraylist
        formas.add(triangulo);
        formas.add(trianguloEquilatero);
        formas.add(trianguloIsosceles);
        formas.add(retangulo);
        formas.add(pentagono);
        formas.add(pentagonoIrregular);
        formas.add(circunferencia);
        
        // Exibe as informações das formas
        for (FormaGeometrica forma : formas) {
            forma.exibirInformacao();
            System.out.printf("Área: %.2f\n", forma.getArea());
            System.out.printf("Perímetro: %.2f\n", forma.getPerimetro());
            System.out.println("-----------------------------------------------");
        }
        
        mostrarDiagonal(formas);
        
        mostrarTipoTriangulo(formas);
        
        mostrarDiametro(formas);
        
        mostrarApotema(formas);
    }
    
    public static void mostrarDiagonal(ArrayList<FormaGeometrica> formas) {
        for (FormaGeometrica forma : formas) {
            if (forma instanceof Retangulo) {
                Retangulo r = (Retangulo) forma;
                System.out.println("Diagonal: " + r.getDiagonal());
            }
        }
    }
    
    public static void mostrarTipoTriangulo(ArrayList<FormaGeometrica> formas) {
        for (FormaGeometrica forma : formas) {
            if (forma instanceof Triangulo) {
                Triangulo t = (Triangulo) forma;
                System.out.println("Triângulo Classificação: " + t.getTipoTriangulo());
            }
        }
    }
    
    public static void mostrarDiametro(ArrayList<FormaGeometrica> formas) {
        for (FormaGeometrica forma : formas) {
            if (forma instanceof Circunferencia) {
                Circunferencia c = (Circunferencia) forma;
                System.out.println("Diâmetro: " + c.getDiametro());
            }
        }
    }
    
    public static void mostrarApotema(ArrayList<FormaGeometrica> formas) {
        for (FormaGeometrica forma : formas) {
            if (forma instanceof Pentagono) {
                Pentagono p = (Pentagono) forma;
                System.out.println("Apotema: " + p.getApotema());
            }
        }
    }
}
