package net.uresk.challenges.missingnumber;

public interface MissingNumberFinder {

	/**
	 * This method takes a list of unordered numbers and returns the missing numbers between 1 and upperBound (inclusive). The list may or may not
	 * contain duplicates, as noted by the duplicates flag.
	 * @param numbers
	 * @param upperBound
	 * @param duplicates
	 * @return
	 */
	public int[] findMissingNumbers(int[] numbers, int upperBound, boolean duplicates);
	
}
