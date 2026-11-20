//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String title1 = "어서와 JAVA는 처음이지";
    String author1 = "천인국";
    int pages1 = 230;
    float value1 = 23000.0f;

    String title2 = "쉽게배우는 자료구조";
    String author2 = "윤병로";
    int pages2 = 330;
    float value2 = 32000.0f;

    System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n",
            title1, author1, pages1, value1);
    System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
            title2, author2, pages2, value2);
}

