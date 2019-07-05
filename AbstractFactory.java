package DesginPatterns_Factory;

public abstract class AbstractFactory {

	abstract Instances getInstance(String type);
	abstract Buttons getButton(String type);
}
