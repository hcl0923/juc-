package com.kuang.demo01;

/**
 * @program: juc
 * @description:
 * @author: 作者
 * @create: 2021-07-27 09:57
 */
public class asd {


    public static void main(String[] args) {
//        int[] ints = new int[4];
//        for (int i : ints) {
//            System.out.println(i);
//        }
//
//        IntStream list = Arrays.stream(ints);
//        ints[1] = 4;
//        list.forEach(item -> {
//            System.out.println(item);
//        });

//        String[] ints = new String[4];
//        for (String i : ints) {
//            System.out.println(i);
//        }
//
//        Stream list = Arrays.stream(ints);
//        ints[1] = "fds";
//        list.forEach(item -> {
//            System.out.println(item);
//        });

//        String df = new String("dfa");
//        a i = new a();
//        List<a> li = new ArrayList<>();
//        li.add(i);
//        System.out.println(li);
//        i.i = 2;
//        i.setA(df);
//        System.out.println(li);
//        df = "dfasdf";
//        System.out.println(li);
        a a = new a();
        b b = a.b;
        b.setA("dfadfasfadfsd");
        System.out.println(a);
    }
}

class a {
    String a = "sdasd";
    int i = 0;
    b b = new b();

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "a{" +
                "a='" + a + ":" + i + ":" +
                '}';
    }
}

class b {
    String a = "sdasd";
    int i = 0;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "a{" +
                "a='" + a + ":" + i +
                '}';
    }
}
