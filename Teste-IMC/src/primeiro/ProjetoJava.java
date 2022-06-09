package primeiro;
import java.util.Scanner;

public class ProjetoJava {
	public static void main (String[] args) {
		double a1, a2, a3, media, p1, p2, p3, imc1, imc2, imc3;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a primeira altura:");
		a1 = entrada.nextDouble();
		System.out.println("Digite a segunda altura");
		a2 = entrada.nextDouble();
		System.out.println("Digite a terceira altura");
		a3 = entrada.nextDouble();
		
		media = ((a1 + a2+ a3) / 3);
		
		System.out.println("Os numeros digitados foram: " + a1 + ", " + a2 + " e " + a3);
		System.out.println("A media das alturas e: " + media);
		
		System.out.println("Agora vamos calcularo IMC das 3 pessoas!");
		System.out.println("Digite o peso da pessoa 1: ");
		p1 = entrada.nextDouble();
		System.out.println("Digite o peso da pessoa 2: ");
		p2 = entrada.nextDouble();
		System.out.println("Digite o peso da pessoa 3: ");
		p3 = entrada.nextDouble();
		
		imc1 = (p1 / (a1 * a1));
		imc2 = (p2 / (a2 * a2));
		imc3 = (p1 / (a3 * a3));
		
		System.out.println("IMC 1: " + imc1);
		System.out.println("IMC 2: " + imc2);
		System.out.println("IMC 3: "+ imc3);
		
	}
}
