package adapter;

public class OracleAdapter extends SQLDB{

	
	//adapter
	
	private OracleDB oracleDB;
	private String name;
	
	
	
	public OracleAdapter() {
		this.oracleDB = new OracleDB();
	}




	@Override
	public void query(String id) {
		oracleDB.query(id,name);
	}
	

	
}
