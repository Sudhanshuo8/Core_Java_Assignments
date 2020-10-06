
class Voter1{
    int voterId;
    String name;
    int age;
    public Voter(int voterId, String name, int age) {
        this.voterId = voterId;
        this.name = name;
        
        if(age <= 18)
        {
            try {
                throw new Exception("invalid age for voter");
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        else
        {
            this.age = age;
            System.out.println("voterId = "+voterId+" name = "+name+" age = "+age);
        }
    }
    
}
public class Voter1 {


public static void main(String[] args) {
    Voter v = new Voter(1,"Mohini",17);	

}

}