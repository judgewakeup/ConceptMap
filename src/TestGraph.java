
public class TestGraph {
	
    public static void main(String[] args) {
    	
    	TestMap concept = new TestMap();
    	concept.setSize(1500,1500);
    	concept.setVisible(true);
    	
    	/* Test 1 Concepts*/
    	concept.addNode("matrix", 500, 500);
    	concept.addNode("Theorem 1.1", 550, 450); //matrix
    	concept.addNode("Theorem 1.2", 450, 450); //matrix
    	concept.addNode("vector", 500, 550); // matrix
    	concept.addNode("linear combination", 500, 600); //vector
    	concept.addNode("matrix-vector product", 600, 550); // theorem 1.1, vector
    	concept.addNode("identity matrix", 400, 500); //matrix
    	concept.addNode("Theorem 1.3", 650, 600); // matrix-vector product
    	concept.addNode("linear equation", 750, 550); //matrix-vector product
    	concept.addNode("consistent/inconsistent", 800, 600); //linear equation
    	concept.addNode("coefficient", 850, 550); //linear equation
    	concept.addNode("augmented matrix", 800, 500); //linear equation, coefficient, matrix
    	concept.addNode("elementary row operation", 850, 450); //augmented matrix
    	concept.addNode("REF/RREF", 650, 450); // elementary row operation, augmented matrix
    	concept.addNode("free/basic variables", 550, 650); //linear equation, consistent/inconsistent
    	concept.addNode("Theorem 1.4", 650, 400); //REF/RREF
    	concept.addNode("Theorem 1.5", 700, 650); //consistent/inconsistent
    	concept.addNode("span", 400, 600); //linear combination
    	concept.addNode("rank/nullity", 800, 400); //RREF
    	concept.addNode("linearly independent/depedent",350, 675); //span
    	concept.addNode("Theorem 1.8", 450, 725); //linearly independent/dependent 
    	concept.addNode("Theorem 1.9", 300, 600); //linearly independent/dependent
    	
    	concept.addEdge("matrix","Theorem 1.1");
    	concept.addEdge("matrix", "Theorem 1.2");
    	concept.addEdge("vector", "matrix");
    	concept.addEdge("linear combination", "vector");
    	concept.addEdge("matrix-vector product", "theorem 1.1");
    	concept.addEdge("matrix-vector product", "vector");
    	concept.addEdge("identity matrix", "matrix");
    	concept.addEdge("Theorem 1.3", "matrix-vector product");
    	concept.addEdge("linear equation", "matrix-vector product");
    	concept.addEdge("consistent/inconsistent", "linear equation");
    	concept.addEdge("coefficient", "linear equation");
    	concept.addEdge("augmented matrix", "coefficient");
    	concept.addEdge("augmented matrix", "linear equation");
    	concept.addEdge("elementary row operation", "augmented matrix");
    	concept.addEdge("REF/RREF", "elementary row operation");
    	concept.addEdge("free/basic variables", "linear equation");
    	concept.addEdge("Theorem 1.4", "REF/RREF");
    	concept.addEdge("Theorem 1.5", "consistent/inconsistent");
    	concept.addEdge("span", "linear combination");
    	concept.addEdge("rank/nullity", "REF/RREF");
    	concept.addEdge("linearly independent/dependent", "span");
    	concept.addEdge("Theorem 1.8", "linearly independent/dependent");
    	concept.addEdge("Theorem 1.9", "linearly independent/dependent");
    	
    	
    	/* Test 2 Concepts*/
    	concept.addNode("(matrix) product", 550, 375); //Theorem 1.1
    	concept.addNode("Theorem 2.1", 425, 375); //matrix product, identity matrix
    	concept.addNode("invertible matrix", 300, 450); //matrix product, identity matrix
    	concept.addNode("Theorem 2.2", 300, 400); //invertible matrix
    	concept.addNode("Theorem 2.3", 375, 425); //invertible matrix, matrix product
    	concept.addNode("Theorem 2.4", 300, 725); //linearly independent/independent, rank/nullity
    	concept.addNode("Theorem 2.5", 275, 500); // invertible
    	concept.addNode("Theorem 2.6", 325, 550); // invertible
    	concept.addNode("matrix transformation", 550, 325); //matrix product
    	concept.addNode("Theorem 2.7", 475, 275); // matrix transformation
    	concept.addNode("linear transformation", 600, 275); // matrix transformation,theorem 1.1
    	concept.addNode("Theorem 2.8", 650, 325); //linear transformation
    	concept.addNode("Theorem 2.9", 700, 280); // linear transformation
    	concept.addNode("onto", 625, 360); //matrix transformation
    	concept.addNode("Theorem 2.10", 750, 325); //onto, rank
    	concept.addNode("one-to-one", 450, 325); // matrix transformation
    	concept.addNode("null space", 525, 225); // matrix transformation
    	concept.addNode("Theorem 2.12", 650, 225); // linear transformation, matrix product
    	concept.addNode("Theorem 2.13", 600, 175); //linear transformation, invertible
    	concept.addNode("determinant", 575, 500); //matrix
    	concept.addNode("cofactor-expansion", 675, 500); // determinant
    	concept.addNode("Theorem 3.1", 725, 450); //cofactor-expansion
    	//t1.addNode("Thoerem 3.2", x, y); // determinant
    	concept.addNode("Theorem 3.3", 900, 400); // row operation
    	concept.addNode("Theorem 3.4", 225, 425); // invertible\
    	
    	concept.addEdge("(matrix) product", "Theorem 1.1");
    	concept.addEdge("Theorem 2.1", "(matrix) product");
    	concept.addEdge("Theorem 2.1", "identity matrix");
    	concept.addEdge("invertible matrix", "(matrix) product");
    	concept.addEdge("invertible matrix", "identity matrix");
    	concept.addEdge("Theorem 2.2", "invertible matrix");
    	concept.addEdge("Theorem 2.3", "invertible matrix");
    	concept.addEdge("Theorem 2.4", "linearly independent/independent");
    	//concept.addEdge("Theorem 2.4", "rank/nullity");
    	concept.addEdge("Theorem 2.5", "invertible matrix");
    	concept.addEdge("Theorem 2.6", "invertible matrix");
    	concept.addEdge("Theorem 2.7", "matrix transformation");
    	concept.addEdge("matrix transformation", "(matrix) product");
    	concept.addEdge("Theorem 2.8", "linear transformation");
    	concept.addEdge("Theorem 2.9", "linear transformation");
    	concept.addEdge("onto", "matrix transformation");
    	concept.addEdge("Theorem 2.10", "onto");
    	concept.addEdge("one-to-one", "matrix transformation");
    	concept.addEdge("null space", "matrix transformation");
    	concept.addEdge("Theorem 2.12", "linear transformation");
    	concept.addEdge("Theorem 2.13", "linear transformation");
    	concept.addEdge("determinant", "matrix");
    	concept.addEdge("cofactor-expansion", "determinant");
    	concept.addEdge("Theorem 3.1", "cofactor-expansion");
    	concept.addEdge("Theorem 3.3", "elementary row operation");
    	concept.addEdge("Theorem 3.4", "invertible matrix");
    	
    	/* Test 3 Concepts */
    	concept.addNode("subspace", 200, 650); //vector
    	concept.addNode("zero subspace", 200, 700); //subspace
    	concept.addNode("nonzero subspace", 100, 650); //subspace
    	concept.addNode("Theorem 4.1", 125, 600); //span
    	concept.addNode("Theorem 4.2", 200, 600); //subspace
    	concept.addNode("basis", 350, 750); //linearly independent, span
    	concept.addNode("standard basis", 300, 800); //basis
    	concept.addNode("reduction theorem", 75, 750); //nonzero subspace
    	concept.addNode("extension theorem", 175, 750); //nonzero subspace
    	concept.addNode("Theorem 4.5", 50, 600); //nonzero subspace
    	concept.addNode("dimension", 400, 800); //basis
    	concept.addNode("Theorem 4.6", 450, 850); //dimension
    	concept.addNode("Theorem 4.7", 375, 850); //dimension
    	concept.addNode("Theorem 4.8", 725, 375); //REF//REF
    	concept.addNode("Theorem 4.9", 475, 800); //dimension
    	concept.addNode("Theorem 4.10", 450, 650); // linear combination, basis
    	concept.addNode("coordinate vector", 475, 750); //basis
    	concept.addNode("Theorem 4.11", 200, 475); //  basis, invertible
    	//concept.addNode("vector space", x, y); // 
    	
    	concept.addEdge("subspace", "vector");
    	concept.addEdge("zero subspace", "subspace");
    	concept.addEdge("nonzero subspace", "subspace");
    	concept.addEdge("Theorem 4.1", "span");
    	concept.addEdge("Theorem 4.2", "subspace");
    	concept.addEdge("basis", "linearly independent/dependent");
    	concept.addEdge("basis", "span");
    	concept.addEdge("standard basis", "basis");
    	concept.addEdge("reduction theorem", "nonzero subspace");
    	concept.addEdge("extension theorem", "nonzero subspace");
    	concept.addEdge("Theorem 4.5", "nonzero subspace");
    	concept.addEdge("dimension", "basis");
    	concept.addEdge("Theorem 4.6", "dimension");
    	concept.addEdge("Theorem 4.7", "dimension");
    	concept.addEdge("Theorem 4.8", "REF/RREF");
    	concept.addEdge("Theorem 4.9", "dimension");
    	concept.addEdge("Theorem 4.10", "linear combination");
    	concept.addEdge("coordinate vector", "basis");
    	concept.addEdge("Theorem 4.11", "invertible matrix");
    	
    	
    	
    
    }
    
}