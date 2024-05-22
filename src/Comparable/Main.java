package Comparable;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static <queue> void main(String[] args) {

        Car car1 = new Car("Martin",100,1000);
        Car car2 = new Car("benz",700,10000);
        Car car3 = new Car("MG",500,7000);
        Car car4 = new Car("Audi",600,9000);
        Car car5 = new Car("Honda",400,5000);
        Car car6 = new Car("TATA",800,6000);

        Queue<Car> queue = new PriorityQueue<>();
        queue.add(car1);
        queue.add(car2);
        queue.add(car3);
        queue.add(car4);
        queue.add(car5);
        queue.add(car6);

        while (!queue.isEmpty()){
            System.out.println(queue.peek().toString());
            queue.poll();
        }

    }
}
