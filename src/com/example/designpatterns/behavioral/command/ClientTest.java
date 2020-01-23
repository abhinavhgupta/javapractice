package com.example.designpatterns.behavioral.command;

/**
 * Client
 * 
 * The Client creates and configures concrete command objects. The client must
 * pass all of the request parameters, including a receiver instance, into the
 * command’s constructor. After that, the resulting command may be associated
 * with one or multiple senders.
 * 
 * @author abhinav.h.gupta
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		InvokerTextFileCommand invokerTextFileCommand = new InvokerTextFileCommand();

		Command command = new CommandOpenTextFile(new ReceiverTextFile("file1.txt"));
		invokerTextFileCommand.setCommand(command);

		System.out.println(invokerTextFileCommand.executeOperation());

		command = new CommandSaveTextFile(new ReceiverTextFile("file2.txt"));
		invokerTextFileCommand.setCommand(command);

		System.out.println(invokerTextFileCommand.executeOperation());
	}

}
