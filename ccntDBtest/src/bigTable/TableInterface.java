package bigTable;

public interface TableInterface {
	public Table delete(String key);
	public Table delete(String key, long timeStamp);
	
	public Table addRow(String rowKey);
	public Table deleteRow(String rowKey);
	
	public Table addColumn(String rowKey, String ColumnKey);
	public Table deleteColumn(String rowKey, String ColumnKey);
	
	public Table set(String rowKey, String ColumnKey, String value);
	public Table set(String rowKey, String ColumnKey, String value, long timeStamp);
	public Table remove(String rowKey, String ColumnKey, long timeStamp);
	
}
