import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class paginateste {
	@Test
	public void testechrome() throws Exception {
		String stringPesquisa = "DevMedia | Plataforma para Programadores";
		pagina  teste= new pagina();
		boolean VALIDATE = teste.openpagechrome(stringPesquisa);
		assertEquals(true,VALIDATE);	
	}
}