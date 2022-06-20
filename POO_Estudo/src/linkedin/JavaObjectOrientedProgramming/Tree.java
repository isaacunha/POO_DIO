package linkedin.JavaObjectOrientedProgramming;

public class Tree {
	
	double heightMeters;
	double trunkDiameterInches;
	TreeType treeType;
	
	Tree(double heightMeters, double trunkDiameterInches, TreeType treeType){
		this.heightMeters = heightMeters;
		this.trunkDiameterInches = trunkDiameterInches;
		this.treeType = treeType;
		
	}
	
	void grow() {
		this.heightMeters = this.heightMeters + 10;
		this.trunkDiameterInches = this.trunkDiameterInches +1;
	}
	
	void annouceTallTree() {
		if (this.heightMeters > 100) {
			System.out.println("Thats a tall " + this.treeType + " tree" );
		}
		
	}
}
