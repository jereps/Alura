import java.util.List;

public class TestCorvert {

	public static void main(String[] args) {
		
		ConvertToUTM converter = new ConvertToUTM();
		
		String UTM = converter.DMStoUTM(30.600094,-82.265625);
		
		List<Double> latlong = converter.UTMtoDMS("17 R 378670 3385966");
		
		System.out.println(UTM);
		System.out.println(latlong);
		
	}

}
