package com.rbhatiya.springbootAWSLamda;

import com.amazonaws.serverless.proxy.internal.testutils.AwsProxyRequestBuilder;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.services.lambda.runtime.Context;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class SpringbootAwsLamdaApplicationTests {

	@Test
	void contextLoads() {
	}

//	@Test
//	void whenTheUsersPathIsInvokedViaLambda_thenShouldReturnAList() throws IOException {
//		ServiceHandler lambdaHandler = new ServiceHandler();
//		Object context = new Object();
//		AwsProxyRequest req = new AwsProxyRequestBuilder("/api/v1/users", "GET").build();
//		AwsProxyResponse resp = lambdaHandler.handleRequest(req, (Context) context);
//		Assertions.assertNotNull(resp.getBody());
//		Assertions.assertEquals(200, resp.getStatusCode());
//	}
}
