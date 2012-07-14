package bigTable;

public interface TableInterface {
	public Table openTable(String tableName);
	public Table newTable(String tableName);
	public Table dropTable(String tableName);
	public Table set(String key);
	public Table set(String key, long timeStamp);
	public Table delete(String key);
	public Table delete(String key, long timeStamp);
}
