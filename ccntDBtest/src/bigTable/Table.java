package bigTable;

public class Table implements TableInterface{
	String tableName = null;
	
	private String errInfo = null;
	
	public String printErrorInfo(){
		return errInfo.toString();
	}

	@Override
	public Table openTable(String tableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table newTable(String tableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table dropTable(String tableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table set(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table delete(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table set(String key, long timeStamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table delete(String key, long timeStamp) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
