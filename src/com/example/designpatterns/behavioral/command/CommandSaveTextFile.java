package com.example.designpatterns.behavioral.command;

/**
 * Concrete Command
 * 
 * Concrete Commands implement various kinds of requests. A concrete command
 * isn’t supposed to perform the work on its own, but rather to pass the call to
 * one of the business logic objects. However, for the sake of simplifying the
 * code, these classes can be merged.
 * 
 * Parameters required to execute a method on a receiving object can be declared
 * as fields in the concrete command. You can make command objects immutable by
 * only allowing the initialization of these fields via the constructor.
 * 
 * @author abhinav.h.gupta
 *
 */
public class CommandSaveTextFile implements Command {

	private ReceiverTextFile receiverTextFile;

	public CommandSaveTextFile(ReceiverTextFile receiverTextFile) {
		this.receiverTextFile = receiverTextFile;
	}

	@Override
	public String execute() {
		return receiverTextFile.save();
	}

}
