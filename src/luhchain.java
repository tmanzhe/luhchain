public class luhchain {

	public static void main(String[] args) {

		Block genesisBlock = new Block("Luh geeky's first block yuh", "0");
		System.out.println("hash for block 1 : " + genesisBlock.hash);
		
		Block secondBlock = new Block("Mean feen ft kranky kranky",genesisBlock.hash);
		System.out.println("hash for block 2 : " + secondBlock.hash);
		
		Block thirdBlock = new Block("Nvr again",secondBlock.hash);
		System.out.println("hash for block 3 : " + thirdBlock.hash);
	}

}
