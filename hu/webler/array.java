package hu.webler;

public class array {

    public static void main(String[] args) {

        int[] numbers = {1,200,-3,4,5};
        int[] other = new int[10];

        System.out.println("numbers hossz: " + numbers.length);
        System.out.println("Other number hossza " + other.length);

        boolean[] isValid = {true,false,true};
        String[] nevek = {"Anna","Béla","Cékla"};
        String[] tex = new String[3];
        tex[0] = "Hello";
        tex[1] = "Bello";
        tex[2] = "Szia";

        System.out.println(tex[0]+ " " + tex[1] + " " + tex[2]);
        String[] allatok = new String[3];
        allatok[0] = "+";
        allatok[1] = "!";
        allatok[2] = "?";

        int size = allatok.length;
        System.out.println(size);

        String[] array = new String[32];
        array[2] = "van érték";
        array[3] = "itt is";
        System.out.println(array[0]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[30]);

        int[] nums = new int[10];
        nums[2] = 0;
        nums[5] = 66;
        System.out.println(nums[0]);
        System.out.println(nums[2]);


    }
}
