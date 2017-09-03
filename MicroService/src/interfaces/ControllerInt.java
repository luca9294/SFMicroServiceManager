package interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface ControllerInt {

	@WebMethod
	/**
	 * Add a new card
	 * @param co
	 * @return
	 */
	public String createMicroservice (String port);
	
	@WebMethod
	/**
	 * Get cards of the customer
	 * @param co
	 * @return
	 */
	public String deleteMicroservice(String container);
	
	@WebMethod
	/**
	 * Get new public key
	 * @param co
	 * @return
	 */
	public String getTest();
}
