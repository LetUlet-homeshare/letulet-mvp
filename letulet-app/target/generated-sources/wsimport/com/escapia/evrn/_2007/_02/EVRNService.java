
package com.escapia.evrn._2007._02;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EVRNService", targetNamespace = "http://www.escapia.com/EVRN/2007/02", wsdlLocation = "file:/Users/cedric/Documents/dev/letulet/letulet-app/wsdl/EVRNService.wsdl")
public class EVRNService
    extends Service
{

    private final static URL EVRNSERVICE_WSDL_LOCATION;
    private final static WebServiceException EVRNSERVICE_EXCEPTION;
    private final static QName EVRNSERVICE_QNAME = new QName("http://www.escapia.com/EVRN/2007/02", "EVRNService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/cedric/Documents/dev/letulet/letulet-app/wsdl/EVRNService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EVRNSERVICE_WSDL_LOCATION = url;
        EVRNSERVICE_EXCEPTION = e;
    }

    public EVRNService() {
        super(__getWsdlLocation(), EVRNSERVICE_QNAME);
    }

    public EVRNService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EVRNSERVICE_QNAME, features);
    }

    public EVRNService(URL wsdlLocation) {
        super(wsdlLocation, EVRNSERVICE_QNAME);
    }

    public EVRNService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EVRNSERVICE_QNAME, features);
    }

    public EVRNService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EVRNService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IEVRNService
     */
    @WebEndpoint(name = "BasicHttpBinding_IEVRNService")
    public IEVRNService getBasicHttpBindingIEVRNService() {
        return super.getPort(new QName("http://www.escapia.com/EVRN/2007/02", "BasicHttpBinding_IEVRNService"), IEVRNService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IEVRNService
     */
    @WebEndpoint(name = "BasicHttpBinding_IEVRNService")
    public IEVRNService getBasicHttpBindingIEVRNService(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.escapia.com/EVRN/2007/02", "BasicHttpBinding_IEVRNService"), IEVRNService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EVRNSERVICE_EXCEPTION!= null) {
            throw EVRNSERVICE_EXCEPTION;
        }
        return EVRNSERVICE_WSDL_LOCATION;
    }

}