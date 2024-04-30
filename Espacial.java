public class Espacial extends Plana{
    float r, AbP;
    int ch;
    
    public float esferaV(){
        System.out.println("///////Volume da esfera///////");
        System.out.println("Digite o raio:");
        r = sc1.nextFloat();
        double Vcirc = (4*(r*r*r)*Math.PI)/3;
        return (float)Vcirc;
    }
    public float esferaA(){
        System.out.println("///////Area da esfera///////");
        System.out.println("Digite o raio:");
        r = sc1.nextFloat();
        double Vcirc = (4*(r*r)*Math.PI);
        return (float)Vcirc;
    }
    public float piramide(){
        System.out.println("///////Volume da piramide///////");
        System.out.println("Digite a area da base do triangulo:");
        AbP = sc1.nextFloat();
        System.out.println("Digite a altura:");
        a = sc1.nextFloat();
        return (AbP*a)/3;
    }
    public float prisma(){
        System.out.println("///////Volume do prisma///////");
        System.out.println("Digite a area da base do prisma:");
        AbP = sc1.nextFloat();
        System.out.println("Digite a altura:");
        a = sc1.nextFloat();
        return (AbP*a);
    }
    public float cilindro(){
        System.out.println("///////Volume do cilindro///////");
        System.out.println("Digite o raio da base do cilindro:");
        r = sc1.nextFloat();
        System.out.println("Digite a altura do cilindro:");
        a = sc1.nextFloat();
        double Vcilindro = (r*r)*a*Math.PI;
        return (float)Vcilindro;
    }
    
/*//////////Metodos de acesso///////////*/
    
    public void acessGe(){
        System.out.println("Digite 1 para geometria plana e 2 pra geometria espacial:");
        ch = sc1.nextInt();
        System.out.println("\n");
        if (ch == 1) {
            acessPlana();
        }
        if (ch == 2){
            acessGeome();
        }
    }
    
    public void acessGeome(){
        System.out.println("Escolha qual calculo deseja fazer!");
        System.out.println("Digite o número correspondente: 1 = Volume da esfera, 2 = Area da esfera, 3 = Volume da piramide, 4 = Volume do prisma, 5 = Volume do cilindro:");
        ch = sc1.nextInt();
        System.out.println("\n");
        switch (ch) {
            case 1:
                System.out.println("O volume da esfera é " + esferaV() + "\n");            
            break;
            case 2:
                System.out.println("A area da esfera é " + esferaA() + "\n");
            break;
            case 3:
                System.out.println("O volume da piramide é " + piramide() + "\n");
            break;
            case 4:
                System.out.println("O volume do prisma é " + prisma() + "\n");
            break;
            case 5:
                System.out.println("O volume do cilindro é " + cilindro() + "\n");
            break;
        }
        System.out.println("Digite 1 para sair e 2 pra continuar:");
        ch = sc1.nextInt();
        if (ch == 1) {
            System.out.println("Obrigado por usar nosso programa!");
        }
        if (ch == 2){
            acessGe();
        }
    }
    
    public void acessPlana(){
        System.out.println("Escolha qual cauculo deseja fazer:");
        System.out.println("Digite o número correspondente: 1 = Quadrado, 2 = Circulo, 3 = Retangulo, 4 = Trapézio, 5 = Losangulo, 6 = Triangulo:");
        ch = sc1.nextInt();
        System.out.println("\n");
        switch (ch) {
            case 1:
                System.out.println("A area do quadrado é " + quadrado() + "\n");            
            break;
            case 2:
                System.out.println("A area do circulo é " + circulo() + "\n");
            break;
            case 3:
                System.out.println("A area do retangulo é " + retangulo() + "\n");
            break;
            case 4:
                System.out.println("A area do trapezio é " + trapezio() + "\n");
            break;
            case 5:
                System.out.println("A area do losangulo é " + losangulo() + "\n");
            break;
            case 6:
                System.out.println("A area do triangulo é " + triangulo() + "\n");
            break;
        }
        System.out.println("Digite 1 para sair e 2 pra continuar:");
        ch = sc1.nextInt();
        System.out.println("\n");
        if (ch == 1) {
            System.out.println("Obrigado por usar nosso programa!");
        }
        if (ch == 2){
            acessGe();
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        Espacial esp = new Espacial();
        System.out.println("Bem vindo ao programa de cauculo de geometria!");
        esp.acessGe();
    }
}
