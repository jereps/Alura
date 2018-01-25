import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)



public class ConvertToUTMTest {

	private double latDMS;
	private double lonDMS;
	private String UTMDMS;
	private String UTMconvert;
	private double UTMtoLat;
	private double UTMtoLon;
	
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
//					{ 0.1300  , -0.2324  ,     "30 N 808084 14385"},
//					{-45.6456 ,  23.3545 ,     "34 G 683473 4942631"},
//					{-12.7650 , -33.8765 ,     "25 L 404859 8588690"},
//					{-80.5434 , -170.6540,     "2 C 506346 1057742"},
//					{ 90.0000 ,  177.0000,     "60 Z 500000 9997964"},
//					{-90.0000 , -177.0000,     "1 A 500000 2035"},
//					{ 90.0000 ,   3.0000 ,     "31 Z 500000 9997964"},
//					{ 23.4578 , -135.4545,     "8 Q 453580 2594272"},
//					{ 77.3450 ,  156.9876,     "57 X 450793 8586116"},
//					{-89.3454 , -48.9306 ,     "22 A 502639 75072"},
					
				}
				);
	}
	
//	@Parameters
//	public static Collection<Object[]> carregarUTM(){
//		return Arrays.asList(
//				new Object [][] {
//					{"31 N 166021 0" , "0.0000 0.0000"},
//					{"30 N 808084 14385", "0.1300 -0.2324"},
//				}
//				);
//	}
	
	@Test
	public void DMStoUTMTest() {
		ConvertToUTM utm = new ConvertToUTM();
		assertEquals(utm.DMStoUTM(latDMS, lonDMS),UTMDMS);
	}
	
	
	
//	@Test
//	private void UTMtoDMSTest() {
//		ConvertToUTM dms = new ConvertToUTM();
//		assertEquals(dms.UTMtoDMS(UTMconvert), latlong);
//	}

}
