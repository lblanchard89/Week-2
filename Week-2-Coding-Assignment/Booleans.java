
public class Booleans {
	public static void main(String[] args) {
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		
		double costOfMilk = 2.75;
		double moneyInWallet = 87.65;
		int thirstLevel = 9;
		
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println(shouldByIcecream);
		
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println(willGoSwimming);
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println(isAGoodDay);
		
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (costOfMilk * 2));
		System.out.println(willBuyMilk);
	}
}
