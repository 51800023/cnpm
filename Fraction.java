public class Fraction
{
	private int numerator;
	private int denominator;
	
	public Fraction()
	{
		this.numerator=0;
		this.denominator=0;
	}
	
	public Fraction(int numerator,int denominator)
	{
		this.numerator=numerator;
		this.denominator.denominator;
	}
	
	public Fraction add (Fraction f)
	{
		int t=this.numerator*f.denominator + this.denominator*f.numerator ;
		int m=this.denominator*f.denominator;
		Fraction kq= new Fraction(t,m);
		return kq;
	}
	
	public Fraction sub( Fraction b)
	{
		int t=this.numerator*b.denominator - this.denominator*b.numerator ;
		int m=this.denominator*b.denominator;
		Fraction kq= new Fraction(t,m);
		return kq;
	}
	
	public Fraction mul( Fraction b)
	{
		int t=this.numerator*b.numerator;
		int m=this.denominator*b.denominator;
		Fraction kq= new Fraction(t,m);
		return kq;
		
	}
	
	public Fraction div( Fraction b)
	{
		int t=this.numerator*b.denominator;
		int m=this.denominator*b.numerator;
		Fraction kq= new Fraction(t,m);
		return kq;
	}
	
	
}