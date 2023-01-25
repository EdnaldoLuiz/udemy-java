package desafio11;

public class Data {

int dias;
String mes;
int ano;

public String formatar() {
	return String.format("%d/%s/%d", dias, mes, ano);
}
}