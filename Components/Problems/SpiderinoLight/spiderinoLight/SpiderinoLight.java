package spiderinoLight;

import java.util.Hashtable;

import core.AbstractRepresentation;
import core.AbstractSingleProblem;
import core.XMLFieldEntry;

/**
  * @author Sergii Zhevzhyk
 *
 */
public class SpiderinoLight extends AbstractSingleProblem {

	@Override
	protected double evaluateCandidate(AbstractRepresentation candidate) {
		return 0;
	}

	/* (non-Javadoc)
	 * @see core.AbstractSingleProblem#replayWithVisualization(core.AbstractRepresentation)
	 */
	@Override
	public void replayWithVisualization(AbstractRepresentation candidate) {
	}

	@Override
	public double getMaximumFitness() {
		return Double.MAX_VALUE;
	}
	
	@Override
	public Hashtable<String, XMLFieldEntry> adjustRequirements(
			Hashtable<String, XMLFieldEntry> requirements,
			Hashtable<String, XMLFieldEntry> properties) {

		XMLFieldEntry inputnumber = requirements.get("inputnumber");
		int input = 3;
		
		inputnumber.setValue(Integer.toString(input));

		return requirements;
	}
}
