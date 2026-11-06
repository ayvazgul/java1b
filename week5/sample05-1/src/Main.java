
void main() {
    Scanner keyboard = new Scanner(System.in);

    int width;   // 가로 길이
    int height;  // 세로 길이

    char type;   // 사각형의 type (정, 직 사각형)
    int area;    // 면적

    System.out.print("사각형의 가로 길이 입력(예 5) : ");
    width = keyboard.nextInt();

    System.out.print("사각형의 세로 길이 입력(예 5) : ");
    height = keyboard.nextInt();

    type = (width == height) ? '정' : '직';
    area = width * height;

    System.out.printf("***** %c사각형 넓이 ******\n", type);
    System.out.printf("\t\t가로 길이 : %d Cm\n", width);
    System.out.printf("\t\t세로 길이 : %d Cm\n", height);
    System.out.printf("\t\t넓이      : %,d \u33A0\n", area);
}