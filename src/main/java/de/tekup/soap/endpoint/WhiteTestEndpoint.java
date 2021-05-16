package de.tekup.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import de.tekup.soap.models.whitetest.StudentRequest;
import de.tekup.soap.models.whitetest.WhiteTestResponse;
import de.tekup.soap.service.whiteTestService;

@Endpoint
public class WhiteTestEndpoint {
	
	
		public static final String namespace="http://www.tekup.de/soap/models/whitetest" ; 
	    @Autowired 
	    private whiteTestService service ; 
	
		@ResponsePayload
		@PayloadRoot(namespace = namespace, localPart = "StudentRequest")
		public WhiteTestResponse getwhitetest(@RequestPayload StudentRequest studentRequest) { 
			
			return service.responseWhitetest(studentRequest) ; 
			
		}
		
		
		
		
}


