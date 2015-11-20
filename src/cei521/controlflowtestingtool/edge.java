package cei521.controlflowtestingtool;

public class edge<L,R> { 

		  private final L left;
		  private final R right;

		  public edge(L left, R right) {
		    this.left = left;
		    this.right = right;
		  }

		  public L getLeft() { return left; }
		  public R getRight() { return right; }

		  @Override
		  public int hashCode() { return left.hashCode() ^ right.hashCode(); }

		  @Override
		  public boolean equals(Object o) {
		    if (!(o instanceof edge)) return false;
		    edge<?, ?> pairo = (edge<?, ?>) o;
		    return this.left.equals(pairo.getLeft()) &&
		           this.right.equals(pairo.getRight());
		  }

		
}
