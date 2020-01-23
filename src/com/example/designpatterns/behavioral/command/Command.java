package com.example.designpatterns.behavioral.command;

@FunctionalInterface
/**
 * Command
 * 
 * The Command interface usually declares just a single method for executing the
 * command.
 * 
 * @author abhinav.h.gupta
 *
 */
public interface Command {
	String execute();
}
