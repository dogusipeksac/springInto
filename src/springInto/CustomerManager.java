package springInto;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDataAccessLayer customerDataAccessLayer ;
	//constractor injection
	public CustomerManager(ICustomerDataAccessLayer customerDataAccessLayer) {
		this.customerDataAccessLayer = customerDataAccessLayer;
	}
	public void add() {
		//iş kuralları
		customerDataAccessLayer.add();
	}
	//setter injection
//	public void setCustomerDataAccessLayer(ICustomerDataAccessLayer customerDataAccessLayer) {
//		this.customerDataAccessLayer = customerDataAccessLayer;
//	}
	
	
	
	
}
