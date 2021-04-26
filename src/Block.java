import java.util.Arrays;

public class Block {
    private int previousHash;
    private String[] transactions;
    private int blockHash;

    public Block(int previousHash, String[] transactions) {
        this.setPreviousHash(previousHash);
        this.setTransactions(transactions);

        Object[] contents = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contents);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }
}
