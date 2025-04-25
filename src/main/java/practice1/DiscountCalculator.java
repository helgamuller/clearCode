package practice1;

public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount = 0.0;
        if (isLoyalCustomer) {
            discount = calculateDiscountForLoyalCustomer(price, isFirstPurchase);
        }
        else {
             discount=calculateDiscountforNotLoyalCustomers(price, hasCoupon);
        }
        return price - discount;
    }
        public double calculateDiscountForLoyalCustomer(double price, boolean isFirstPurchase){
            double discount = 0.0;
            if (isFirstPurchase) {
                discount = price * 0.10;
            } else {
                discount = price * 0.05;
            }
            return discount;
        }

        public double calculateDiscountforNotLoyalCustomers(double price, boolean hasCoupon){
            double discount = 0;

            if (hasCoupon) {
                discount = price * 0.07;
            } else {
                discount = price * 0.02;
            }
            return discount;
        }

    public static void main(String[] args) {
        DiscountCalculator calc = new DiscountCalculator();
        double price = calc.calculateDiscount(100.0, false, true, true);
        System.out.println(price);
    }


    }

