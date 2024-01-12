abstract class Department {

    public abstract int getDepartmentSize();

}

class HRDepartment extends Department {

    @Override
    public int getDepartmentSize() {
        return 50;
    }

}

class Main {

    public static void main(String[] args) {

        HRDepartment hrDept = new HRDepartment();
        int size = hrDept.getDepartmentSize();
        System.out.println(size);

    }

}