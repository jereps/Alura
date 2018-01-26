import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)



public class ConvertToUTMTest {

	private double latDMS;
	private double lonDMS;
	private String UTMDMS;
	public ConvertToUTMTest(double lat, double lon, String UTM ) {
		super();
		this.latDMS = lat;
		this.lonDMS = lon;
		this.UTMDMS = UTM;

		
	}
	
	
	@Parameters
	public static Collection<Object[]> carregarLatLong() {
		return Arrays.asList(
				new Object [][] {
					{37.718590,-97.426758,"14 S 638657 4175758"},
					{30.600094,-82.265625,"17 R 378670 3385966"},
					{ 0.1300  , -0.2324  ,     "30 N 808084 14385"},
					{-45.6456 ,  23.3545 ,     "34 G 683473 4942631"},
					{-12.7650 , -33.8765 ,     "25 L 404859 8588690"},
					{-80.5434 , -170.6540,     "2 C 506346 1057742"},
					{38.959409,-89.824219,     "16 S 255285 4316066"},
					{-1.010690,-67.500000,     "19 M 666906 9888250"},
					{-22.998852,-46.274414 ,   "23 K 369387 7456040"},
					{ 23.4578 , -135.4545,     "8 Q 453580 2594272"},
					{ 77.3450 ,  156.9876,     "57 X 450793 8586116"},
					{-13.453737,-57.172852,     "21 L 481290 8512680"},
					
				}
				);
	}
	
	@Test
	public void DMStoUTMTest() {
		ConvertToUTM utm = new ConvertToUTM();
		assertEquals(utm.DMStoUTM(latDMS, lonDMS),UTMDMS);
	}
	
	@Test
	public void UTMtoDMSTestLat() {
		ConvertToUTM dms = new ConvertToUTM();
		HashMap<String, Double> esperado = dms.UTMtoDMS(UTMDMS);
		Double valor = esperado.get("latitude");
		assertEquals(valor,(Double)latDMS,2);
	}
	
	@Test
	public void UTMtoDMSTestLon() {
		ConvertToUTM dms = new ConvertToUTM();
		HashMap<String, Double> esperado = dms.UTMtoDMS(UTMDMS);
		Double valor = esperado.get("longitude");
		assertEquals(valor,(Double)lonDMS,2);
	}

}
