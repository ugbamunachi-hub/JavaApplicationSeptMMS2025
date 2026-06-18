public class EnhancedForLoop2{
	public static void main(String[] args){
		String[] names = {"John","Jack","Mary","James","Lucy"};
		int[] marks = {69,80,100,70,50,45,56,56,56,,90};
				for(int mark : marks){
			System.out.printf("%d%n",mark);
		}
		
	}
}