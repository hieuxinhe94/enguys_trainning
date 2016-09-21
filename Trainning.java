// 

// Declare Levels of the options:
import java.util.Arrays;
import java.util.List;

public class Trainning{
static String  [] level0=  {"fit","fit_type","sleeve_cut","back_detail","yoke","tuck","placket","collar","pocket","sleeve_type",""} ;

static String  []  level1=  {" super_slim"
        ," slim"
        ," regular"
        ," full"
        ,"high"
        ," low",
        "none"
        ," dart"
        ," box_pleat_rectangle"
        ," side_pleats_wedge"
        ,"split"
        ,"regular_tucked",
        "gusset_tucked",
        "regular_untucked",
        "gusset_untucked",
        "35_double"
        ," 25_double"
        ," 35_single"
        ," 25_single"
        ,"35_french"
        ," 25_french"
        ,"35_contrast_double"
        ," 25_contrast_double"
        ," 35_concealed"
        ," 25_concealed",
        "short_regular",
        " regular",
        " long_regular"
        ," short_semi_spread"
        ," semi_spread"
        ," long_semi_spread"
        ," short_spread"
        ," spread"
        ," long_spread"
        ," short_cutaway"
        ," cutaway"
        ," long_cutaway"
        ," short_button_down"
        ," button_down"
        ," long_button_down"
        ," band"
        ," tall_band"
        ," wing"
        ," long_wing"
        ,"..."} ;

static String  [] level2 = {"back_ext","style","placket","cuff","sleeve_pleat  ","sleeve_length","stitch_style"} ;

static String [] level3 = {" straight","pointed","long","regular","short"," 1_button_round"
                ,"1_button_round_small"
                ," 2_button_round"
                ," 2_button_round_small"
                ," convertible_round"
                ," convertible_round_small"
                ," french_round"
                ," 1_button_angle"
                ," 1_button_angle_small"
                ," 2_button_angle"
                ," 2_button_angle_small"
                ," convertible_angle"
                ," convertible_angle_small"
               , " french_angle"
                ," 1_button_square"
                ," 2_button_square"
               , " french_square"
                ," portofino_round"
                ," portofino_angle"
                ," portofino_square","straight","pointed","option"} ;

static String [] level4 = {"none"
                        ,"buttoned"
                        ,"flap"} ;

static String []  level5  = {"","","","",""}; 

public static  boolean  searchKeyInArray(String[] arr,String str)
{
        
        List valid = Arrays.asList(arr);
        if(valid.contains(str)) return true;
        else return false;
        
}


public static  boolean isRootElement(String input )
{
                
        if (input.contains(".") == true ) return false;

             return true;   
}
   public static void show_result( int i2,String str)
        {
                        
                  System.out.println("level of "+str+ "  la 0->  "+i2);
                
        }
public static  void findLevelOfElement(String input)
{
                
                      if (input.contains(".") == false){System.out.print("it is root element") ;return ;}
                 
                 int l1=0,l2 = 0;   
                String str1, str2="" ;
                str1 = input.substring(0,input.indexOf(".")); //spliit by 0 to  '.' charecter
                System.out.println(str1);
                str2 = input.substring(input.indexOf(".")+1,input.length());    // split by '.' to end       
                System.out.println(str2)  ;
                while(str2.contains("."))
                {   str1 = str2.substring(0,str2.indexOf("."));
                         str2 = str2.substring(str2.indexOf(".")+1,str2.length());
                     
                }
                           
                if( searchKeyInArray(level0,str1) == true) { l1=0; if ( searchKeyInArray(level1,str2) == true) {l2=1; show_result(l2,input); return;}};
                
                if( searchKeyInArray(level1,str1) == true) { l1=1; if ( searchKeyInArray(level2,str2) == true) {l2=2; show_result(l2,input); return;}};
                
               if( searchKeyInArray(level2,str1) == true) { l1=2; if  (searchKeyInArray(level3,str2) == true) {l2=3;show_result(l2,input); return;}};
                
                if( searchKeyInArray(level3,str1) == true) { l1=3; if ( searchKeyInArray(level4,str2) == true) {l2=4;show_result(l2,input); return;}};
                
                if( searchKeyInArray(level4,str1) == true) { l1=4;l2=-1;show_result(l2,input); return;} ;              
                                
        
}

public static String primary_property[] = new String {"bar","bak","ban","foo"} ;                  //...
public Oder update_version(Oder obj,String ver,String key_miss )
{
        ver = "v2"; // default to test                        
        obj.setbak(key_miss);
        obj.setban(key_miss);
        return obj;
        
}
public void update_version(Oder obj,String ver,String [] key_miss)
{
        for (int i = 0 ; i < key_miss.length();i++)
        {
                if keymiss[i].indexOf("ban") { obj.setban(keymiss[i].substring(keymiss[i].indexOf(".")+1,key_miss.length()))} ;
                 if keymiss[i].indexOf("bak") { obj.setbak(keymiss[i].substring(keymiss[i].indexOf(".")+1,key_miss.length()))}    ;
                 // not use else    
        }
        else
        {
                update_version(obj,"v2","regular");
        }
        return obj;                        
}





public check_version()
{
                
        
}

     
public static void main (String [] args)
{
                
                // 1 .1
           System.out.print( isRootElement("fit"));
           System.out.print( isRootElement("fit.super_slim"));
           System.out.print( isRootElement("tuck.regular_tucked.back_ext"));       
                
                  
   
            boolean b=     searchKeyInArray(level0,"fit");
            System.out.println(b);

                                // 1.2
                                findLevelOfElement("fit");       
                                findLevelOfElement("tuck.regular_tucked");       
                                findLevelOfElement("tuck.regular_tucked.back_ext");       
           //2.
           Oder o = new Oder("foo1a","bar1b")           //  ver 1 
           update_version(o,"ver2","regular");                  // menthod  type 1
           update_version(o,"ver2",["bak.regular","ban.ban1a"]);                  // menthod  type 2
           
   
   
    
}
}
