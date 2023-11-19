
package license;


public class exchange
{
    static int id;
    static String name;
    static String fname;
     static String pass;
     static int mobile;
    void set(int temp_id,String temp_name,int mob)
    {
        id=temp_id;
        name=temp_name;
        mobile=mob;
       // fname=temp_fname;
        //pass=temp_pass;
    }
    int get_id()
    {
        return id;
    }
    
            
    String get_name()
    {
        return name;
    }
    int mobile()
    {
        return mobile;
    }
    
    
   /* String get_fname()
    {
        return fname;
    }
    String get_pass()
    {
        return pass;
    }*/
}
