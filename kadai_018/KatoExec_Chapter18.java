package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		KatoIchiro_Chapter18 itiro = new KatoIchiro_Chapter18();
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		
		hanako.setGivenName();
		itiro.setGivenName();
		taro.setGivenName();
		
		taro.execIntroduce();
		System.out.println();
		itiro.execIntroduce();
		System.out.println();
		hanako.execIntroduce();
		
	}

}
