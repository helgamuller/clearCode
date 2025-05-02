package practice_2.structural.adapter.miles2km;
//В проекте есть система, которая работает с мильными единицами (например, старая система),
// но новая система должна использовать километры. Нужно создать адаптер,
// который будет преобразовывать мили в километры, чтобы новая система могла работать с ними, не изменяя её логику.
//miles*1.60934
public class Main {
        public static void main(String[] args) {
               KmSystem system = new KmSystem();
               Miles2KmAdapter adapter = new Miles2KmAdapter(100);

               double speed = system.calculateSpeed(adapter.convertMilesIntoKm(), 2);
                System.out.println(speed);
        }





}
