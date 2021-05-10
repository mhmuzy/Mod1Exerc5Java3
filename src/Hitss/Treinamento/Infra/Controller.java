package Hitss.Treinamento.Infra;

public class Controller {
	
	public static void Play() {
		
		String[] Sexo = new String[4];
		Sexo[1] = "M";
		Sexo[2] = "F";
		Sexo[3] = "F";
		
		String[] Regiao = new String[4];
		Regiao[1] = "RJ";
		Regiao[2] = "SP";
		Regiao[3] = "Maranhão";
		
		String[] Olho = new String[4];
		Olho[1] = "Azul";
		Olho[2] = "Verde";
		Olho[3] = "Castanho";
		
		for (int i = 1; i < Regiao.length; i++) {
			Listagem(Regiao[i], Sexo[i], Olho[i]);
		}
		
	}
	
	public static void Listagem(String regiao, String sexo, String olho) {
		
		if (regiao == "RJ") {
			
			System.out.println("Região " + regiao + ":");
			if (sexo == "M") {
				System.out.println("Sexo Masculino.");	
			} else {
				System.out.println("Sexo Feminino.");	
			}
		} else if (regiao == "SP") {
			System.out.println("Região " + regiao + ":");
			if (sexo == "M") {
				System.out.println("Sexo Masculino.");	
			} else {
				System.out.println("Sexo Feminino.");	
			}
		} else {
			System.out.println("Região " + regiao + ":");
			if (sexo == "M") {
				System.out.println("Sexo Masculino.");	
			} else {
				System.out.println("Sexo Feminino.");	
			}
		}
		System.out.println("Região " + regiao + ":");
		if (sexo == "M") {
			System.out.println("Sexo Masculino.");	
		} else {
			System.out.println("Sexo Feminino.");	
		}	
		
		System.out.println("Olho: " +  olho);
	}
}	

