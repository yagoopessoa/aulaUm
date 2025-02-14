public class MainQ4 {
    public static void main(String[] args) {

        double salarioTotal = 2200.00;
        double desconto;

        if (salarioTotal <= 900.00){
            desconto = 0;   //0%  
            System.out.println("Salário líquido: R$ " + salarioTotal + " \nIsento de imposto.");
        }
        else if (salarioTotal <= 1500.00){
            desconto = salarioTotal * 0.05; //5%
            System.out.println("Salário líquido é: R$ " + salarioTotal + " \nDesconto IR(5%):  R$ " + desconto + " \nSalário bruto: R$ " + (salarioTotal - desconto));
        }
        else if (salarioTotal <= 2500.00){
            desconto = salarioTotal * 0.10; //10%
            System.out.println("Salário líquido é: R$ " + salarioTotal + " \nDesconto IR(10%):  R$ " + desconto + " \nSalário bruto: R$ " + (salarioTotal - desconto));
        }
        else{
            desconto = salarioTotal * 0.20; //20%
            System.out.println("Salário líquido é: R$ " + salarioTotal + " \nDesconto IR(20%):  R$ " + desconto + " \nSalário bruto: R$ " + (salarioTotal - desconto));
            
        }
        
       
    }
}
