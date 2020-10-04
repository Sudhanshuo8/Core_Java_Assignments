class Person{
    String name;
    int age;

    Person(){
        age=22;
    }

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name : "+name+" Age :"+age);
    }
}

class PerDemo1{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();
        Person p2 = new Person("Ronaldo",7); 
        p2.display();       
    }
}