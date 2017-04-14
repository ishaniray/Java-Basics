class Time
{
	int hour, min, sec;

	/* Parameterized Constructor */
	Time(int hour, int min, int sec)
	{
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	/* Function to add the current Time object and another Time object */
	void add(Time t)
	{
		int h, m, s;
		h = hour + t.hour;
		m = min + t.min;
		s = sec + t.sec;
		if(s > 59)
		{
			s -= 60;
			m++;
		}
		if(m > 59)
		{
			m -= 60;
			h++;
		}
		System.out.println("The sum of the two times is: " + h + " hours, " + m + " minutes, " + s + " seconds.");
	}
}