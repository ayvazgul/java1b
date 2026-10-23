//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int base;
    int height;
    double area;

    System.out.print("삼각형의 밑변은 ? ");
    base = keyboard.nextInt();

    System.out.print("삼각형의 높이는 ? ");
    height = keyboard.nextInt();

    area = (base * height) / 2.0;

    System.out.printf("\n\t**** 삼각형의 넓이 구하기 ****\n");
    System.out.printf("\t밑변 : %d cm\n", base);
    System.out.printf("\t높이 : %d cm\n", height);
    System.out.printf("\n\t넓이 : %.2f \u33a0\n", area);
}