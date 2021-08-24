
public class ch44 {
	/*private int balance;
	private int account;private int charge;
	private int credit;
	private int limit;
	private String name;
	public ch44(int bal,int acc,int cha,int cre,int lim,String nam) {
		balance = bal;
		account = acc;
		charge = cha ;
		limit=lim;
		name=nam;
	}
	public void setBalance(int bal){
		balance = bal;
	}public int getBalance(){return balance;}
	
	public void setAcc(int acc){
		account = acc;
	}public int getAcc(){return account;}
	
	public void setCha(int cha){
		charge = cha;
	}public int getCh(){return charge;}
	
	public void setCr(int cre){
		credit = cre;
	}public int getCr(){return credit;}
	
	public void setLimit(int lim){
		limit = lim;
	}public int getLimit(){return limit;}
	
	public void setName(String nam){
		name= nam;
	}public String getName(){return name;}
	
	public int newBalance(){
		int newB = balance + charge - credit;
			return newB;
	}*/
	//sales commision calculator
/*	private String name;
	private int i1;
	private int i2;
	private int i3;
	private int i4;
	private int sal;
	private int quan;
	
	public ch44(String nam,int item1,int item2,int item3,int item4,int sala,int quant){
		name = nam;sal=sala;quan=quant;i1=item1;i2=item2;i3=item3;i4=item4;
	}
	
	public void setName(String nam){
		name=nam;
	}public String getName(){return name;}
	
	public void setQuan(int quant){
		quan=quant;
	}public int getQuan(){return quan;}
	
	public int Item1(){
		int t1=i1*quan;
		return t1;
	}
	
	public int Item2(){
		int t1=i2*quan;
		return t1;
	}
	
	public int Item3(){
		int t1=i3*quan;
		return t1;
	}
	
	public int Item4(){
		int t1=i4*quan;
		return t1;
	}
	
	public double salary(){
		int tot=Item1()+Item2()+Item3()+Item4();
		double per = 0.9 * tot;
		double salary=(double) sal + per;
		return salary;
	}*/
//Salary calculator	
/*	private String name;
	private int time;
	private int rate;
	
	public ch44(String names,int times,int rates){
		name=names;time=times;rate=rates;
	}
	
	public void setName(String names){
		name=names;
	}public String getName(){return name;}
	
	public void sHour(int hours){
		time=hours;
	}public int gHour(){return time;}
	
	public void sRate(int rates){
		rate= rates;
	}public int gRate(){return rate;}
	
	public double gross(){
		if (time<=40){
		double tot  = rate *time;
		return tot;}
		else
		{
			double tott=rate*time;
			double total=(3*tott)/2;
			return total;
		}
	}*/

		
	
}
