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
		
		String[] CorCabelo = new String[4];
		CorCabelo[1] = "L";
		CorCabelo[2] = "R";
		CorCabelo[3] = "C";
		
		int[] Idade = new int[4];
		Idade[1] = 28;
		Idade[2] = 36;
		Idade[3] = 26;
		
		double[] Altura = new double[4];
		Altura[1] = 1.81;
		Altura[2] = 1.78;
		Altura[3] = 1.69;
		
		double[] Peso = new double[4];
		Peso[1] = 80.0;
		Peso[2] = 71.0;
		Peso[3] = 55.3;
		
		System.out.println("");
		System.out.println("      Hitss Treinamento");
		System.out.println("");
		System.out.println("Listagem das Pesquisas:");
		System.out.println("");
		System.out.println("----------------------------------------------------");
		System.out.println("");
		for (int i = 1; i < 4; i++) {
			Listagem(Regiao[i], Sexo[i], Olho[i], CorCabelo[i]);
			System.out.println("Idade: " + Idade[i] + " anos.");
			System.out.println("Altura: " + Altura[i]);
			System.out.println("Peso: " + Peso[i]);
			System.out.println("");
			System.out.println("---");
			System.out.println("");
			if (i == (4)) {
				Listagem(Regiao[i], Sexo[i], Olho[i], CorCabelo[i]);
				System.out.println("Idade: " + Idade[i] + " anos.");
				System.out.println("Altura: " + Altura[i]);
				System.out.println("Peso: " + Peso[i]);
			}
		}
		System.out.println("");
		System.out.println("----------------------------------------------------");
	
	}
	
	public static void Listagem(String regiao, String sexo, String olho, String corCabelo) {
		
		if (regiao == "RJ") {
			
			System.out.println("Região: " + regiao);
			if (sexo == "M") {
				System.out.println("Sexo: Masculino.");	
			} else {
				System.out.println("Sexo: Feminino.");	
			}
		} else if (regiao == "SP") {
			System.out.println("Região: " + regiao);
			if (sexo == "M") {
				System.out.println("Sexo: Masculino.");	
			} else {
				System.out.println("Sexo: Feminino.");	
			}
		} else {
			System.out.println("Região: " + regiao);
			if (sexo == "M") {
				System.out.println("Sexo: Masculino.");	
			} else {
				System.out.println("Sexo: Feminino.");	
			}
		}
		System.out.println("Região: " + regiao);
		if (sexo == "M") {
			System.out.println("Sexo: Masculino.");	
		} else {
			System.out.println("Sexo: Feminino.");	
		}	
		
		System.out.println("Olho: " +  olho);
		
		if (corCabelo == "L") {
			System.out.println("Cor do Cabelo: Loiro.");
		} else if (corCabelo == "C") {
			System.out.println("Cor do Cabelo: Castanho.");
		} else if (corCabelo == "P") {
			System.out.println("Cor do Cabelo: Preto.");
		} else {
			System.out.println("Cor do Cabelo: Ruivo.");
		}
	}
}	

