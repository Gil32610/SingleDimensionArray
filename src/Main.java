public class Main {
    public static void main(String[] args) {
        SingleDimensionArray s = new SingleDimensionArray(10);
        s.insert(0,0);
        s.insert(1,9);
        s.insert(10,5);
        s.insert(1,50);
        s.insert(4,312891283);

        var firstElement = s.array[0];
        System.out.println(firstElement);
        var thirdElement = s.array[2];
        System.out.println(firstElement);
        s.traverseArray();
        s.searchInArray(9);
        s.delete(1);
        s.traverseArray();
    }
}
