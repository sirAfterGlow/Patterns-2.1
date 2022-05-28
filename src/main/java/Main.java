public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Ints simpleCalc = new IntsCalculator();
        System.out.println(simpleCalc.mult(5, 15));
        System.out.println(simpleCalc.sum(5, 15));
        System.out.println(simpleCalc.pow(5, 3));
    }
}
