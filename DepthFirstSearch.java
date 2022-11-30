/**
 * 
 * @author Jerrin C. Redmon
 *
 */
public class DepthFirstSearch {       
	Node root;
	int traversed = 0;
	int height = 0;
	public DepthFirstSearch()
	{               
		System.out.println("Call DFS with root node to do a Depth First Search.");
	}
	
	public void DFS(Node node) {
		height = 0;
		DFS(node, 1);
	}
	
	/**
	 * Depthfirstseatch recursive algorithmn
	 * @param node the node to search
	 * @param level the current level
	 */
	public void DFS(Node node, int level) {
		traversed++;
		if (level > height) {
			height = level;
		}
		System.out.println(node.getData());
		if (node.getlChild() != null) {
			DFS(node.getlChild(), level + 1);
		}
		if (node.getrChild() != null) {
			DFS(node.getrChild(), level + 1);
		}
	}

}