package practice.chapter_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        //구구단

        for (int j = 1; j <10 ; j++ ) {

            for (int i = 2; i < 10; i++) {
                //System.out.println(i+"x"+j+"="+(i*j));
                System.out.printf("%d*%d=%2d\t", i, j, i * j);
            }System.out.println();
        }
    }
}
