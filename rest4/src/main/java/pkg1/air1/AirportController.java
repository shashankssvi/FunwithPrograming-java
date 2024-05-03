package pkg1.air1;

import java.io.File;
import java.time.Instant;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirportController {
	static List<LocalTime> loaddata(String fname)throws Exception{
		List<LocalTime> list1 = new ArrayList<>();
		File f1 = new File(fname);
		Scanner sc1= new Scanner(f1);
		while (sc1.hasNext()) {
			String s1 = sc1.nextLine();
			list1.add(LocalTime.parse(s1));
		}
		return list1;
	}
	@GetMapping("/airport/bus/{ft}/{tt}")
	public String getBus(@PathVariable String ft,@PathVariable int tt) throws Exception {
		List<LocalTime> list1 = new ArrayList<>();
		LocalTime bus = null;
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm");
		LocalDateTime ldt1 = LocalDateTime.parse(ft,dtf1);
		long millis=ldt1.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
		long busdt = tt*60*60*1000;
		long diff = millis-busdt;
		Instant instant = Instant.ofEpochMilli(diff);
		LocalDateTime ldt2 = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		LocalTime lt1 = ldt2.toLocalTime();
		list1= loaddata("airport.txt");
		for (int i =0;i<list1.size();i++) {
			if (list1.get(i).equals(lt1) || list1.get(i).isBefore(lt1)) {
				bus=list1.get(i);
				break;
			}
		}
		return "you have to take a bus before "+ldt2+" and the last bus is at "+bus;
	}
}
