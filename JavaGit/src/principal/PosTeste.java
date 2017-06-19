package principal;

/**
 * @author Bruno
 * @see Git hub
 * @version 1.0
 * {@value Um teste simples}
 */
public class PosTeste {
	String nome	=	null;
	
	private void atribui(String nome){
		nome	=	"bruno";
		System.out.println(nome);
	}
	
	
	public static void main(String[] args) {
		
		PosTeste	p	=	new	PosTeste();
		p.atribui("bruno");
		
	}

}
