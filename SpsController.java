package pkg1.sps;

import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class SpsController {
	@GetMapping("/api/sps")
	public String spring() {
		return "Hello";
	}
	@GetMapping("/api/change/{str}")
	public void write(@PathVariable String str) throws IOException {
		FileWriter fw1 = new FileWriter("api_str.txt");
		fw1.write(str);
		fw1.close();
	}
	@GetMapping("/api/get")
	public String get() throws IOException {
		File f1 = new File("api_str.txt");
		Scanner sc1 =new Scanner(f1);
		String text = "";
		while (sc1.hasNext()) {
			text+=sc1.next();
		}
		return text;
	}
}
