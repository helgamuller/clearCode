package practice_2.creational.builder.order;

import java.util.ArrayList;
import java.util.List;

public class Order{
    private List<String> goods;
    private int discount;
    private String paymentMethod;

    public Order(Builder builder){
        this.discount = builder.discount;
        this.goods = builder.goods;
        this.paymentMethod = builder.paymentMethod;
    }
    @Override
    public String toString() {
        return "Order{" +
                "goods=" + goods +
                ", discount=" + discount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
    public static class Builder{
        private List<String> goods = new ArrayList<>();
        private int discount;
        private String paymentMethod;

        public Builder addGood(String good){
            this.goods.add(good);
            return this;
        }
        public Builder setDiscount(int discount){
            this.discount = discount;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod){
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }
}