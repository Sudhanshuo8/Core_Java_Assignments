class OneBHK{
    double roomArea;
    double hallArea;
    int price;

   OneBHK(){
       roomArea=100;
       hallArea=144;
       price=300000;
   }

   OneBHK(double roomArea,double hallArea,int price){
       this.roomArea=roomArea;
       this.hallArea=hallArea;
       this.price=price;
   }

   void show(){
       System.out.println("Room Area : "+roomArea+" Hall Area : "+hallArea+" price : "+price);
   }
}

class TwoBHK extends OneBHK {
   private double room2Area;

   TwoBHK(){
       room2Area=150;
   }

   TwoBHK(double roomArea,double hallArea,int price,double room2Area){
       super(roomArea,hallArea,price);
       this.room2Area=room2Area;
   }

   void show(){
       super.show();
       System.out.println(" room 2 area "+room2Area);
   }
}

class Demo1 {
   public static void main(String[] args) {
       TwoBHK t1 = new TwoBHK();
       t1.show();
       TwoBHK t2 = new TwoBHK(100,150,500000,130);
       TwoBHK t3 = new TwoBHK(200,188,700000,190);
       TwoBHK t4 = new TwoBHK(130,160,900000,150);
       t2.show();
       t3.show();
       t4.show();   
   }
}