/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class User {
    private int Cus_id;
    private int Package_id;
    private int Agent_id;
     private int PPN;
    private String name;
    private String country;
    private String gender;
    
    
    public User(int CId,int PId, int AId, String Cname ,String Ccountry ,String G, int ppn)
    {
        this.Cus_id = CId;
        this.Package_id = PId;
        this.Agent_id = AId;
        this.name = Cname;
        this.country = Ccountry;
        this.gender = G;
        this.PPN = ppn;
    }
    
    public int getCusID()
    {
        return Cus_id;
    }
    
     public int getPackID()
    {
        return Package_id;
    }
      public int getAId()
    {
        return Agent_id;
    }
       public int getPPN()
    {
        return PPN;
    }
    
    
    public String getName()
    {
        return name;
    }
    
    public String getCountry()
    {
        return country;
    }
    
    public String getGender()
    {
        return gender;
    }
}
