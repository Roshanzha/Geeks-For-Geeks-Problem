class Solution {
    public String fractionAddition(String expression) {
        int numerator = 0, denominator = 1;
        
        Pattern pattern = Pattern.compile("([+-]?\\d+)/(\\d+)");
        Matcher matcher = pattern.matcher(expression);
        
        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group(1));
            int den = Integer.parseInt(matcher.group(2));
            
            numerator = numerator * den + num * denominator;
            denominator *= den;
            
            int gcdVal = gcd(Math.abs(numerator), denominator);
            numerator /= gcdVal;
            denominator /= gcdVal;
        }
        
        return numerator + "/" + denominator;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
