import java.util.Scanner;

class Product {
    private int pid;
    private int price;
    private int quantity;

    Product(int pid, int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    int getPrice(){
        return price*quantity;
    }
    int getPid(){
        return pid;
    }

    static int total(Product a[]){
        int sum=0;
        for(Product z:a){
            sum=sum+(z.price*z.quantity);
        }
        return sum;
    }

}

class ProDemo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Product p[]=new Product[5];
        int pid,price,quantity;
        for(int i=0;i<p.length;i++){
            System.out.print("Enter the pid : ");
            pid=sc.nextInt();
            System.out.print("Enter the price : ");
            price=sc.nextInt();
            System.out.print("Enter the quantity : ");
            quantity=sc.nextInt();
            p[i]=new Product(pid,price,quantity);
        }
        int max=p[0].getPrice();
        // 20 25 10 15 30
        int index=p[0].getPid();
        for(int i = 0;i<p.length;i++){
            if(max < p[i].getPrice()){
                max=p[i].getPrice();
                index=p[i].getPid();
            }
        }

        System.out.println("Pid of product with highest price is "+index+" and maximum price is "+max);
        System.out.println("Total amount spent on all products is "+Product.total(p));

    }
}