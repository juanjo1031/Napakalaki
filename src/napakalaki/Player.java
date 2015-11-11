/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Player {
	
	static final int MAXLEVEL = 10;
	private String name;
	private int level;
	private boolean dead;
	private boolean canISteal;
	private Player enemy;
	private ArrayList<Treasure> visibleTreasures;
	private ArrayList<Treasure> hiddenTreasures;
	private BadConsequence pendingBadConsequence;
	
	public Player(String name){
		this.name = name;
		dead = true;
		visibleTreasures = new ArrayList<>();
		hiddenTreasures = new ArrayList<>();
		pendingBadConsequence = new BadConsequence("", 0, 0, 0);
	}
	
	public String getName(){
		return name;
	}
	
	private void bringToLife(){
		dead = true;
	}
	
	private int getCombatLevel(){
		int l = level;
		
		for (Treasure t : visibleTreasures){
			l += t.getBonus();
		}
		
		return l;
	}
	
	private void incrementLevels(int l){
		level += l;
		
		if (level > MAXLEVEL)
			level = MAXLEVEL;
	}
	
	private void decrementLevels(int l){
		level -= l;
		
		if (level < 0)
			level = 0;
	}
	
	private void setPendingBadConsequence(BadConsequence b){
		pendingBadConsequence = b;
	}
	
	private void applyPrize(Monster m){
		
	}
	
	private void applyBadConsequence(Monster m){
		
	}
	
	private boolean canMakeTreasureVisible(Treasure t){
		return false;
	}
	
	private int howManyVisibleTreasures(TreasureKind tKind){
		int treasureNumber = 0;
		
		for (Treasure t : visibleTreasures){
			if (t.getType() == tKind)
				treasureNumber++;
		}
		
		return treasureNumber;
	}
	
	private void dieIfNoTreasures(){
		if (visibleTreasures.isEmpty() && hiddenTreasures.isEmpty())
			dead = true;
	}
	
	public boolean isDead(){
		return dead;
	}
	
	public ArrayList<Treasure> getHiddenTreasures(){
		return hiddenTreasures;
	}
	
	public ArrayList<Treasure> getVisibleTreasures(){
		return visibleTreasures;
	}
	
	public CombatResult combat(Monster m){
		return CombatResult.LOSE;
	}
	
	public void makeTreasureVisible(Treasure t){
		
	}
	
	public void discardVisibleTreasure(Treasure t){
		
	}
	
	public void discardHiddenTreasure(Treasure t){
		
	}
	
	public boolean validState(){
		return pendingBadConsequence.isEmpty() && hiddenTreasures.size() <= 4;
	}
	
	public void initTreasures(){
		
	}
	
	public int getLevels(){
		return level;
	}
	
	public Treasure stealTreasure(){
		return new Treasure("", 0, null);
	}
	
	public void setEnemy(Player enemy){
		this.enemy = enemy;
	}
	
	private Treasure giveMeATreasure(){
		return new Treasure("", 0, null);
	}
	
	public boolean canISteal(){
		return canISteal;
	}
	
	private boolean canYouGiveMeATreasure(){
		return !hiddenTreasures.isEmpty();
	}
	
	private void haveStolen(){
		canISteal = false;
	}
	
	public void discardAllTreasures(){
		
	}
}
