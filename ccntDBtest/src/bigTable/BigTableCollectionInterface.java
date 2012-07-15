package bigTable;

public interface BigTableCollectionInterface {
	public BigTable openBigTable(String bigTableName);
	public BigTable newBigTable(String bigTableName);
	public BigTable dropBigTable(String bigTableName);
}
