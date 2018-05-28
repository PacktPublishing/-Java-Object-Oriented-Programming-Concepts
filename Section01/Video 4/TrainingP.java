package everythingisanobject;

public class TrainingP {

	public TrainingP(String topic, int hours) {
		this.topic = topic;
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return "topic: \""+this.topic+"\", hours required: "+this.hours;
	}	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TrainingP)
			if(this.topic.equals(((TrainingP) obj).getTopic()))
				return true;
		return false;
	}
	
	public String getTopic(){
		return this.topic;
	}
	public int getHours(){
		return this.hours;
	} 
	
	private String topic;
	private int hours;
}