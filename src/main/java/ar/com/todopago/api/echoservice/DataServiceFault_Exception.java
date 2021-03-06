
package ar.com.todopago.api.echoservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DataServiceFault", targetNamespace = "http://ws.wso2.org/dataservice")
public class DataServiceFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DataServiceFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DataServiceFault_Exception(String message, DataServiceFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DataServiceFault_Exception(String message, DataServiceFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.wso2.ws.dataservice.DataServiceFault
     */
    public DataServiceFault getFaultInfo() {
        return faultInfo;
    }

}
