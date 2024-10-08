import java.util.*;
class Food
{
    private int fid;
    private String fname;
    private int price;
    private String fcatagory;

    public void setFid(int fid)
    {
        this.fid=fid;
    }
    int getFid()
    {
        return fid;
    }
    public void setFname(String fname)
    {
        this.fname=fname;
    }
    String getName()
    {
        return fname;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    int getPrice()
    {
        return price;
    }
    public void setCategory(String fcatagory)
    {
        this.fcatagory=fcatagory;
    }
    String getfcatagory()
    {
        return fcatagory;
    }
}
public class FoodApp {
     static int fc;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Food f[]=new Food[5];
       fc=f.length;
       int choice;
        do{
            System.out.println("\n1. Add Food");
            System.out.println("2. Display All Foods");
            System.out.println("3. Display Foods (Price 500-1000)");
            System.out.println("4. Search Food by ID");
            System.out.println("5. Update Food by Name");
            System.out.println("6. Delete Food by Price");
            System.out.println("7. Purchase Food");
            System.out.println("8. Display Bill");
            System.out.println("9. Display Foods (Starts with 'P' and Ends with 'A')");
            System.out.println("10. Exit");
            choice = sc.nextInt();

            switch (choice) {
               
                case 1:
                 for(int i=0;i<f.length;i++)
                 {
                    f[i]=new Food();
                    System.out.println("enter id , name , price , category  ");
                    int fid=sc.nextInt();
                    sc.nextLine();
                    String name=sc.nextLine();
                    int price=sc.nextInt();
                    sc.nextLine();
                    String catagory=sc.nextLine();
                    f[i].setFid(fid);
                    f[i].setFname(name);
                    f[i].setPrice(price);
                    f[i].setCategory(catagory);
                 }
                 break;
                 case 2:
                 System.out.println("2. Display All Foods");
                 for(int i=0;i<f.length;i++)
                 {
                    System.out.println(f[i].getFid()+"\t"+f[i].getName()+"\t"+f[i].getPrice()+"\t"+f[i].getfcatagory());
                 }
                 break;
                 case 3:
                 for(int i=0;i<f.length;i++)
                 {
                    if(f[i].getPrice()>=500 && f[i].getPrice()<=1000)
                    {
                        System.out.println(f[i].getFid()+"\t"+f[i].getName()+"\t"+f[i].getPrice()+"\t"+f[i].getfcatagory());
                    }
                 }
                 break;
                 case 4:
                 System.out.println("plz enter id for cheack");
                 int idchk=sc.nextInt();
                 boolean flag=false;
                 for(int i=0;i<f.length;i++)
                 {
                    if(f[i].getFid()==idchk)
                    {
                        flag=true;
                        break;
                    }
                 }
                 if(flag)
                 {
                    System.out.println("id found");
                 }else
                 {
                    System.out.println("id not found");
                 }
                 break;

                 case 5:
                 System.out.println("enter food name to update ");
                 String fupdate=sc.nextLine();
                 boolean flag1 =false;
                 for(int i=0;i<f.length;i++)
                 {
                    if(f[i].getName().equalsIgnoreCase(fupdate))
                    {
                        System.out.println("enter new food id");
                        int newid=sc.nextInt();
                        f[i].setFid(newid);
                        System.out.println("enter new name");
                        String newName=sc.nextLine();
                        f[i].setFname(newName);
                        System.out.println("enter new price");
                        int newPrice=sc.nextInt();
                        f[i].setPrice(newPrice);
                        System.out.println("plz enter new category");
                        String newCat=sc.nextLine();
                        f[i].setCategory(newCat);
                        flag1=true;
                        break;
                    }
                 }
                 if(!flag1)
                 {
                    System.out.println("food with name "+ fupdate+" not found");
                 }
                 break;
                 case 6:
                 System.out.println("plz enter the price for deleting the food ");
                 int del=sc.nextInt();
                 break;

                 case 7:
                 System.out.println("Food Items avilable for Purchase:");
                 System.out.println("plz enter id for purchase ");
                 int purchaseid=sc.nextInt();
                 boolean flag2=false;
                 for(int i=0;i<f.length;i++)
                 {
                      if(f[i].getFid()==purchaseid)
                      {
                        System.out.println(f[i].getFid()+"\t"+f[i].getName()+"\t"+f[i].getPrice()+"\t"+f[i].getfcatagory());
                        flag2=true;
                        System.out.println("*********: Purchase Food succesfully :*********");
                        break;
                      }
                 }
                 if(!flag2)
                 {
                    System.out.println("the given id "+purchaseid+" is not avilable for purchase");
                 }
                 
                 break;
                
                 case 8:
                 System.out.println(" *********:  plz enter below choice for bill  :********* ");
                 System.out.println("1. Bill Without GST");
                 System.out.println("2. Bill With GST");
                 int billchoice=sc.nextInt();
                 int totalBill=0;
                 int totalBillgst=0;
                 //total bill without gst
                 for(int i=0;i<f.length;i++)
                 {
                    totalBill=totalBill +f[i].getPrice(); 
                 }
                 //total bill with gst
                 for(int i=0;i<f.length;i++)
                 {
                    totalBillgst =totalBillgst +f[i].getPrice(); 
                 }
                 if(billchoice==1)
                 {
                    System.out.println("the total bill without Gst is "+totalBill);
                 }else if(billchoice==2)
                 {
                    int gst=totalBillgst*18/100;
                    System.out.println("total bill with Gst is "+(totalBillgst+gst));
                 }else
                 {
                    System.out.println("Invalid choice!");
                 }
                
                 break;
                case 9:
                boolean flag3=false;
                for(int i=0;i<f.length;i++)
                {
                    if(f[i].getName().startsWith("P") && f[i].getName().endsWith("A"))
                    {
                        System.out.println(f[i].getFid()+"\t"+f[i].getName()+"\t"+f[i].getPrice()+"\t"+f[i].getfcatagory());
                        flag3=true;
                        break;
                    }
                }
                if(!flag3)
                {
                    System.out.println("No food items found that start with 'P' and end with 'A' ");
                }
                break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }while(choice!=10);

    }
 
 }    