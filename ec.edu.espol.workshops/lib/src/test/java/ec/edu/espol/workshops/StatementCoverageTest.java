

package ec.edu.espol.workshops;
import static org.junit.Assert.*;

import org.junit.Test;

public class StatementCoverageTest {

	/**
	 *  (T) No tiene licencia
	 */
	@Test
	public void testLIC01() {
	   	 CarInsurance cliente = new CarInsurance(18,"F","CASADO",false);
		 assertEquals(-1,cliente.datosValidos());
	}
	
	/**
	 *  (F) No tiene licencia
	 *  (T) Edad > 80
	 */
	
	@Test
	public void testAge() {
	   	 CarInsurance cliente = new CarInsurance(82,"F","CASADO",true);
		 assertEquals(-1,cliente.datosValidos());
	}

	
}
