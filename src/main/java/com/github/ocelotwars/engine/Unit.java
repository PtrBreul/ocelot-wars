package com.github.ocelotwars.engine;

public class Unit extends Asset {

	private int id;
	private Resource load;
	private Tile tile;

	public Unit(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}

	public Position getPosition() {
		return tile.getPosition();
	}

	public Resource getLoad() {
		return load;
	}

	public void moveTo(Tile target) {
		tile.removeUnit(this);
		target.addUnit(this);
	}

	public void gather() {
		this.load = tile.removeResource();
	}

}
