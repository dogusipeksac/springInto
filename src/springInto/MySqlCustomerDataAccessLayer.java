package springInto;

public class MySqlCustomerDataAccessLayer implements ICustomerDataAccessLayer{

	@Override
	public void add() {
		
		// TODO Auto-generated method stub
		System.out.println("Conneciton String"+this.connectionString);
		System.out.println("MySql veritabanına eklendi");
		
	}
	
	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
