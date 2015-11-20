package cei521.controlflowtestingtool;

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

		for (int i = 0; i < S.length(); i++) {

			if(S.charAt(i)!='{'&&S.charAt(i)!='}')
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
					maxDepth  = NodeG.NodeList.get(NodeG.NodeList.size()-1).getDepth();


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



		NodeG.print_Nodes();
		NodeG.print_Edges();

		//		list s_open.init()
		//
		//		depth = 1
		//
		//		while(true)
		//		{
		//			x,type = read_until_bracket()
		//					if (x != empty)
		//					{
		//						if (type == "{")
		//						{
		//							node = create_node(x, depth)
		//									//add_edge(s_open.last, node)
		//									s_open.append(node)
		//									depth +=1
		//
		//						}
		//						if (type == "}")
		//						{
		//							node = create_node(x, depth)
		//									s_open.append(node)
		//									depth -=1
		//						}
		//						max_depth = s_open.last-1.depth
		//								foreach(n in s_open-1; reverse=true)
		//						{
		//							if(n.depth <= node.depth)
		//							{
		//								add_edge(n, node)
		//								break
		//							}
		//							if (n.depth <= max_depth)
		//							{
		//								max_depth = n.depth
		//										add_edge(n ,node)
		//							}
		//							else
		//							{
		//								max_depth = 0
		//							}
		//
		//						}
		//					}
		//					else if (x == empty)
		//					{
		//						depth -=1
		//					}
		//		} 
	}


}
