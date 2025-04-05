package utilities;
public class MathUtils {
public static int max(int a, int b) {
return (a > b) ? a : b;
}
public static int min(int a, int b) {
return (a < b) ? a : b;
}
public static int square(int a) {
return a * a;
}
}
Main code:
import utilities.MathUtils;
import static utilities.MathUtils.max;
import static utilities.MathUtils.min;
import static utilities.MathUtils.square;
public class M {
public static void main(String[] args) {
int maxValue = max(5, 8);
int minValue = min(5, 8);
int squareValue = square(4);
System.out.println("Max value: " + maxValue);
System.out.println("Min value: " + minValue);
System.out.println("Square value: " + squareValue);
int maxValueNormalImport = MathUtils.max(23, 48); 
System.out.println("Max value (normal import): " + maxValueNormalImport); 
}
}
