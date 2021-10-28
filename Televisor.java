package meuProjeto;

public class Televisor {
	int volume;
	int channel = 1;
	Boolean power = false;
	int c = 0;
	
	void upVolume() {
		if(volume < 10) {
			volume++;
		}
		else {
			c++;
			if(c == 1) {
				System.out.println("The TV is already at the max. volume.");
			}
		}
	}
	
	int lowerVolume(){
		return volume - 1;
	}
	
	int upChannel() {
		return channel++;
	}
	
	int lowerChannel() {
		return channel - 1;
	}
	
	boolean offTelevisor() {
		return power = false;
	}
	
	boolean onTelevisor() {
		return power = true;
	}
	
	String showStatus() {
		return String.format("Volume: %d / Canal: %d / TV: %b", volume, channel, power);
		
	}
	
}
