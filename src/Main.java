import java.util.ArrayList;

public class Main {

    /**
        Hash = digital signature

        Each block will have:
            - List of transactions
            - Previous hash

            Hash
     */

     ArrayList<Block> blockchain = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        /* First transaction */
        String[] genesisTransactions = {"Greg sent Edwin 10 bitcoin", "Evan sent 10 bitcoin to Edwin"};
        Block genesisBlock = new Block(0, genesisTransactions);
        System.out.println("Hash of first block: " + genesisBlock.getBlockHash());

        /* Second transaction */
        String[] block2Transactions = {"Edwin sent Greg 10 bitcoin", "Greg sent 10 bitcoin to Eva"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        System.out.println("Hash of second block: " + block2.getBlockHash());
    }
}
