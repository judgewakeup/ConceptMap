import java.util.*;
import java.awt.*;
import javax.swing.*;

import Graph.Edge;
import Graph.Node;

/**
 * Class which will draw all test one nodes 
 * @author Melchor Dominguez
 * @version 1.0
 */
public class TestMap extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int width;
	private int height;
	
	ArrayList<Node> nodes;
    ArrayList<Edge> edges;
	
    /**
     * Sets the default Map Test One
     */
    public TestMap() {
    	this.setTitle("Test One Concept Map");
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	nodes = new ArrayList<>();
    	edges = new ArrayList<>();
    	width = 50;
    	height = 50;
		
	}
    
    /**
     * Adds the nodes to the graph
     * @param name - name of the node
     * @param x - x coordinate
     * @param y - y coordinate
     */
    public void addNode(String name, int x, int y) {
    	double x1= x *1.2;
    	double y1 = y*1.2;
    	int x2 = (int) x1;
    	int y2 = (int) y1;
    	nodes.add(new Node(name, x2, y2));
    	this.repaint();
    }
    
    /**
     * Adds edge that connects two nodes
     * @param i - node 1
     * @param j - node 2
     */
    public void addEdge(int i, int j) {
    	edges.add(new Edge(i,j));
    	this.repaint();
    }
    
    public void addEdge(String name1, String name2) {
    	if(isNode(name1) & isNode(name2)) {
    		edges.add(new Edge(this.getNode(name1), this.getNode(name2)));
    	}
    }
    
    public boolean isNode(String name) {
    	for(Node node: nodes) {
    		if(node.name.equals(name))
    			return true;
    	}
    	return false;
    }
    
    public int getNode(String name) {
    	for(Node node: nodes) {
    		if(node.name.equals(name))
    			return nodes.indexOf(node);
    	}
    	return -1;
    }
    
    public void paint(Graphics g) {
    	FontMetrics f = g.getFontMetrics();
    	int nodeHeight = Math.max(height,  f.getHeight());
    	
    	g.setColor(Color.black);
    	for(Edge e: edges) {
    		g.drawLine(nodes.get(e.i).x, nodes.get(e.i).y, 
    				nodes.get(e.j).x, nodes.get(e.j).y);
    	}
    	
    	for (Node n : nodes) {
    	    int nodeWidth = Math.max(width, f.stringWidth(n.name)+width/2);
    	    g.setColor(Color.white);
    	    g.fillOval(n.x-nodeWidth/2, n.y-nodeHeight/2, 
    		       nodeWidth, nodeHeight);
    	    g.setColor(Color.black);
    	    g.drawOval(n.x-nodeWidth/2, n.y-nodeHeight/2, 
    		       nodeWidth, nodeHeight);
    	    
    	    g.drawString(n.name, n.x-f.stringWidth(n.name)/2,
    			 n.y+f.getHeight()/2);
    	}
    }
}
