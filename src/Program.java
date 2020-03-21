public class Program {
    public static void main(String[] args) {
        Program program = new Program();
        int[] tab = {1, 2, 3};
        System.out.println("Biger number is " + program.getBiger(tab));

    }

    public static int getBiger(int[] tab) {
        int max = tab[0];
        if (tab[1] > max) {
            max = tab[1];
            }
        if (tab[2]>max){
            max = tab[2];
        }
       /** if (tab[1]>tab[2]){
            max = tab[1];
        }else {max = tab[2];}
**/
        return max;

        }


    }
