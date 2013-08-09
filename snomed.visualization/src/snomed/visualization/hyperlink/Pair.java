package snomed.visualization.hyperlink;

/**
 * Pair of values
 * 
 * @author Gergely Nagy <gnagy@b2international.com>
 * @author mczotter - added {@link #of(Object, Object)} static constructor and {@link #toString()} method.
 */
public class Pair<A, B> {

	private A a;
	private B b;

	public Pair() {
	}

	public Pair(A a, B b) {
		this.a = a;
		this.b = b;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	/**
	 * Creates a {@link Pair} instance from the specified A and B arguments.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static final <A, B> Pair<A, B> of(A a, B b) {
		return new Pair<A, B>(a, b);
	}
	
	@Override
	public String toString() {
		return a + "->" + b;
	}
}
