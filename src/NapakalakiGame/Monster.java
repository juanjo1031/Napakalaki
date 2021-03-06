/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

/**
 *
 * @author dianavi
 */
public class Monster {

	private String name;
	private int combatLevel;
	private int levelChangeAgainstCultistPlayer;
	private Prize prize;
	private BadConsequence badConsequence;

	public Monster(String name, int level, BadConsequence bc, Prize prize) {
		this.name = name;
		this.combatLevel = level;
		this.badConsequence = bc;
		this.prize = prize;
		levelChangeAgainstCultistPlayer = 0;
	}
	
	public Monster(String name, int level, BadConsequence bc, Prize prize, int lc){
		this.name = name;
		this.combatLevel = level;
		this.badConsequence = bc;
		this.prize = prize;
		this.levelChangeAgainstCultistPlayer = lc;
	}

	public String getName() {
		return name;
	}

	public int getCombatLevel() {
		return combatLevel;
	}
	
	public int getCombatLevelAgainstCultistPlayer(){
		return combatLevel + levelChangeAgainstCultistPlayer;
	}
	
	public BadConsequence getBadConsequence(){
		return badConsequence;
	}
	
	public int getLevelsGained(){
		return prize.getLevel();
	}
	
	public int getTreasuresGained(){
		return prize.getTreasures();
	}

	@Override
	public String toString() {
		return "Nombre = " + name
				+ ", \nNivel = " + Integer.toString(combatLevel)
				+ ", \nBuen rollo = {" + prize.toString()
				+ "}, \nMal rollo = {" + badConsequence.toString()
				+ "}";
	}
}
