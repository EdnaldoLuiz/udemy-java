package desafio12;

public class Data {

int dias;
String mes;
int ano;

Data() {
  this.dias = 1;
  this.mes = "1";
  this.ano = 1970;
}

Data(int dias, String mes, int ano) {
  this.dias = dias;
  this.mes = mes;
  this.ano = ano;
}

public String formatar() {
	return String.format("%d/%s/%d", dias, mes, ano);
}
}