package com.formation;

/**
* Troubling Rank Bugs Sample.
*/
public class TroublingRankBugs {

	/**
	 * Empty synchronized.
	 */
	private void emptySynchronized() {
		synchronized (this) {
			System.out.println("bloc non vide");
		}
	}

	/**
	 * Sleep in synchronized.
	 * 
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	private void sleepInSynchronized() throws InterruptedException {
		synchronized (this) {
			Thread.sleep(5000);
		}
	}
}
