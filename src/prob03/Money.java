package prob03;

public class Money {

	private int amount;

	public Money(int amount) {
		super();
		this.amount = amount;
	}
	
	public Money add(Money money) {
		
		return new Money(this.amount + money.getAmount());
		
	}
	
	public Money minus(Money money) {
		
		return new Money(this.amount - money.getAmount() );
		
	}
	
	public Money multiply(Money money) {
		return new Money(this.amount * money.getAmount());
		
	}

	public Money devide(Money money) {
		
		return new Money(this.amount/money.getAmount());
		
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Money) {

			if(((Money) obj).getAmount() == this.getAmount()) return true;
			
		}
		
		return false;
	}
	
	
	

	
	
	
    
    
}
