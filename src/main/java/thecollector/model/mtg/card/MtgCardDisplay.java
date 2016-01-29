package thecollector.model.mtg.card;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * A class to represent the displayable version of an MTG card, for example
 * to populate a TableView control.
 * 
 * @author Ian Claridge
 */
public class MtgCardDisplay {
	private final StringProperty name;
	private final StringProperty setName;
	private final StringProperty type;
	private final StringProperty colour;
	private final StringProperty rarity;
	private final StringProperty multiverseId;
	
	// Constructor.
	// Initialise the member properties.
	public MtgCardDisplay() {
		this.name = new SimpleStringProperty("");
		this.setName = new SimpleStringProperty("");
		this.type = new SimpleStringProperty("");
		this.colour = new SimpleStringProperty("");
		this.rarity = new SimpleStringProperty("");
		this.multiverseId = new SimpleStringProperty("");
	}

	// Getter and setter methods.
	//
	// As the member variables are properties, they must be set as the relevant property type, e.g. StringProperty.
	
	public String getName() {
		return this.name.get();
	}
	
	public StringProperty getNameProperty() {
		return this.name;
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public String getSetName() {
		return this.setName.get();
	}
	
	public StringProperty getSetNameProperty() {
		return this.setName;
	}

	public void setSetName(String setName) {
		this.setName.set(setName);
	}

	public String getType() {
		return this.type.get();
	}

	public StringProperty getTypeProperty() {
		return this.type;
	}

	public void setType(String type) {
		this.type.set(type);
	}

	public String getColour() {
		return this.colour.get();
	}
	
	public StringProperty getColourProperty() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour.set(colour);
	}

	public String getRarity() {
		return this.rarity.get();
	}
	
	public StringProperty getRarityProperty() {
		return this.rarity;
	}

	public void setRarity(String rarity) {
		this.rarity.set(rarity);
	}

	public String getMultiverseId() {
		return this.multiverseId.get();
	}
	
	public StringProperty getMultiverseIdProperty() {
		return this.multiverseId;
	}

	public void setMultiverseId(String multiverseId) {
		this.multiverseId.set(multiverseId);
	}
	
	// Overrides
	public String toString() {
		return this.getName() + ", " + this.getSetName() + ", " + this.getType() + ", " + this.getColour() + ", " + this.getRarity() + ", " + this.getMultiverseId();
	}

}
