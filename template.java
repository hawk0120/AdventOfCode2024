import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class template {
				public static void main(String[] args) {
								try{ 
												Path filepath = Paths.get("./input.txt");	
												List<String> list = Files.lines(filepath).toList();
												

												list.stream().forEach(c -> System.out.println(c));
												List<Integer> firstColumn = list.stream()
																.map(v -> Integer.valueOf(v.substring(0, 5)))
																.toList();

												firstColumn.stream().forEach(c -> System.out.println(c));
										
												List<Integer> secondColumn = list.stream()
																.map(r -> Integer.valueOf(r.substring(8, 13)))
																.toList();
												secondColumn.stream().forEach(c -> System.out.println(c));

								} catch(Exception e) {
												e.getMessage();
								}

				}

} 
