
public class Execucao {

	public static void main(String[] args) {
		
		Gerente a = new Gerente();
		
		a.setNome("Luiz Henrique");
		a.setSalario(1050);
		a.setDepartamento("Producao");
		
		System.out.println(a.ToString());
		
	}

}
