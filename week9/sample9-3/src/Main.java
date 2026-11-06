

void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);

    final int START = 1;
    final int END = 100;

    int total = 0;
    int first;
    int last;

    for (int i = START; i <= END; i++) {
        total += i;
    }

    System.out.printf("%d + %d + .... + %d + %d = %,d\n",
            START, START + 1, END - 1, END, total);

    //**************************************************

    total = 0;
    while (true) {
        System.out.print("어디부터 시작할까요 ? ");
        first = keyboard.nextInt();

        System.out.print("어디까지 더할까요 ? ");
        last = keyboard.nextInt();
        if (first <= last)
            break;
        else {
            System.err.println("시작 값이(%d)는 종료 값(%d) 보다 작거나 같아야 함");
            System.in.read();
        }
    }
    for (int i = first; i <= last; i++) {
        total += i;
    }
    if (first == last) {
        System.out.printf("%d = %,d\n", first, total);

    } else if (last - first <= 3) {

        if (last - first == 1)
            System.out.printf("%d + %d = %,d\n",
                    first, last, total);

        else if (last - first == 2)
            System.out.printf("%d + %d + %d = %,d\n",
                    first, first + 1, last, total);

        else
            System.out.printf("%d + %d + %d + %d = %,d\n",
                    first, first + 1, last - 1, last, total);

    } else {
        System.out.printf("%d + %d + .... + %d + %d = %,d\n",
                first, first + 1, last - 1, last, total);
    }
}

