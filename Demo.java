public class Demo{
	public static void main(String[] args){
		DemoInstanceMethodInJava InstanceMethod = new DemoInstanceMethodInJava();
		
		int sum = InstanceMethod.add(200,60,30);
		System.out.printf("The sum of the number is %s%n",sum);
		
		InstanceMethod.details(40,"Emmanuel peter");
	}
}
 