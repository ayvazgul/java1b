//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int max = Integer.MAX_VALUE;

    long a = max + 1;   // overflow
    long b = max + 1L;  // long

    System.out.printf("MAX = %d, a = %d, b = %d\n", max, a, b);
}
