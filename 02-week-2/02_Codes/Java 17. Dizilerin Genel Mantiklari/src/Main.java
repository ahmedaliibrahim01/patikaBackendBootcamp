public class Main {
    // Array dolduran metot
    static void arrayFull(int [] array){
        for (int i = 0; i < array.length; i++){
            array[i] = (i * 2) + 2;
            System.out.println(array[i]);
        }
    }

    static void printString(String[] arrays){
        for (int i = 0; i < arrays.length; i++){
            System.out.print((i+1) + ". ");
            System.out.println(arrays[i]);
        }
    }

    static void printInt(int[] arrays){
        for (int i = 0; i < arrays.length; i++){
            System.out.println(arrays[i]);
        }
    }

    static int[] reverse(int[] list)
    {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
    public static void main(String[] args) {
        // Array sadece boyut vererek tanımmlama.
       int [] list = new int[10];
       int [] list1 = {1,2,3,4,5,6,7,8,9};
       int [] newList = reverse(list1);

       // Array boyut içeriği belirleyerek tanımlama
       String [] names = {"Ahmed", "Ali", "Ibrahim"};

       // Array içindekileri okuma
       for (int i = 0; i < names.length; i++){
           System.out.print((i+1) + ". ");
           System.out.println(names[i]);
        }

        System.out.println("=====================");

       // boş array içine doldurma
       for (int i = 0; i < list.length; i++){
           list[i] = (i * 2) + 2;
           System.out.println(list[i]);
       }
        System.out.println("=====================");
       // Metotan array doldurma
       int[] list2 = new int[10];
       arrayFull(list2);

        System.out.println("=====================");

        String[] surnames = {"Anab", "Mowliid", "Nuur", "Aadan"};
        printString(surnames);

        System.out.println("=====================");
        printInt(newList);


    }
}