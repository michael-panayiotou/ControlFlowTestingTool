package cei521.controlflowtestingtool;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Algorithm {


	public Algorithm() {
		// TODO Auto-generated constructor stub
	}



	public void algorithm(String S) {
		// TODO Auto-generated method stub
		String myNodeText = "";
		char myNodeType;
		int myNodeDepth=1;
		int maxDepth=0;
		NodeGraph NodeG = new NodeGraph();
		String rootText = "root";
		char rootType = '{';
		int rootDepth = 0;
		
		Node root=new Node(rootText,rootType,rootDepth); 
		NodeG.NodeList.add(root);
		for (int i = 0; i < S.length(); i++) {

			if(S.charAt(i)=='<')
			{
				myNodeText=myNodeText+"&lt;";
			}
			else if(S.charAt(i)=='>')
			{
				myNodeText=myNodeText+"&gt;";
			}
			else if(S.charAt(i)=='&')
			{
				myNodeText=myNodeText+"&amp;";
			}
			else if(S.charAt(i)=='\"')
			{
				myNodeText=myNodeText+"&quot;";
			}
			else if(S.charAt(i)=='\'')
			{
				myNodeText=myNodeText+"&apos;";
			}
			
			else if (S.charAt(i)!='{'&&S.charAt(i)!='}')
				myNodeText=myNodeText+S.charAt(i);

			if(S.charAt(i)=='{'||S.charAt(i)=='}'){
				myNodeText.trim();
				if(!myNodeText.isEmpty()){
					if(S.charAt(i)=='{')
					{

						myNodeType=S.charAt(i);
						Node anode=new Node(myNodeText,myNodeType,myNodeDepth); 
						NodeG.NodeList.add(anode);
						myNodeText = ""; 
						myNodeDepth+=1;

					}
					if(S.charAt(i)=='}')
					{
						myNodeType=S.charAt(i);
						Node anode=new Node(myNodeText,myNodeType,myNodeDepth); 
						NodeG.NodeList.add(anode);
						myNodeText = ""; 
						myNodeDepth-=1;
					}
					maxDepth  = NodeG.NodeList.get(NodeG.NodeList.size()-2).getDepth();


					for (int j = NodeG.NodeList.size()-2; j >= 0; j--) {
						int One=NodeG.NodeList.size()-1;
						int Two=j;

						if(NodeG.NodeList.get(One).getDepth()>=NodeG.NodeList.get(Two).getDepth()){
							NodeG.add_edge(Two,One);
							break;
						}
						if(NodeG.NodeList.get(Two).getDepth()<=maxDepth&&NodeG.NodeList.get(Two).getDepth()!=1){
							maxDepth=NodeG.NodeList.get(Two).getDepth();
							NodeG.add_edge(Two,One);
						}
						else
							maxDepth=-1;

					}
				}
				else{
					myNodeDepth--;
				}
					
			}

		}

		graphToGraphML(NodeG);
	}
	
    public void graphToGraphML(NodeGraph NodeG){
    	 	
    	String filename = graphmlInit();
    	for (int i = 0; i < NodeG.NodeList.size(); i++) {
    		addNodeToGraphml(filename, i, NodeG.NodeList.get(i).text,NodeG.NodeList.get(i).type);
    	}
    	for (int i = 0; i < NodeG.EdgeList.size(); i++) {
    		addEdgeToGraphml(filename, i, NodeG.EdgeList.get(i).getLeft(), NodeG.EdgeList.get(i).getRight());
    	}
    	graphmlFinalize(filename);
    }
    
    public String graphmlInit(){
    	String filename = "[" + new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date())  + "]" + "graph.graphml";
    	try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)))) {
    	    out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    	    out.println("<graphml xmlns=\"http://graphml.graphdrawing.org/xmlns\"");
    	    out.println("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    	    out.println("xsi:schemaLocation=\"http://graphml.graphdrawing.org/xmlns");
    	    out.println("http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd\"");
    	    out.println("xmlns:y=\"http://www.yworks.com/xml/graphml\">");
    	    out.println("<key id=\"d0\" for=\"node\" yfiles.type=\"nodegraphics\"/>");
    	    out.println("<key id=\"d1\" for=\"edge\" yfiles.type=\"edgegraphics\"/>");
    	    out.println("<graph id=\"G\" edgedefault=\"directed\">");
    	}catch (IOException e) {
    	    //exception handling left as an exercise for the reader
    		System.out.println(e);
    	}
		return filename;
    }
    
    public void graphmlFinalize(String filename){
    	try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)))) {
    	    out.println("</graph>");
    	    out.println("</graphml>");
    	}catch (IOException e) {
    	    //exception handling left as an exercise for the reader
    		System.out.println(e);
    	} 
    } 
    
    public void addNodeToGraphml(String filename, int id, String text, char type){
    	try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)))) {
    	    out.format(" <node id=\"n%d\">",id);
    	    out.println("<data key=\"d0\">");
    	    out.println("<y:ShapeNode>");
    	    out.println("<y:Geometry x=\"170.5\" y=\"-15.0\" width=\"59.0\" height=\"30.0\"/>");
    	    if(type=='{'){
    	    	out.println("<y:Fill color=\"#BFD5D5\" transparent=\"false\"/>");
    	    }
    	    else{
    	    	out.println("<y:Fill color=\"#F6CEAD\" transparent=\"false\"/>");
    	    }
    	    out.println("<y:BorderStyle type=\"line\" width=\"1.0\" color=\"#000000\"/>");
    	    out.format("<y:NodeLabel>%s</y:NodeLabel>\n",text);
    	    out.println("<y:Shape type=\"rectangle\"/>");
    	    out.println("</y:ShapeNode>");
    	    out.println("</data>");
    	    out.println("</node>");
    	    
    	}catch (IOException e) {
    	    //exception handling left as an exercise for the reader
    		System.out.println(e);
    	}
    	
    }
    
    public void addEdgeToGraphml(String filename, int edgeId, int target, int source){
    	try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)))) {
    	    out.format("<edge id=\"e%d\" source=\"n%d\" target=\"n%d\"> ",edgeId,target,source);
    	    out.println("<data key=\"d1\">");
    	    out.println("<y:PolyLineEdge>");
    	    out.println("<y:Path sx=\"0.0\" sy=\"-15.0\" tx=\"29.5\" ty=\"0.0\">");
    	    out.println("<y:Point x=\"425.0\" y=\"0.0\"/>");
    	    out.println("</y:Path>");
    	    out.println("<y:LineStyle type=\"line\" width=\"1.0\" color=\"#000000\"/>");
    	    out.println("<y:Arrows source=\"none\" target=\"standard\"/>");
    	    out.println("<y:EdgeLabel></y:EdgeLabel>");
    	    out.println("<y:BendStyle smoothed=\"false\"/>");
    	    out.println("</y:PolyLineEdge>");
    	    out.println("</data>");
    	    out.println("</edge>");
    	}catch (IOException e) {
    	    //exception handling left as an exercise for the reader
    		System.out.println(e);
    	}   	
    }
    


}
