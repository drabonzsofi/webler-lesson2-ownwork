package hu.webler;

public class loop {

    public static void main(String[] args) {

        String[] szavak= new String[3];

        for (int i = 0; i < szavak.length; i++){
            System.out.println("for "+i);
        }

        int i = 0;
        while (i<szavak.length){

            System.out.println("while " + i);
            i++;
        }

        int j = 0;
        do {
            System.out.println("do-while " + j);
            j++;
        } while (j<5);



        int[] numbers = {1,2,8,4};
        for (int num : numbers){
            System.out.println("enchanced loop "+num);
        }


    }
}
