package com.example.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * An invoker is an object that knows how to execute a given command but doesn't
 * know how the command has been implemented. It only knows the command's
 * interface.
 * 
 * In our example, it becomes evident that there must be an additional component
 * responsible for invoking the command objects and executing them through the
 * commands' execute() method. This is exactly where the invoker class comes
 * into play.
 * 
 * The TextFileOperationExecutor class is just a thin layer of abstraction that
 * decouples the command objects from their consumers and calls the method
 * encapsulated within the TextFileOperation command objects.
 * 
 * @author abhinav.h.gupta
 *
 */
public class TextFileOperationCommand {
	private final List<TextFileOperation> textFileOperations = new ArrayList<>();

	public String executeOperation(TextFileOperation textFileOperation) {
		textFileOperations.add(textFileOperation);
		return textFileOperation.execute();
	}
}
