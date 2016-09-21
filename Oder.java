
public class Oder {

	 String foo;
     String bar;
     String ban;
     String bak;
     
     public Oder()
     {}
     public Oder(String f,String bars)
     {
     //  ver 1: 
     this.foo = f;
     this.bar = bars;
        
     }
     
     
     public Oder(String f,String bars,String bans, String baks)
     {
     //  ver 2: 
             this.foo = f;
             this.bar = bars;
             this.bak = baks;
             this.ban = bans;
     }
     
	public String getFoo() {
		return foo;
	}


	public void setFoo(String foo) {
		this.foo = foo;
	}


	public String getBar() {
		return bar;
	}


	public void setBar(String bar) {
		this.bar = bar;
	}


	public String getBan() {
		return ban;
	}


	public void setBan(String ban) {
		this.ban = ban;
	}


	public String getBak() {
		return bak;
	}


	public void setBak(String bak) {
		this.bak = bak;
	}


	public static void main(String[] args) {
                System.out.print("run classes ");

		
	}
}

