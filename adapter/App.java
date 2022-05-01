package adapter;

public class App {

	public static void main(String[] args) {
		
		
		System.out.println("----------Adapter----------------");
		SQLDB sqlDB =new SQL() ;
		sqlDB.query("12345678978");
		SQLDB oracleDB =new OracleAdapter() ;
		oracleDB.query("1472883993");
	}

}
