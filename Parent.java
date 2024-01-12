class Parent {

    public void print() {
        System.out.println("Print from Parent");
    }

}

class Child extends Parent {

    @Override
    public void print() {
        System.out.println("Print from Child"); 
    }

}

class Main {

    public static void main(String[] args) {

        Parent obj = new Child();
        
        obj.print();

    }

}