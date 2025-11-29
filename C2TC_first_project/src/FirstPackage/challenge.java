package FirstPackage;

public class challenge {
	public static void main (String[] args) {
		String[] accounts = {"Jhon", "Alice", null, "Bob"};
		int[] balances = {1000, 2000, 3000};
		
		for (int i = 0; i<=accounts.length; i++) {
			try {
			System.out.println("Account holder: "+accounts[i]);
			System.out.println("Balances: "+ balances[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
                System.out.println("--> ERROR at index " + i + ": Account name is null.");
                
            } catch (Exception e) {
                
                System.out.println("--> UNEXPECTED ERROR at index " + i + ": " + e.getMessage());
            } 
		}
		
		
		String input = "abc";
		int withdrawal = Integer.parseInt(input);
	}
}
