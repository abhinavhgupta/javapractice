package com.example.designpatterns.command;

public class ClientTest {

	public static void main(String[] args) {
		TextFileOperationCommand textFileOperationCommand = new TextFileOperationCommand();

		System.out.println(
				textFileOperationCommand.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt"))));

		System.out.println(
				textFileOperationCommand.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt"))));
	}

}
