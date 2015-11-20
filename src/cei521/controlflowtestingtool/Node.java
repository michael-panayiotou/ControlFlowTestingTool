package cei521.controlflowtestingtool;

public class Node {
	 
	char type;
	String text;
	int depth;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(String mytext,char mytype,int mydepth) {
		
		setType(mytype);
		setText(mytext);
		setDepth(mydepth);
		
	}
	
	public String getText() {
		return text;
	}
	
	public char getType() {
		return type;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getDepth() {
		return depth;
	}
}
