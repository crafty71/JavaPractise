package Interface;

public class TextDemo {
    public static void main(String[] args) {
        Carts c = new Carts();
        c.setName("�ӷ�");
        c.setAge(4);
        System.out.println("����"+c.getName()+"����"+c.getAge());
        Carts cc = new Carts("����",2);
        System.out.println("����"+cc.getName()+"����"+cc.getAge());
        cc.eating();
        System.out.println( cc.toString());
    }

}
