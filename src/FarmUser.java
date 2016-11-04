/*  SHPE Hackathon 2016 App: Baseline used for "Build a farmer's future" project
    Copyright (C) 2016  Daniel Oliveros

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package Components;

public class FarmUser implements User {
	private int individualID;
	private Job currentJob;
	private String password;
	private double drinkTime, restTime;
	private int madeUpDrinks, madeUpBreaks;
	
	public int getIndividualID() {
		return individualID;
	}	
	public FarmUser(Job job, String password, int[] IDs){
		setID(IDs);
		setPassword(password);
		setCurrentJob(job);
		drinkTime = this.currentJob.getWorkTime()/this.currentJob.getWaterNeeds();
		restTime = this.currentJob.getWorkTime()/this.currentJob.getRestMinutes();
	}
	public Job getCurrentJob() {
		return currentJob;
	}
	public void setCurrentJob(Job newJob) {
		currentJob = new Job(newJob.getRisk(),newJob.getWaterNeeds(),newJob.getRestMinutes());
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public void setID(int[] IDs) {
		if (IDs.length==0){
			this.individualID = 1;
		}
		else this.individualID = IDs[IDs.length-1]+1;
	}
	@Override
	public int getID() {
		return this.individualID;
	}
	@Override
	public int login(String password) {
		if (this.password.equals(password)){
			return 1;
		}
		else return 0;
	}
	public void secondPassed(){
		this.currentJob.increaseElapsedTime();
		sendAlarm(this.currentJob.getElapsedTime());
	}
	public void drinksTaken(int amount){
		madeUpDrinks += (int) (drinkTime*amount);
	}
	public void restHad(int minutes){
		madeUpBreaks += minutes;
	}
	public Integer sendAlarm(int timeElapsed){		
		
		
		return new Integer(-1);
	}

}
