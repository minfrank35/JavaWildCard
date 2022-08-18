import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        arrayTest();
//        genericTest();

        List<MyGrandParent> list = new ArrayList<>();

        printCollection2(list);

        addElement(list);
    }

    /**
     * 배열 같은경우는 공변
     */
    static void arrayTest() {
        Integer[] integers = new Integer[]{1, 2, 3};
        printArray(integers);
    }

    static void printArray(Object[] arr) {
        for (Object e : arr) {
            System.out.println(e);
        }
    }
    /**
     * 제네릭은 공변
     */
    static void genericTest() {
        List<Integer> list = Arrays.asList(1, 2, 3);
//        printCollection(list);   // 컴파일 에러 발생
    }


    static void printCollection(Collection<Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    /**
     * 와일드 카드 <?> unknown type
     * @param c
     */
    static void printCollection2(Collection<?> c) {
        for (Object e : c) {
            System.out.print(e + " ");
        }
    }

    static void addElement(Collection<? super MyParent> c) {
        c.add(new MyChild());
        c.add(new MyParent());
    }


}


class MyGrandParent {

}

class MyParent extends MyGrandParent {

}

class MyChild extends MyParent {

}