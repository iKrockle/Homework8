import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 1,2
        int[] arrInt = new int[]{1, 2, 3};

        System.out.println(Arrays.toString(arrInt).replace("[","").replace("]",""));

        double[] arrDoub = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arrDoub).substring(1,Arrays.toString(arrDoub).length()-1));

        String str = "Случайный массив";
        char[] arrChar = new char[str.length()];
        for (int i=0;i<arrChar.length;i++)
        {
            arrChar[i]=str.substring(i,i+1).charAt(0);
        }

        System.out.print(arrChar[0]);
        for(int i=1;i<arrChar.length;i++) {
            System.out.print(", "+arrChar[i]);
        }

        //Больше способов вывода не придумал из простого
        System.out.println();
        System.out.println();


        //task 3
        StringBuilder out= new StringBuilder(); //чем-то напомнило clob из оракла

        for(int i=arrInt.length-1;i>=0;i--){
            out.append(arrInt[i]).append(", ");
        }
        out.delete(out.length()-", ".length(),out.length());
        System.out.println(out);

        out = new StringBuilder();
        for(int i=arrDoub.length-1;i>=0;i--){
            out.append(arrDoub[i]).append(", ");
        }
        out.delete(out.length()-", ".length(),out.length());

        System.out.println(out);

        out = new StringBuilder();

        for(int i=arrChar.length-1;i>=0;i--){
            out.append(arrChar[i]).append(", ");
        }
        out.delete(out.length()-", ".length(),out.length());
        System.out.println(out);
        System.out.println();

        //task 4
        for (int i=0;i<arrInt.length;i++){
            if (arrInt[i]%2!=0){
                arrInt[i]++;
            }
        }
        System.out.println(Arrays.toString(arrInt).substring(1,Arrays.toString(arrInt).length()-1));
    }
}