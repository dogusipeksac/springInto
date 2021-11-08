package springInto;

public class MsSqlCustomerDataAccessLayer implements ICustomerDataAccessLayer {

	@Override
	public void add() {
		System.out.println("Conneciton String"+this.connectionString);
		System.out.println("MsSql veritabanına eklendi");
		
	}
	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	

}
