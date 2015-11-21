package cei521.controlflowtestingtool;

import java.util.ArrayList;

public class NodeGraph {

	
	ArrayList<Node> NodeList = new ArrayList<Node>();
	ArrayList<edge<Integer, Integer>> EdgeList = new ArrayList<edge<Integer, Integer>>();
	public NodeGraph() { 
		
	}

	public void add_edge(int one, int two) {
		
		edge<Integer, Integer> ed= new edge<Integer, Integer>(one,two);
		EdgeList.add(ed);
	}
	
	public void print_Nodes() {
		
		for (int i = 0; i < NodeList.size(); i++) {
			//+" "+NodeList.get(i).getDepth()
			System.out.println(i+":"+NodeList.get(i).getDepth()+" "+NodeList.get(i).getText());
		}
		
	}
	
	public void print_Edges() {
		
		System.out.println(EdgeList.size());
		for (int i = 0; i < EdgeList.size(); i++) {
			System.out.println(EdgeList.get(i).getLeft()+" "+EdgeList.get(i).getRight());
		}
		
	}
	
}
