import java.util.Scanner;
import java.lang.Math;
public class Plana {
    float a, b, r, B, d, D;
    Scanner sc1 = new Scanner(System.in);

    public float quadrado(){
        System.out.println("///////Area do quadrado///////");
        System.out.println("Digite o tamanho da aresta:");
        a = sc1.nextFloat();
        return a*a;
    }
    public float retangulo(){
        System.out.println("///////Area do retangulo///////");
        System.out.println("Digite o tamanho da altura:");
        a = sc1.nextFloat();
        System.out.println("Digite o tamanho da base:");
        b = sc1.nextFloat();
        return a*b;
    }
    public float circulo(){
        System.out.println("///////Area do circulo///////");
        System.out.println("Digite o raio do circulo:");
        r = sc1.nextFloat();
        double areaC = (r* 2)* Math.PI;
        return (float)areaC;
    }
    public float trapezio(){
        System.out.println("///////Area do trapezio///////");
        System.out.println("Digite a base maior:");
        B = sc1.nextFloat();
        System.out.println("Digite a base menor:");
        b = sc1.nextFloat();
        System.out.println("Digite a altura:");
        a = sc1.nextFloat();
        return ((B + b)* a)/2;
    }
    public float losangulo(){
        System.out.println("///////Area do losangulo///////");
        System.out.println("Digite a diagonal maior:");
        D = sc1.nextFloat();
        System.out.println("Digite a diagonal menor:");
        d = sc1.nextFloat();
        return (D*d)/2;
    }
    public float triangulo(){
        System.out.println("///////Area do triangulo///////");
        System.out.println("Digite o tamanho da altura:");
        a = sc1.nextFloat();
        System.out.println("Digite o tamanho da base:");
        b = sc1.nextFloat();
        return (a*b)/2;
    }
    public static void main(String[] args) {
        Plana fp = new Plana();

        System.out.println("A area do quadrado é " + fp.quadrado() + "\n");
        System.out.println("A area do retangulo é " + fp.retangulo() + "\n");
        System.out.println("A area do circulo é " + fp.circulo() + "\n");
        System.out.println("A area do trapezio é " + fp.trapezio() + "\n");
        System.out.println("A area do triangulo é " + fp.triangulo() + "\n");
        System.out.println("A area do losangulo é " + fp.losangulo() + "\n");
    }


}