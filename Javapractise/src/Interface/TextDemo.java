package Interface;

public class TextDemo {
    public static void main(String[] args) {
        Carts c = new Carts();
        c.setName("加菲");
        c.setAge(4);
        System.out.println("名字"+c.getName()+"年龄"+c.getAge());
        Carts cc = new Carts("咪咪",2);
        System.out.println("名字"+cc.getName()+"年龄"+cc.getAge());
        cc.eating();
        System.out.println( cc.toString());
    }

}
