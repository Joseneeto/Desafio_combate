package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		System.out.println();
		
		Champion firstChamp = new Champion (name, life, attack, armor);

		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		System.out.println();
		
		Champion secChamp = new Champion(name, life, attack, armor);
		
		System.out.print("Quantos turnos você deseja executar? ");
		int rounds = sc.nextInt();
		System.out.println();
		
		for(int i=0; i<rounds; i++) {
			
			firstChamp.takeDamage(secChamp.getAttack());
			secChamp.takeDamage(firstChamp.getAttack());
			
			System.out.println("Resultado do turno "+ (i+1) + ":");
			System.out.println(firstChamp.status());
			System.out.println(secChamp.status());
			System.out.println();	
			
			if(firstChamp.getLife() <= 0 || secChamp.getLife() <= 0) {
				break;
			}

		}
		
		System.out.println("FIM DO COMBATE");
		
		
		
		sc.close();
	}

}
