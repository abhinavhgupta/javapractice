package com.example.designpatterns.behavioral.command;

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
 * The Sender class (aka invoker) is responsible for initiating requests. This
 * class must have a field for storing a reference to a command object. The
 * sender triggers that command instead of sending the request directly to the
 * receiver. Note that the sender isn’t responsible for creating the command
 * object. Usually, it gets a pre-created command from the client via the
 * constructor.
 * 
 * @author abhinav.h.gupta
 *
 */

//Invoker
public class InvokerTextFileCommand {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public String executeOperation() {
		return command.execute();
	}
}
