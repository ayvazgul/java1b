//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);

    float exchange;
    int money;
    double dollar;

    System.out.print("달러에 대한 현재 환율을 입력 : ");
    exchange = keyboard.nextFloat();

    System.out.print("환전 금액을 입력 : ");
    money = keyboard.nextInt();

    dollar = money / exchange;

    System.out.printf("환율(\u20a9) %d, 금액은 %,.2f 달러(\u0024) 입니다.\n",
            money, dollar);
}