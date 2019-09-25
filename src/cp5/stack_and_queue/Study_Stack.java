package cp5.stack_and_queue;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Study_Stack {

	public static void main(String[] args) {
		Path path = Paths.get("d:\\data\\projects\\.\\a-project\\..\\another-project");
		System.out.println(path.normalize());

	}

}
