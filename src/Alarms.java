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

import java.util.PriorityQueue;

public class Alarms {
	private PriorityQueue <Integer> alarms;
	
	/**
	 * Constucts the Alarms setup
	 * @param An array of alarms coming from the different users, will be organized based on risk and time 
	 */
	public Alarms(int[] input){
		alarms = new PriorityQueue<Integer>(input.length);
		for (int i=0;i<input.length;i++){
			alarms.add(input[i]);
		}
	}
}
