package me.wavelength.baseclient.module;

import java.io.File;

import me.wavelength.baseclient.BaseClient;
import me.wavelength.baseclient.utils.Config;
import me.wavelength.baseclient.utils.Files;
import me.wavelength.baseclient.utils.Strings;

public class ModuleSettings {

	private Module module;
	private Config config;

	public ModuleSettings(Module module) {
		this.module = module;

		String path = new File(".").getAbsolutePath();

		path = (path.contains("jars") ? new File(".").getAbsolutePath().substring(0, path.length() - 2) : new File(".").getAbsolutePath());

		String clientName = BaseClient.instance.getClientName();

		Files.createRecursiveFolder(path, clientName + Strings.getSplitter() + "modules" + Strings.getSplitter() + module.getCategory().name().toLowerCase());

		this.config = new Config(path, clientName + Strings.getSplitter() + "modules" + Strings.getSplitter() + module.getCategory().toString().toLowerCase() + Strings.getSplitter() + module.getName() + ".cfg");
		config.addDefault("toggled", false);
		config.addDefault("key", module.getKey());
		config.addDefault("anticheat", module.getAntiCheat().name().toLowerCase());
		config.generateConfigs();
	}

	public Module getModule() {
		return module;
	}

	public Config getConfig() {
		return config;
	}

	public void generateConfigs() {
		config.generateConfigs();
	}

	public void addDefault(String key, String value) {
		config.addDefault(key.toLowerCase(), value);
	}

	public void addDefault(String key, boolean value) {
		config.addDefault(key.toLowerCase(), value);
	}

	public void addDefault(String key, int value) {
		config.addDefault(key.toLowerCase(), value);
	}

	public void addDefault(String key, char value) {
		config.addDefault(key.toLowerCase(), value);
	}

	public void addDefault(String key, double value) {
		config.addDefault(key.toLowerCase(), value);
	}

	public void addDefault(String key, float value) {
		config.addDefault(key.toLowerCase(), value);
	}

	public void set(String key, Object value) {
		config.set(key.toLowerCase(), value);
	}

	public void set(String key, String value) {
		config.set(key.toLowerCase(), value);
	}

	public void set(String key, boolean value) {
		config.set(key.toLowerCase(), value);
	}

	public void set(String key, int value) {
		config.set(key.toLowerCase(), value);
	}

	public void set(String key, char value) {
		config.set(key.toLowerCase(), value);
	}

	public void set(String key, double value) {
		config.set(key.toLowerCase(), value);
	}

	public void set(String key, float value) {
		config.set(key.toLowerCase(), value);
	}

	public String getString(String key) {
		return config.getString(key.toLowerCase());
	}

	public boolean getBoolean(String key) {
		return config.getBoolean(key.toLowerCase());
	}

	public double getDouble(String key) {
		return config.getDouble(key.toLowerCase());
	}

	public float getFloat(String key) {
		return config.getFloat(key.toLowerCase());
	}

	public Object getObject(String key) {
		return config.getObject(key.toLowerCase());
	}

	public int getInt(String key) {
		return config.getInt(key.toLowerCase());
	}

}