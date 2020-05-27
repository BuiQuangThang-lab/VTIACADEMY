import java.util.Scanner;

public class Position {
    int positionID;
    String positionName;

    public Position() {

    }
    public Position(int positionID, String positionName) {
        this.positionID = positionID;
        this.positionName = positionName;
    }

    public int getPositionID() {
        return positionID;
    }

    public void setPositionID(int positionID) {
        this.positionID = positionID;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
    
    public void nhapPosition() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("========Nhập thông tin Position ========");
    	System.out.println("Nhập Postion id: ");
    	setPositionID(sc.nextInt());
    	sc.nextLine();
    	System.out.println("Nhập thông tin Position Name: ");
    	setPositionName(sc.nextLine());
    }
    
    public void hienPosition() {
    	System.out.println("PositionID :" + getPositionID());
    	System.out.println("PostionName: " + getPositionName());
    }
}