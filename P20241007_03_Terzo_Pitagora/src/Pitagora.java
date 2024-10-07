
public class Pitagora {
	
	public static void main(String[] args) {
		
		float cateto1 = 45.3f;
		float cateto2 = 67.2f;
		
		float ipotenusa;
		
		ipotenusa = (float) Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
		
		float area = (float) cateto1 * cateto2 / 2;
		
		float perimetro = (float) cateto1 + cateto2 + ipotenusa;
		
		System.out.println("L'ipotenusa vale: " + ipotenusa);
		System.out.println("L'area vale: " + area);
		System.out.println("Il perimetro vale: " + perimetro);
				
	}

}
