package Factory.FactoryMethod;

import java.text.NumberFormat;

class Main {
    public static void main(String[] args) {
        // 팩토리 메서드로 구현체를 생성하여 반환
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();

        double x = 0.1;

        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));
    }
}