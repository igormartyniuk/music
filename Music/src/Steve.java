
public class Steve implements Instrumentalist {

	@Override
	public void performance() {
		System.out.print("Steve plaing on the");
		Sax sax = new Sax();
		sax.play();
		Drums drums = new Drums();
		drums.play();
		Guitar guitar = new Guitar();
		guitar.play();
		
	}

}
