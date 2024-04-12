//Write a class Time with three data members to store hr, min 
//and seconds.Create two constructors and apply checks to set 
//valid time. (hr&lt;24, min&lt;60,sec&lt;60). Also create display
//function which displays all data members.

package assignment3;

public class Time 
{
			int hr, min, sec;
			public Time(int hr, int min, int sec) {
				if (isValid(hr, min, sec) == true) {
					this.hr = hr;
					this.min = min;
					this.sec = sec;
					System.out.println("Time is: hr:min:sec");
				} else {
					System.out.println("Invalid values for time,setting for default values 00:00:00");

				}
			}
			public Time() {
				hr = 0;
				min = 0;
				sec = 0;

			}

			public boolean isValid(int hr, int min, int sec) {
				return (hr >= 0 && hr < 24) && (min >= 0 && min < 60) && (sec >= 0 && sec < 60);
			}

			public void display() {
				System.out.println(hr + ":" + min + ":" + sec);
			}

			public static void main(String[] args) {

//				boolean var = Time.isValid(23, 25, 29);
//				if (var == true) {
//					Time time = new Time(23, 25, 29);
				Time time = new Time(23, 45, 12);
				time.display();

			}
	}


