void main() {

    String[] name = {"홍길동", "이대한", "김민정", "김자바", "정자바", "홍길동" , "이대한", "김민정", "김자바", "정자바"};

    int[] kor = {90, 87, 75, 100, 100, 90, 87, 75, 100, 100};
    int[] math = {95, 90, 95, 99, 99, 95, 90, 95, 99, 99};
    int[] eng = {90, 88, 100, 100, 75, 90, 88, 100, 100, 75};

    int[] sum = new int[name.length];
    float[] avg = new float[name.length];
    int[] rank = new int[name.length];

    for (int i = 0; i < name.length; i++)
        sum[i] = kor[i] + math[i] + eng[i];

    for (int i = 0; i < name.length - 1; i++) {
        for (int j = i + 1; j < name.length; j++) {

            if (sum[i] < sum[j]) {

                String temp = name[i];
                name[i] = name[j];
                name[j] = temp;

                int test = kor[i];
                kor[i] = kor[j];
                kor[j] = test;

                test = eng[i];
                eng[i] = eng[j];
                eng[j] = test;

                test = math[i];
                math[i] = math[j];
                math[j] = test;

                test = sum[i];
                sum[i] = sum[j];
                sum[j] = test;
            }
        }
    }

    for (int i = 0; i < name.length; i++)
        avg[i] = sum[i] / 3.0f;

    for (int i = 0; i < name.length; i++)
        rank[i] = i + 1;

    for (int i = 0; i < name.length - 1; i++) {
        for (int j = i + 1; j < name.length; j++) {

            if (sum[i] == sum[j]) {
                rank[j] = rank[i];
            }
        }
    }
    System.out.println("*******************************************");
    System.out.println(" 이름   국어   수학   영어   총점   평균   등수 ");
    System.out.println("*******************************************");
    for (int i = 0; i < name.length; i++) {

        System.out.printf("%3s %3d %4d %4d %4d %7.2f %4d\n",
                name[i], kor[i], math[i], eng[i],
                sum[i], avg[i], rank[i]);
    }

}