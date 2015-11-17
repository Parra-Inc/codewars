public class Tests {
	public static void main(String[] args) {
		System.out.println(generator(5));
	}

	private static String generator(int n) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append(symbols.charAt((int) Math.floor(Math.random() * symbols.length())));

        return sb.toString();
    }
}