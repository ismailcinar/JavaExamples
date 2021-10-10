
public class Daire implements IShape {
	@Override
	public double alan(int r) {
		return 3.14*r*r;
	}
	
	@Override
	public double cevre(int r)
	{
		return 2*3.14*r;
	}
}
