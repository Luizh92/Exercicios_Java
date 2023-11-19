
public class Gerente extends Empregado {

	public String departamento;

	
	public Gerente() {
		
	}

	public String getDepartamento() {
	return this.departamento;	
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String ToString() {
		return "Gerente: "+getNome() + " Salario: " +getSalario() + " Departamento: " +getDepartamento();
	}
	
}
