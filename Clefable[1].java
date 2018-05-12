/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongui;

/**
 *
 * @author Noona-PC
 */
public class Clefable extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 200;
	public Clefable(){
		super("Clefable ",
		      (Math.random()*1000) % (maxGroupHealth+1),8);

		this.attackSkill = PokemonSkill.getPokemonSkill("Thunder Shock");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Thunderbolt");
	}

	public void move(){
		this.run();
	}

	public void run(){
		this.reducedHealth(10);
	}

	public void walk(){
		this.reducedHealth(1);
	}
}

