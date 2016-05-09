package kalenderPackage;

public class Kalender {
	public static int getDaysInMonth1(int month){
		int erg;
		erg = 0;
		
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			erg = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			erg = 30;
			break;
		case 2:
			erg = 28;
			break;		
		}
		
		return erg;		
	}
	public static int getDaysInMonth2(int month, int year){
		int erg;
		erg = 0;
		
		if( (year % 4 == 0)&& !((year % 100 == 0)&& (year % 400 != 0))){
			if(month != 2){
				erg = getDaysInMonth1(month);
			}else{
				erg = 29;
			}
		}else{
			erg = getDaysInMonth1(month);
		}
		
		return erg;
	}
	public static boolean check_date(int day, int month, int year) {
		boolean erg;		
		erg = false;
				
		if((day < 32) && (day > 0) && (month > 0)){			
			if((day <= 29) &&(year % 4 == 0)&& !((year % 100 == 0)&& (year % 400 != 0))){
				erg = true;
			}
		}				
		return erg;
	}	
	public static String convertDate1(int day, int month, int year){
		String erg;
		erg = "";
		
		if(month<1 || day < 1 || month > 12 || day > 31){
			erg = "Tag oder Monat zu klein/groﬂ";
		}
		if(month <0 || day < 0){
			erg = "Monat bzw. Tag ist negativ";
		}
		
		
		
		
		
		if((day > 0)&&(month > 0)&&(month < 13)){
			erg = String.valueOf(day) + " ";			
			switch(month){
				case 1: erg = erg + "Januar ";
				break;
				case 2: erg = erg + "Februar ";
				break;
				case 3: erg = erg + "M‰rz ";
				break;
				case 4: erg = erg + "April ";
				break;
				case 5: erg = erg + "Mai ";
				break;
				case 6: erg = erg + "Juni ";
				break;
				case 7: erg = erg + "Juli ";
				break;
				case 8: erg = erg + "August ";
				break;
				case 9: erg = erg + "September ";
				break;
				case 10: erg = erg + "Oktober ";
				break;
				case 11: erg = erg + "November ";
				break;
				case 12: erg = erg + "Dezember ";
				break;
			}
			erg = erg + String.valueOf(year);
		}
		
		
		if( (year % 4 != 0)&& (day == 29)) {
			
			
			
			erg = "Tag oder Monat zu klein/groﬂ";
		}
		
		
		if((month==2) &&   ((day == 30)||(day == 31))){
			erg = "Tag oder Monat zu klein/groﬂ";
		}
		return erg;
	}
}
