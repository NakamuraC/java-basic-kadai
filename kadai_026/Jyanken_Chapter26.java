package kadai_026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう/n"
				+ "グーはrockのrを入力しましょう/n"
				+ "チョキはscissorsのsを入力しましょう/n"
				+ "パーはpaperのpを入力しましょう");
		
		try(Scanner scanner = new Scanner(System.in);) {
			String myChoice = scanner.next();
			
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
	            return myChoice; // 有効な入力
	        } else {
	            System.out.println("無効な入力です。r, s, p のいずれかを入力してください。");
	            return getMyChoice(); // 再帰呼び出しで再入力を促す	
			}
			
		}catch (Exception e) {
			System.out.println("入力中にエラーが発生しました。 " + e);
            return null; // デフォルト値
			}		
		}
	
	public String getRandom() {
		ArrayList<String> jankenType = new ArrayList<>();
        jankenType.add("r");
        jankenType.add("s");
        jankenType.add("p");
        
        int randomIndex = (int)(Math.random()*3);
        String yourChoice = jankenType.get(randomIndex);
        return yourChoice;
	}
	
	public void playGame(String myChoice,String yourChoice) {
		HashMap<String, String> displayEachChoice = new HashMap<>();
		displayEachChoice.put("r","グー");
		displayEachChoice.put("s","チョキ");
		displayEachChoice.put("p","パー");
		
		String my = displayEachChoice.get(myChoice);
		String your = displayEachChoice.get(yourChoice);
		
		System.out.println("自分の手は" + my + ",対戦相手の手は" + your);
		
		if(myChoice.equals(yourChoice)) {
			System.out.println("あいこです");
		}else if
		((myChoice.equals("r") && yourChoice.equals("s")) ||
		 (myChoice.equals("s") && yourChoice.equals("p")) ||
		 (myChoice.equals("p") && yourChoice.equals("r"))){
			 System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}	
}
