package linkedin.JavaObjectOrientedProgramming;

public class Main {

	public static void main(String[] args) {
		
		Tree myFavoriteOakTree = new Tree(125,5,TreeType.OAK);
		
	
		System.out.println(myFavoriteOakTree.heightMeters);
		
		if (myFavoriteOakTree.heightMeters > 100) {
			System.out.println("Thats a tall " + myFavoriteOakTree.treeType + " tree" );
		}
		

	}

}
