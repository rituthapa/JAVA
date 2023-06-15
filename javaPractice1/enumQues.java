package javaPractice1;

public class enumQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color [] c = Color.values();
        for (Color cAll:c){
            System.out.println(cAll);
        }
		
	}

}
enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    BLACK,
    PURPLE,
    PINK
}