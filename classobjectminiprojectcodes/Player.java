import java.util.*;
class PlayerCrick
{
   private int id;
  private String name;
  private int run;

  public void setId(int id)
  {
    this.id=id;
  }
  int getId()
  {
        return id;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  String getName()
  {
        return name;
  }

  public void setRun(int run)
  {
    this.run=run;
  }
  int getRun()
  {
        return run;
  }

}

public class Player {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PlayerCrick p[]=new PlayerCrick[5];
        for(int i=0;i<p.length;i++)
        {
            p[i]=new PlayerCrick();
            System.out.println("plz enter set");
            String s=sc.nextLine();
            int ids=sc.nextInt();
            int r=sc.nextInt();
            p[i].setId(ids);
            p[i].setName(s);
            p[i].setRun(r);
            sc.nextLine();
        }
        System.out.println("plz enter the id for search");
        int idfind=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<p.length;i++)
        {
            if(p[i].getId()==idfind)
            {
              flag=true;
              break;
            }
        }
        if(flag)
        {
          System.out.println("the id found");
        }else
        {
          System.out.println("the id is not found");
        }
    }
}
