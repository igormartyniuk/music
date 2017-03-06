
public class Bob implements Instrumentalist{

	@Override
	public void performance() {
		
		System.out.print("Bob plaing on the");
		Sax sax = new Sax();
		sax.play();
		Drums drums = new Drums();
		drums.play();
		Guitar guitar = new Guitar();
		guitar.play();
	}

}
