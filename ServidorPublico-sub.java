package poo.p3;

public class Aluno extends Pessoa{
    private String curso;
	private int periodo;
	public String formação 
	public Aluno(double idade, int periodo) {
		super(idade); 
		System.out.println("Esse aluno ta no P" + periodo + " e é um botzin");
	}
	public Aluno() {
		super();
		System.out.println("Esse aluno ta matriculado formalmente no campus.");
	}
	public String getCurso() 
	{
		return curso;
	}
	public void setCurso(String curso) 
	{
		this.curso = curso;
	}
	public int getPeriodo() 
	{
		return periodo;
	}
	public void setPeriodo(int periodo) 
	{
		this.periodo = periodo;
	}
	
	public String infDoCurso(String infDoCurso) {
		return "Esse aluno cursa " + curso + ": " + infDoCurso;
	}
	public String periodosleft() {
		return "Falta " + (6-periodo) + " periodos para esse aluno finalizar seu curso.";
	}
 public String forma(formação){
  return "forma 1: " +this.formação+ "forma 2: " +super.formação+ "!";
}
}
