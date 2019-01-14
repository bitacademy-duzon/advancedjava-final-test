package prob03;

public class Money {

	private int amount;

	public Money() {
		this(0);
	}
	public Money(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Money add(Money target) {
		return new Money(this.amount + target.amount);
	}

	public Money minus(Money target) {
		return new Money(this.amount - target.amount);
	}

	public Money multiply(Money target) {
		return new Money(this.amount * target.amount);
	}

	public Money devide(Money target) {
		return new Money(this.amount / target.amount);
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
    
}
