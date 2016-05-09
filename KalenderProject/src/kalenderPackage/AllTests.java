package kalenderPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ KalenderTestGetDayInMonth1.class, KalenderTestGetDaysInMonth2.class, KalenderTestCheck_date.class })
public class AllTests {
	
}