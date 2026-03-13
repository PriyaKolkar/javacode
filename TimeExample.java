package package1;

import java.time.LocalDateTime;

public class TimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Current Date and Time
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current Date & Time: " + currentTime);

        // Past Time (2 days ago)
        LocalDateTime pastTime = currentTime.minusDays(2);
        System.out.println("Past Date & Time (2 days ago): " + pastTime);

        // Future Time (5 days later)
        LocalDateTime futureTime = currentTime.plusDays(5);
        System.out.println("Future Date & Time (5 days later): " + futureTime);
    }
	}


