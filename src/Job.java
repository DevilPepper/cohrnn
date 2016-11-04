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

public class Job {
	private int risk;
	private int waterNeeds;
	private int restMinutes;
	public Job(int risk, int waterNeeds, int restMinutes){
		this.risk = risk;
		this.waterNeeds = waterNeeds;
		this.restMinutes = restMinutes;
	}
	
	/**
	 * Time that has passed
	 */
	private int elapsedTime;
	/**
	 * Time to work for the shift, specified in minutes
	 */
	private int workTime;
	/**
	 * Start job time specified in military time format
	 */
	private int startTime;
	/**
	 * End job time specified in military format
	 */
	private int endTime;
	public int getRisk() {
		return risk;
	}
	public void setRisk(int risk) {
		this.risk = risk;
	}
	public int getWaterNeeds() {
		return waterNeeds;
	}
	public void setWaterNeeds(int waterNeeds) {
		this.waterNeeds = waterNeeds;
	}
	public int getRestMinutes() {
		return restMinutes;
	}
	public void setRestMinutes(int restMinutes) {
		this.restMinutes = restMinutes;
	}
	public double getWorkTime() {
		return workTime;
	}
	public void setWorkTime(){
		if (this.endTime<=this.startTime){
			this.workTime = 0;
		}
		else{
			int hours = (int)(endTime/100 - startTime/100);
			int minutes = (int)(endTime%100 - startTime%100);
			workTime = (hours*60)+(minutes);
		}
	}
	public void increaseElapsedTime(){
		this.elapsedTime++;
	}
	public double getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public double getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
}