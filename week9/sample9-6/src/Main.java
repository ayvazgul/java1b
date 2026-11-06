public static void main(String[] args) {
    int day;
    long pay = 0L;
    long temp = 0L;
    for (day = 1; true; day++)  {
        temp = (day == 1) ? 1 : temp * 2;
        pay += temp;
        System.out.printf("오늘 저축 금액 = %,10d 원,  %3d 일 = %,11d 원\n",
                temp, day, pay);
        if (pay > 100000000L)
            break;
    }
    System.out.printf(" 1억원 ....%d일 만에 달성 \n", day);
}
