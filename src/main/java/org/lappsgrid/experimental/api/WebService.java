package org.lappsgrid.experimental.api;

/**
 * Interface for all services deployed to the LAPPS grid.
 * <p>
 * A service accepts a JSON object as input and produces a JSON object
 * as output.  The JSON objects must use the LAPPS Interchange Format (LIF)
 * with the <i>discriminator</i> set to one of the LIF query URI.
 * <p>
 * See http://vocab.lappsgrid.org/discriminators.html for a list of all
 * URI used by LAPPS.
 *
 * @author Keith Suderman
 */
public interface WebService
{
	String execute(String input);
}
