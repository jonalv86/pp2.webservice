package rest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.superencasa.helpers.Constantes;
import com.superencasa.modelo.DatosTemp;
import com.superencasa.rest.RESTNotificacion;

public class RESTNotificacionTest {
	
	RESTNotificacion notificacion;
	DatosTemp dbTemp = new DatosTemp();

	@Test
	public void sincroCorrecta() {
		String actual = notificacion.sincroCorrecta();
		String esperado = Constantes.msg_sinc_ok;
		assertEquals(esperado, actual);
	}
	
	@Test
	public void sincroIncorrecta() {
		String actual = notificacion.sincroIncorrecta();
		String esperado = Constantes.msg_sinc_error;
		assertEquals(esperado, actual);
	}

}
