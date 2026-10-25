public class MyClass{
public static void main(String[] args) {
        byte maxByte = 113;
        maxByte++;
        System.out.println("Overflowed byte value: " + maxByte);

        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java";

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str2 == str3: " + (str2 == str3));

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str2.equals(str3): " + str2.equals(str3));

        int[] originalArray = {13, 19, 27};
        int[] sharedArray = originalArray;

        sharedArray[0] = 69;

        System.out.println("Original Array index 0 after modifying Shared Array: " + originalArray[0]);
    }
}
