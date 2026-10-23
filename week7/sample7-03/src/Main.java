

void main() {
    Scanner keyboard = new Scanner(System.in);

    int score;
    String result;

    System.out.print("성적 입력 : ");
    score = keyboard.nextInt();

    if (score >= 90) {
        result = "A학점 취득 성공";
    } else {
        result = "A학점 취득 실패";
    }

    if (score >= 0 && score <= 100) {
        result += "\n감사합니다";
    } else {
        result = "ERROR : 점수는 0 ~ 100 사이";
    }

    System.out.println(result);
}