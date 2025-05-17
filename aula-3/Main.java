import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	float salada = 20f;
	float hamburguer = 8.50f;
	float milkshake = 10f;
	float coca = 4f;
	
	System.out.println("Insira a quantidade de dinheiro que você esta disposto a gastar");
	float dinheiro = input.nextFloat(); 
	
	System.out.println("\n Salada: "+ salada + "$");
	    System.out.println("\n Insira a quantidade de saladas desejada:");
        float quantidadeSalada = input.nextFloat() * salada;
	        
	System.out.println("\n Hamburguer: "+ hamburguer + "$");
	    System.out.println("\n Insira a quantidade de Hamburguer desejada:");
        float quantidadeHamburguer = input.nextFloat() * hamburguer;

	System.out.println("\n Coca-Cola: "+ coca + "$");
	    System.out.println("\n Insira a quantidade de Coca Cola desejada:");
        float quantidadeCoca = input.nextFloat() * coca;

	System.out.println("\n Milkshake: "+ milkshake + "$");
	    System.out.println("\n Insira a quantidade de Milkshake desejada:");
        float quantidadeMilkshake = input.nextFloat() * milkshake;
		
    float carrinho = quantidadeMilkshake + quantidadeCoca + quantidadeHamburguer + quantidadeSalada;
	
	System.out.println("A conta é de "+ carrinho + "$.");
	
	if (dinheiro > carrinho){
	    System.out.println("Bom apetite!");
	} 	
		
	else{
	    System.out.println("Você é pobre e passou fome");
	}
	
	}
}
