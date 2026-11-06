

void main() {

    Scanner keyboard = new Scanner(System.in);

    int price;          // 구입 가격
    char grade;         // 회원 등급
    double discount;    // 할인 가격

    String gradeTemp;
    int discountRate;

    System.out.print("구입 가격 입력 : ");
    price = keyboard.nextInt();

    System.out.print("회원 등급 입력 (VIP, GOLD, SILVER, NONE) : ");
    grade = keyboard.next().charAt(0);

    gradeTemp = grade == 'V' ? "VIP" :
            (grade == 'G' ? "GOLD" :
                    (grade == 'S' ? "SILVER" : "NONE"));

    discountRate = grade == 'V' ? 20 :
            (grade == 'G' ? 15 :
                    (grade == 'S' ? 10 : 0));

    discount = price - price * ((double) discountRate / 100);

    System.out.printf("회원 등급 : %s (%d %% 할인)\n", gradeTemp, discountRate);
    System.out.printf("할인 적용 가격 : %.0f원\n", discount);
    System.out.printf("할인 가격 : $,d 원\n", discount);


}