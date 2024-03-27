import org.junit.Assert;
import org.junit.Test;

import br.com.rpires.TesteCliente;

public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Helena");
		cli.adicionarNome1("Helena");

		Assert.assertEquals("Helena", cli.getNome());
	}
}
