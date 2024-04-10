package Springsecurityrestapi.Restcontroller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class SecurityController {
	@GetMapping("/api/testingsecurity")
	public String getdata() {
		return "Wellcome Spring boot security";
	}
	@GetMapping("/api/binarysearch/{num}")
	public int gbsn(@PathVariable int num) {
		int[] arr1 = {4,2,7,19,14,12,1,9,3,10,32,12};
		return Arrays.binarySearch(arr1, num);
	}
}
