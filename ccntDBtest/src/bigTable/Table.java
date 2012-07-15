package bigTable;

public class Table implements TableInterface{
	String tableName = null;
	
	private String errInfo = null;
	
	public String printErrorInfo(){
		return errInfo.toString();
	}
	
	public Table(String _tableName){
		this.tableName = _tableName;
	}

	@Override
	public Table delete(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table delete(String key, long timeStamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table addRow(String rowKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table deleteRow(String rowKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table addColumn(String rowKey, String columnKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table deleteColumn(String rowKey, String columnKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table set(String rowKey, String columnKey, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table set(String rowKey, String columnKey, String value,
			long timeStamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table remove(String rowKey, String columnKey, long timeStamp) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
