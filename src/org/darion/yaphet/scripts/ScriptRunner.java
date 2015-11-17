package org.darion.yaphet.scripts;

import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptRunner {

	private static final String JAVA_SCRIPT = "js";

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		List<ScriptEngineFactory> factories = manager.getEngineFactories();
		for (ScriptEngineFactory factory : factories) {
			System.out.println(String.format(
					"Name: %s%nVersion: %s%nLanguage name: %s%nLanguage version: %s%nExtensions: %s%nMime types: %s%nNames: %s%n",
					factory.getEngineName(), factory.getEngineVersion(), factory.getLanguageName(),
					factory.getLanguageVersion(), factory.getExtensions(), factory.getMimeTypes(), factory.getNames()));
		}

		ScriptEngine engine = manager.getEngineByName(JAVA_SCRIPT);
		engine.eval("print('Hello Darion ~~ ')");
	}
}
