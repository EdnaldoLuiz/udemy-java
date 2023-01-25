package desafio12;

public class DataTest {
	
	public static void main(String[] args101) {
		
		Data d1 = new Data();
		d1.dias = 05;
	    d1.mes = "Janeiro";
	    d1.ano = 2002;
		
		Data d2 = new Data(02, "Fevereiro", 2003);
		
		System.out.println(d1.formatar());
	    System.out.println(d2.formatar());
	}

}
