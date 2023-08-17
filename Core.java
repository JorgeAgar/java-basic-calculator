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

    public static long longA;
    public static long longB;
    public static long longAns;

    public static boolean aIsInteger;
    public static boolean bIsInteger;

    public static String calculate(){
        switch(operation){
            case Core.SUM -> {
                if(aIsInteger && bIsInteger){
                    longAns = longA + longB;
                    return Long.toString(longAns);
                } else if(aIsInteger && !bIsInteger){
                    ans = longA + b;
                    return Double.toString(ans);
                } else if(!aIsInteger && bIsInteger){
                    ans = a + longB;
                    return Double.toString(ans);
                } else{
                    ans = a + b;
                    return Double.toString(ans);
                }
            }

            case Core.SUBTRACT -> {
                if(aIsInteger && bIsInteger){
                    longAns = longA - longB;
                    return Long.toString(longAns);
                } else if(aIsInteger && !bIsInteger){
                    ans = longA - b;
                    return Double.toString(ans);
                } else if(!aIsInteger && bIsInteger){
                    ans = a - longB;
                    return Double.toString(ans);
                } else{
                    ans = a - b;
                    return Double.toString(ans);
                }
            }

            case Core.MULTIPLY -> {
                if(aIsInteger && bIsInteger){
                    longAns = longA * longB;
                    return Long.toString(longAns);
                } else if(aIsInteger && !bIsInteger){
                    ans = longA * b;
                    return Double.toString(ans);
                } else if(!aIsInteger && bIsInteger){
                    ans = a * longB;
                    return Double.toString(ans);
                } else{
                    ans = a * b;
                    return Double.toString(ans);
                }
            }

            case Core.DIVIDE -> {
                if(aIsInteger && bIsInteger){
                    ans = longA / b; //at least 1 has to be double
                } else if(aIsInteger && !bIsInteger){
                    ans = longA / b;
                } else if(!aIsInteger && bIsInteger){
                    ans = a / longB;
                } else{
                    ans = a / b;
                }

                if(ans == Math.floor(ans)){
                    longAns = (long)ans;
                    return Long.toString(longAns);
                } else{
                    return Double.toString(ans);
                }
            }

            case Core.MOD -> {
                if(aIsInteger && bIsInteger){
                    longAns = longA % longB;
                    return Long.toString(longAns);
                } else if(aIsInteger && !bIsInteger){
                    ans = longA % b;
                    return Double.toString(ans);
                } else if(!aIsInteger && bIsInteger){
                    ans = a % longB;
                    return Double.toString(ans);
                } else{
                    ans = a % b;
                    return Double.toString(ans);
                }
            }

            default -> {
                return "Invalid Operation";
            }
        }
    }

    public static void saveA(){
        String SdisplayedNumber = ResultPanel.resultLabel.getText().trim();

        a = Double.parseDouble(SdisplayedNumber);
        
        if(!SdisplayedNumber.contains(".")){
            longA = Long.parseLong(SdisplayedNumber);
            aIsInteger = true;
        } else if (a == Math.floor(a)){
            longA = Long.parseLong(SdisplayedNumber.substring(0, SdisplayedNumber.indexOf('.')));
            aIsInteger = true;
        } else{
            aIsInteger = false;
        }
    }

    public static void saveB(){
        String SdisplayedNumber = ResultPanel.resultLabel.getText().trim();

        b = Double.parseDouble(SdisplayedNumber);
        
        if(!SdisplayedNumber.contains(".")){
            longB = Long.parseLong(SdisplayedNumber);
            bIsInteger = true;
        } else if (b == Math.floor(b)){
            longB = Long.parseLong(SdisplayedNumber.substring(0, SdisplayedNumber.indexOf('.')));
            bIsInteger = true;
        } else{
            bIsInteger = false;
        }
    }
}
