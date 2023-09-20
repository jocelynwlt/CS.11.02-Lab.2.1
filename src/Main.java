public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public int add(int a, int b){
        return a+b;
    }
    
    // 2. add
    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    // 3. morningGreeting
    public String morningGreeting(String name){
        return "早上好， "+name + " !";
    }

    // 4. afternoonGreeting
    public String afternoonGreeting(String name){
        return"下午好， " + name + " !";
    }

    // 5. triple
    public String triple(String name){
        return name+name+name;
    }

    // 6. half
    public double half(double a){
        return a/2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public double roundPositiveValueToNearestInteger(double a){
        int intValue = (int)a;
        double decimalValue = intValue-a;
        if (decimalValue>=0.5){
            return a++;
        }
        return intValue;

    }

    // 8. roundNegativeValueToNearestInteger
    public double roundNegativeValueToNearestInteger(double b){
        int bInt = (int)b;
        double bDecimal = b-bInt;
        if (bDecimal <= -0.5){
            return b--;
        }
        return bInt;

    }

}
