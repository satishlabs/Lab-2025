package com.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOpertations {
	public static void main(String[] args) throws IOException {
		List<EmployeeDetails> list1 = readFromFile("C:\\Users\\prasa\\Desktop\\File1.txt");
		List<EmployeeDetails> list2 = readFromFile("C:\\Users\\prasa\\Desktop\\File2.txt");
		
		Map<String, EmployeeDetails> mergedMap = Stream.concat(list1.stream(), list2.stream())
			.collect(Collectors.toMap(EmployeeDetails::getEmpId, e -> e, (e1, e2)->e1));
		//System.out.println(mergedMap);
		
		//Sort by salary
				List<EmployeeDetails> sortedList = mergedMap.values().stream()
			            .sorted(Comparator.comparingDouble(EmployeeDetails::getSalary))
			            .collect(Collectors.toList());
				
					//print sorted merged list
				sortedList.forEach(System.out::println);
	}

	private static List<EmployeeDetails> readFromFile(String fileNmae) throws IOException {
		
		return Files.lines(Paths.get(fileNmae))
				.map(line -> line.split("/"))
				.filter(parts -> parts.length == 4)
				.map(parts -> new EmployeeDetails(
						parts[0].trim(),
						parts[1].trim(),
						Double.parseDouble(parts[2].trim()),
						Integer.parseInt(parts[3].trim())
						))
				.collect(Collectors.toList());
	}
}
