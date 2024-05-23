package ArrayListInternalImplemmentations;

public class Main {
    public static void main(String[] args) {
//        MyArrayList<String> myArrayList = new MyArrayList<>();
//        myArrayList.add("Pavan");
//        myArrayList.add("Mahesh");
//        myArrayList.add("Rupa");
//        myArrayList.add("Uma");

        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(15);
        myArrayList.add(18);
        myArrayList.add(17);
        myArrayList.add(3);

        System.out.println("Element at index 0: " + myArrayList.get(0));
        System.out.println("Element at index 2: " + myArrayList.get(2));
        System.out.println("Element at index 1: " + myArrayList.get(1));
        System.out.println("Element at index 3: " + myArrayList.get(3));

        System.out.println("Size of the ArrayList: " + myArrayList.size());

    }
}
