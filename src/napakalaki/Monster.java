/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author dianavi
 */
public class Monster {

	private String name;
	private int combatLevel;
	private Prize prize;
	private BadConsequence badConsequence;

	public Monster(String name, int level, BadConsequence bc, Prize prize) {
		this.name = name;
		this.combatLevel = level;
		this.badConsequence = bc;
		this.prize = prize;
	}

	public String getName() {
		return name;
	}

	public int getCombatLevel() {
		return combatLevel;
	}

	@Override
	public String toString() {
		return "Name = " + name
				+ ", Level = " + Integer.toString(combatLevel)
				+ ", Prize = {" + prize.toString()
				+ "}, Bad Consequence = {" + badConsequence.toString()
				+ "}";
	}
}
