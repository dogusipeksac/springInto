package springInto;

public class OracleCustomerDataAccessLayer implements ICustomerDataAccessLayer {
	String connectionString;
	
	public void add() {
		System.out.println("Conneciton String"+this.connectionString);
		System.out.println("\noracle veritabanına eklendi");
	}
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
			
}
