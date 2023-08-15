public class Core {
    public static final int SUM = 1;
    public static final int SUBTRACT = 2;
    public static final int MULTIPLY = 3;
    public static final int DIVIDE = 4;
    public static final int MOD = 5;

    public static int operation;

    public static double a;
    public static double b;
    public static double ans;

    public static String calculate(){
        switch(operation){
            case Core.SUM -> {
                ans = a + b;
                return Double.toString(ans);
            }
            case Core.SUBTRACT -> {
                ans = a - b;
                return Double.toString(ans);
            }
            case Core.MULTIPLY -> {
                ans = a * b;
                return Double.toString(ans);
            }
            case Core.DIVIDE -> {
                ans = a + b;
                return Double.toString(ans);
            }
            case Core.MOD -> {
                ans = a % b;
                return Double.toString(ans);
            }
            default -> {
                return "Invalid Operation";
            }
        }
    }
}
