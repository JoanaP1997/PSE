package model;
/**
 * Author Benedikt
 */

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import basic.WlangLexer;
import basic.WlangParser;

public class Main {
	public static void main(String[] args) {
		String text = "int i;"
				+ "int y = 6;"
				+ "int cnt = 0;"
				+ "i = 1;"
				+ "while (i<=y) {"
				+ " cnt = cnt + i;"
				+ "	i = i + 1;"
				+ "}"
				+ "i = 0;"
				+ "cnt = 0;"
				+ "y = 0;"
				+ "char c = 'f';"
				;
		CharStream input = CharStreams.fromString(text);
		WlangLexer lexer = new WlangLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		WlangParser parser = new WlangParser(tokens);
		
		ParseTree tree = parser.r();
		MyVisitor visitor = new MyVisitor();
		System.out.println(visitor.visit(tree));
	}

}
