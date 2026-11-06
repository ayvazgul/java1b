
void main() {
    Scanner keyboard = new Scanner(System.in);
    char answer;
    String result;

    final int SIZE = 5;

    // FOR 문
    for (int i = 1; i <= SIZE; i++) {
        System.out.printf("%d번 학생 출석했나요 (Yes/No) ? ", i);
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }

        System.out.printf("%d번 학생 -> %s\n", i, result);
    }

    // WHILE 문
    int i = 1;

    while (i <= SIZE) {
        System.out.printf("%d번 학생 출석했나요 (Yes/No) ? ", i);
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }

        System.out.printf("%d번 학생 -> %s\n", i, result);
        i++;
    }

    // DO WHILE 문
    i = 1;

    do {
        System.out.printf("%d번 학생 출석했나요 (Yes/No) ? ", i);
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }

        System.out.printf("%d번 학생 -> %s\n", i, result);
        i++;

    } while (i <= SIZE);

}