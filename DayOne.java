
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static java.lang.Math.abs;


public class DayOne {
				public static void main(String[] args) {
								
								try{ 
												Path filepath = Paths.get("./input.txt");	
												List<String> list = Files.lines(filepath).toList();
							
												int result1 = 0;
												int result2 = 0;
//											list.stream().forEach(c -> System.out.println(c));

												List<Integer> firstColumn = list.stream()
																.map(v -> Integer.valueOf(v.substring(0, 5)))
																.toList();
//											firstColumn.stream().forEach(c -> System.out.println(c));

												List<Integer> secondColumn = list.stream()
																.map(r -> Integer.valueOf(r.substring(8, 13)))
																.toList();
//											secondColumn.stream().forEach(c -> System.out.println(c));

												

											Collections.sort(firstColumn);
											Collections.sort(secondColumn);

													for(int i = 0; i < firstColumn.size(); i++){
																result1 = result1 + abs(firstColumn.get(i) - secondColumn.get(i));
																result2 = result2 + firstColumn.get(i) * Collections.frequency(secondColumn, firstColumn.get(i));

															
												}


												System.out.printf("result1 is: "+ result1);
												System.out.printf("Result2 is: "+ result2);


								} catch(Exception e) {
												e.getMessage();
								}

				}

} 
