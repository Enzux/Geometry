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
        System.out.println("Digite a area da base do piramide:");
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
        System.out.println("Digite o número correspondente: \n 1 = geometria plana \n 2 = geometria espacial");
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
        System.out.println("Digite o número correspondente:\n 1 = Volume da esfera \n 2 = Area da esfera \n 3 = Volume da piramide \n 4 = Volume do prisma \n 5 = Volume do cilindro \n 6 = voltar");
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
            case 6:
                acessGe();
            break;
        }
        System.out.println("Digite 1 para continuar e 2 pra sair:");
        ch = sc1.nextInt();
        System.out.println("\n");
        if (ch == 1) {
            acessGe();
        }
        if (ch == 2){
            System.out.println("Obrigado por usar nosso programa!");
        }
    }
    
    public void acessPlana(){
        System.out.println("Escolha qual cauculo deseja fazer:");
        System.out.println("Digite o número correspondente:\n 1 = Quadrado \n 2 = Circulo \n 3 = Retangulo \n 4 = Trapézio \n 5 = Losangulo \n 6 = Triangulo \n 7 = voltar");
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
            case 7:
                acessGe();
            break;
        }
        System.out.println("Digite 1 para continuar e 2 pra sair:");
        ch = sc1.nextInt();
        System.out.println("\n");
        if (ch == 1) {
            acessGe();
        }
        if (ch == 2){
            System.out.println("Obrigado por usar nosso programa!");
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        Espacial esp = new Espacial();
        System.out.println("Bem vindo ao programa de cauculo de geometria!");
        esp.acessGe();
    }
}
