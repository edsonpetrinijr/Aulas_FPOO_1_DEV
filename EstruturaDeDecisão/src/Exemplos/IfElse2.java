package Exemplos;

public class IfElse2 {
    public static void main(String[] args) {
        int temperatura = 15;
        
        if (temperatura == 15) {
            
        } else if (temperatura == 20) {
            System.out.println("Está ficando agradável");
        } else if (temperatura == 30) {
            System.out.println("Está ficando calor");
        }
        
        switch (temperatura) {
            case 15:
                System.out.println("Está ficando frio");
                break;
            case 20:
                System.out.println("Está ficando agradável");
                break;
            case 30:
                System.out.println("Está ficando calor");
            default:
                System.out.println("Não identifiquei a temperatura");
                break;
        }
    }
}
