package ex2;

public class CountingAge {

    public static void main(String[] args) {
        int[] ages = {50, 40, 27, 99, 76, 81, 29, 31, 33, 62};
        int[] ageCnt = new int[10];

        for(int i=0; i<ages.length; i++){
            int age = ages[i];
            if(age < 30) ageCnt[0]++;
            else if(age < 40) ageCnt[1]++;
            else if(age < 50) ageCnt[2]++;
            else if(age < 60) ageCnt[3]++;
            else if(age < 70) ageCnt[4]++;
            else if(age < 80) ageCnt[5]++;
            else if(age < 90) ageCnt[6]++;
            else if(age < 100) ageCnt[7]++;
        }

        int peopleNumber = ages.length;

        System.out.println("total people count = "+peopleNumber + ", 20 gen:" + ageCnt[0]);
        System.out.println("total people count = "+peopleNumber + ", 30 gen:" + ageCnt[1]);
        System.out.println("total people count = "+peopleNumber + ", 40 gen:" + ageCnt[2]);
        System.out.println("total people count = "+peopleNumber + ", 50 gen:" + ageCnt[3]);
        System.out.println("total people count = "+peopleNumber + ", 60 gen:" + ageCnt[4]);
        System.out.println("total people count = "+peopleNumber + ", 70 gen:" + ageCnt[5]);
        System.out.println("total people count = "+peopleNumber + ", 80 gen:" + ageCnt[6]);
        System.out.println("total people count = "+peopleNumber + ", 90 gen:" + ageCnt[7]);

    }

}
