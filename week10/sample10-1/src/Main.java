
void main() {

    int[] score = {95, 70, 80, 75, 100};
    int total = 0;
    float avg;

    for (int i = 0; i < score.length; i++) {
        total += score[i];
    }

    avg = (float) total / score.length;

    for (int i = 0; i < score.length; i++) {
        System.out.printf("%d\n", score[i]);
    }

    System.out.printf("총점 : %d\n", total);
    System.out.printf("평균 : %.2f\n", avg);

}
