package cap2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class F14_ReadFilePom {

	public static void main(String[] args) throws IOException {
		List<String> stringList = Files.lines(Paths.get("pom.xml"))
				.filter(line -> line.contains("name"))
				.map(line -> line.trim().replaceAll("name", "")
						.replaceAll("<","")
						.replaceAll(">", "")
						.replaceAll("/", ""))
				.collect(Collectors.toList());
		System.out.println(stringList);
				

		//for multiply files
//		List<String> stringList = Files.lines(Paths.get("pom.xml", "anotherFileInHere"))
	}

}
