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
		Money temp = new Money();
		temp.amount = this.amount + target.amount;
		return temp;
	}

	public Money minus(Money target) {
		Money temp = new Money();
		temp.amount = this.amount - target.amount;
		return temp;
	}

	public Money multiply(Money target) {
		Money temp = new Money();
		temp.amount = this.amount * target.amount;
		return temp;
	}

	public Money devide(Money target) {
		Money temp = new Money();
		temp.amount = this.amount / target.amount;
		return temp;
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
