package Inheritance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Guest guest=new Guest();
guest.read();


Developer dev=new Developer();
dev.read();
dev.write();

Admin admin= new Admin();
admin.read();
admin.write();
admin.manage();
	}

}
