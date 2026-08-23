
package assignment24.methodoverloading;

public class CalculatorTest {
    public static void main(String[] args){
    Calculator calculates = new Calculator();
   calculates.calculate(12,2);
      calculates.calculate(12,2,78);
   calculates.calculate(12L,2L);
   calculates.calculate(1.12,9.2);

}
}