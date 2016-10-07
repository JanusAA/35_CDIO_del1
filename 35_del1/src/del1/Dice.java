package del1;

//Justins kommentardsfdsdsfsd
//test af gitkommentar fra local Nikolaj
//我的名字是冯麦龙呀哈哈哈
public class Dice {
	/**
	 * Roll a 6 sided dice returning a value between 1 and 6.
	 * @return
	 */
	public int roll() {
		// vi caster Math.random double til int. Vi adderer 1 til at starte med så randomnumber ikke kan blive 0.
		int randomnumber= (int)(Math.random()*6+1);
		return randomnumber;
		
	
	}

}
