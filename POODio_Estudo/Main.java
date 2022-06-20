package linkedin.JavaObjectOrientedProgramming;

public class Main {

	public static void main(String[] args) {
		
		Tree myFavoriteOakTree = new Tree(125,5,TreeType.OAK);
		
		Tree myFavoriteMapleTree = new Tree(90,10,TreeType.MAPLE);
	
		System.out.println(myFavoriteOakTree.heightMeters);
		
		myFavoriteOakTree.annouceTallTree();
		

	}

}
