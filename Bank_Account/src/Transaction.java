public class Transaction {

	/*@ requires destination != null && source != null;
	  requires source != destination;
	  ensures \result ==> (\old(destination.balance) + amount == destination.balance);
	  ensures \result ==> (\old(source.balance) - amount == source.balance);
	  ensures !\result ==> (\old(destination.balance) == destination.balance);
	  ensures !\result ==> (\old(source.balance) == source.balance);
	  assignable \nothing;
	  @*/
	public boolean transfer(Account source, Account destination, int amount) {
	return true;
	}

	/*@
	  requires destination != null && source != null;
	  requires source != destination;
	  ensures \result ==> source.isLocked() && destination.isLocked();
	  assignable \nothing;
	 @*/
	private static synchronized boolean lock(Account source, Account destination) {
		
		return true;
	}
}
