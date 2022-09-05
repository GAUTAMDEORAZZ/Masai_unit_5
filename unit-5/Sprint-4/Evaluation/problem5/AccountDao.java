package Problem2;

public interface AccountDao {
	public void save(Account account);
	public Account findById(int id) throws InvalidAccount;
	public void update(Account account) throws InvalidAccount;
	public void remove(Account account) throws InvalidAccount;
	public int withdraw(double amount, Account account) throws InsufficientBalance;
	public String deposit(double amount, Account account) throws InvalidAccount;

}
