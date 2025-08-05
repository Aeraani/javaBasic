package MY;

public class ControlEx1 {
    public static void main(String[] args) {
        //if else,switch case
        //국어,영어,수학,평균  평균이 60이상이고 각 과목 점수가 40이상이면 합격 아님 불합격
        int kor = 60, eng = 60, mat = 60;
        double avg = (kor + eng + mat) / 3.0;
//	 if(kor>=40&& eng>=40 && mat>=40 && avg>=60) {
//		 System.out.println("합격");
//	 }else {
//		 System.out.println(" 불합격");
//	 }
//
//
        if (kor < 40 || eng < 40 || mat < 40 || avg < 60) {
            System.out.println("불합격");
        } else {
            System.out.println(" 합격");
        }

        int sco = 9;
        switch (sco) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            default:
                System.out.println("C");


        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int evenSum = 0;//짝수합
        int oddSum = 0;//홀수합
        //int sum=0;//전체합
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            //sum=sum+i;//sum+=i;
        }
        System.out.println("evenSum=" + evenSum);
        System.out.println("oddSum=" + oddSum);
        System.out.println("sum=" + (evenSum + oddSum));

        System.out.println();

        int cnt=0;
        for (int i = 0; i <5; i++) {
            for(int j=0;j<3;j++) {
                cnt++;
            }
        }

        System.out.println("cnt="+cnt);
        System.out.println();

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println();
        System.out.println();
        
        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b < 10);

    }


}
