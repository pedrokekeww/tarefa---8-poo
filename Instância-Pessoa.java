package poo.p3;

public class TesteSistema {
    public static void main (String[] args) {
		Aluno lorran = new Aluno();
		lorran.setNome("Arlenson");
		lorran.setSobrenome("Lorran");
		lorran.setEmail("lorran@gmail.com");
		lorran.setIdade(17);
		lorran.setSexo("homem");
		lorran.setCurso("Informática");
		lorran.setPeriodo(3);
		System.out.println("Nome: " + lorran.getNome() + "\nSobrenome: " + lorran.getSobrenome() 
			+ "\nEmail: " + lorran.getEmail() + "\nIdade: " + lorran.getIdade()
			+ "\nSexo: " + lorran.getSexo() + "\nCurso: " + lorran.getCurso() 
			+ "\nPeríodo: " + lorran.getPeriodo() );	
		System.out.println(lorran.infDoCurso("São garotos/garotas de programa."));
		System.out.println(lorran.periodosleft());
		
		ServidorPublico luan = new ServidorPublico();
		luan.setNome("Luan");
		luan.setSobrenome("Pereira");
		luan.setEmail("luan.perera@gmail.com");
		luan.setIdade(34);
		luan.setSexo("homem");
		luan.setSalario(1300);
		luan.setServiço("Cozinheiro");
		System.out.println("Nome: " + luan.getNome() + "\nSobrenome: " + luan.getSobrenome() 
				+ "\nEmail: " + luan.getEmail() + "\nIdade: " + luan.getIdade()
				+ "\nSexo: " + luan.getSexo() + "\nSalário: " + luan.getSalario() 
				+ "\nServiço: " + luan.getServiço() );
		System.out.println(luan.trabalho());
		System.out.println(luan.restoDoSalario(50, 50));
		
	}
}
